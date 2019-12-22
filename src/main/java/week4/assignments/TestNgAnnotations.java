package week4.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	public ChromeDriver driver;

  @BeforeMethod
  public void f() {
	  
	// Set the property for ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			// Initiate the ChromeBroswer
 driver = new ChromeDriver();
			// Maximize the browser
			driver.manage().window().maximize();

			driver.get("http://leaftaps.com/opentaps/control/main");

			// Enter the UserName
			driver.findElementById("username").sendKeys("DemoSalesManager");

			// Enter the Password
			WebElement password = driver.findElementById("password");
			password.sendKeys("crmsfa");

			// Click on Login Button
			driver.findElementByClassName("decorativeSubmit").click();

			// Click on crm/sfa button
			driver.findElementByLinkText("CRM/SFA").click();


  }
  @AfterMethod
  
  public void logout() {
//		Close the browser (Do not log out)
		driver.close();

  }
}
