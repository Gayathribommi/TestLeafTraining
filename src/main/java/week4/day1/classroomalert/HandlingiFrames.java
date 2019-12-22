package week4.day1.classroomalert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingiFrames {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		
		//go the frame
		driver.switchTo().frame("iframeResult");
		//driver.findElementById("iframeResult").click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//clicking on try it button
		
		driver.findElementByXPath("//button[.='Try it']").click();
		
		//switch to the alert 
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("gayathri");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		WebElement passedvalue = driver.findElementByXPath("//p[contains(text(),'gayathri')]");
if (text.contains("passedvalue")) {
	System.out.println("The text is correct:" + passedvalue);
	
} else {
System.out.println("The text doesnot match");
}
		}
	
		
}

