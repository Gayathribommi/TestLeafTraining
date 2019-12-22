package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

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
		driver.findElementById("password").sendKeys("crmsfa");

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
driver.findElementById("createLeadForm_firstName").sendKeys("Gayathri");
		// Enter Last Name
driver.findElementById("createLeadForm_lastName").sendKeys("Bommi");

		// Select 'Source' as 'Other' (Handling DropDown)

WebElement dropDownSource = driver.findElementById("createLeadForm_dataSourceId");
Select ddsource = new Select(dropDownSource);
ddsource.selectByValue("LEAD_OTHER");

		// Select 'Preferred Currency' as 'INR'

WebElement dropDownCurrency = driver.findElementById("createLeadForm_currencyUomId");

Select ddCurrency = new Select(dropDownCurrency);
ddCurrency.selectByVisibleText("INR - Indian Rupee");


//select industry

WebElement dropDownIndustry = driver.findElementById("createLeadForm_industryEnumId");

Select ddIndustry = new Select(dropDownIndustry);
List<WebElement> options = ddIndustry.getOptions();
int i = options.size();
ddIndustry.deselectByIndex(i-1);


		// Click on Create Lead (Submit) button
driver.findElementByClassName("smallSubmit");


		// Verify the Lead is created by checking the Company or First Name

//selecting the dropdowns
WebElement dd1 = driver.findElementByXPath("//select[@id='dropdown1']");
Select dropdown1 = new Select(dd1);
dropdown1.selectByVisibleText("Appium");
dropdown1.selectByIndex(4);
dropdown1.selectByValue("4");


	}
	
//	//Button page
//	//button[text()='Go to Home Page']
//	//button[@id='position']
//	//button[contains(text(),'What color am I?')]
//	//button[contains(text(),'What is my size?')]
//	(//a[text()[contains(.,'Go to Home Page')]])[1]
//			//a[text()[contains(.,'Find where am supposed to go without clicking me?')]]
//			//a[text()[contains(.,'How many links are available in this page?')]]
//

	

}
