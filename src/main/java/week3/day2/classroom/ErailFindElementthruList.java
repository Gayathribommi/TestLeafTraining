package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailFindElementthruList {

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

		// driver.findElementById("chkSelectDateOnly").click();
		List<WebElement> eletable = driver
				.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");

		System.out.println("The current size of the columns are:" + eletable.size());

		Set<String> setTrains = new TreeSet<>();
		for (WebElement eachelement : eletable) {
			String eachTrainName = eachelement.getText();
			System.out.println(eachTrainName);

			setTrains.add(eachelement.getText());
		}
		if (setTrains.size() == eletable.size()) {
			System.out.println("There are no duplicates");

		} else {
			System.out.println("There are duplicates in the train name and the size is: " + setTrains.size());

		}

	}

}
