package day4.classroom;

import java.util.List;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//code for specific row to each column 

public class LearnWebTable {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser

		driver.get("https://erail.in/");
		driver.manage().window().maximize();

		WebElement eleSource = driver.findElementByXPath("//input[@id='txtStationFrom']");
		eleSource.clear();
		eleSource.sendKeys("MAS", Keys.TAB);

		WebElement eledestination = driver.findElementByXPath("//input[@id='txtStationTo']");
		eledestination.clear();
		eledestination.sendKeys("SBC", Keys.TAB);
		Thread.sleep(3000);

		driver.findElementById("chkSelectDateOnly").click();
		WebElement eletable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> eleRows = eletable.findElements(By.tagName("tr"));

		for (int i = 0; i < eleRows.size(); i++) {
			List<WebElement> cols = eleRows.get(i).findElements(By.tagName("td"));

			System.out.println(cols.get(1).getText());

		}

	}
}
