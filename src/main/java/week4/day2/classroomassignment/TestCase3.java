package week4.day2.classroomassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser

		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		// click on start your journey

		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']//div[4]").click();
		driver.findElementByXPath("//button[.='Next']").click();
		System.out.println("Clicked on Next button");
		// specify the start date as tomorrow date

		driver.findElementByXPath("//div[@class='day picked ']//following-sibling::div").click();
		driver.findElementByXPath("//button[.='Next']").click();

		// Confirm the Start Date and Click on the Done button

		driver.findElementByXPath("//button[.='Done']").click();

		// find the number of cars present in the results page
		System.out.println("We are in results page");

		List<WebElement> carDetails = driver.findElementsByXPath("//div[@class='car-list-layout']/div");
		Thread.sleep(3000);
		for (int i = 1; i <= carDetails.size(); i++) {
WebElement findElementByXPath = driver.findElementByXPath("(//div[@class='details'])[1]//h3");
			
			/*
			 * String text = carDetails.get(i).getText(); System.out.println(text);
			 */

		}

	}

}