package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadS {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

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

		// Click on Leads
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();

		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name

		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		// Enter First Name
driver.findElementByName("firstName").sendKeys("Gayathri");
		// Enter Last Name
driver.findElementByName("lastName").sendKeys("Bommi");
		// Click on Create Lead (Submit) button
driver.findElementByName("submitButton").click();

		// Verify the Lead is created by checking the Company or First Name

	}

}
