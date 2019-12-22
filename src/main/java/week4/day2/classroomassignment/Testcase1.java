package week4.day2.classroomassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser

		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		WebElement emailid = driver.findElementById("email");
		emailid.clear();
		emailid.sendKeys("kumar.testleaf@gmail.com");
		emailid.sendKeys(Keys.TAB);
		WebElement password = driver.findElementById("password");
		password.clear();
		password.sendKeys("leaf@12");
		// login
		driver.findElementByXPath("//button[text()='Log In']").click();

		// mouse hover

		Actions builder = new Actions(driver);
		WebElement vendor = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
		builder.moveToElement(vendor).perform();
		Thread.sleep(3000);
		WebElement srchVendor = driver.findElementByXPath("//a[contains(text(),'Search for Vendor')]");
		builder.click(srchVendor).perform();

		//enter vendor name
		
		WebElement vendorName = driver.findElementById("vendorName");
		vendorName.clear();
		vendorName.sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		// find the country name based on the Vendor
		WebElement vndorName = driver.findElementByXPath("//tbody//tr/td[1]");
		WebElement countryName = driver.findElementByXPath("//tbody//tr/td[5]");
		String text = vndorName.getText();
		
		if (text.contains("Blue Lagoon")) {
			
String countryText = countryName.getText();
			System.out.println("The country name is:" +countryText);
			
			
		} else {
System.out.println("no such vendor name is present");
		}
	
		//System.out.println("the country name for vendor is:" +countryName);
		
//log out of the application		
driver.findElementByXPath("//a[contains(text(),'Log Out')]").click();
System.out.println("Logged out of the application");
driver.close();
	}
}
