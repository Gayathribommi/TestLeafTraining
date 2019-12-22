package wee5.day2.classroomtestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	public ChromeDriver driver;

  @BeforeMethod
  @Parameters({"url","userName","password"})
  public void launchBrowser(String url,String user, String pswrd ) {
	  
	// Set the property for ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			// Initiate the ChromeBroswer
 driver = new ChromeDriver();
			// Maximize the browser
			driver.manage().window().maximize();

			driver.get(url);

			// Enter the UserName
			driver.findElementById("userName").sendKeys(user);

			// Enter the Password
			WebElement password = driver.findElementById(pswrd);
			password.sendKeys(pswrd);

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
