
package week5.classroomtestng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import week4.assignments.TestNgAnnotations;
public class CreateLead extends TestNgAnnotations {
	@Test
 
	public void createLead() throws InterruptedException {

				// Click on Leads
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();

		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name

		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");

		// Enter First Name
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Gayathri");
		// Enter Last Name
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Bommi");
//Enter First Name(Local)

		driver.findElementByXPath("//input[@name='firstNameLocal']").sendKeys("Mindtree");
//Enter Last Name(Local)
		driver.findElementByXPath("//input[@name='lastNameLocal']").sendKeys("ltd");
//Enter Salutation
		driver.findElementByXPath("//input[@name='personalTitle']").sendKeys("Mrs.");

//Choose Source

		Select dropdownSource = new Select(driver.findElementByXPath("//select[@name='dataSourceId']"));
		dropdownSource.selectByValue("LEAD_WORDOFMOUTH");
		
		System.out.println("The source dropdown has LEAD_EMPLOYEE selected");

//Enter Title
		driver.findElementByXPath("//input[@name='generalProfTitle']").sendKeys("Test Specialist");

//Enter Annual Revenue
		driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("10");

//Choose Industry
		WebElement industryDropdown = driver.findElementByXPath("//select[@name='industryEnumId']");

		Select dropdownIndustry = new Select(industryDropdown);

		dropdownIndustry.selectByValue("IND_SOFTWARE");

		System.out.println("Selected value for INdustry dropdown is:IND_SOFTWARE");
//Choose Ownership

		WebElement ownershipDropdown = driver.findElementByXPath("//select[@name='ownershipEnumId']");

		Select dropdownOwnership = new Select(industryDropdown);

		dropdownOwnership.selectByIndex(0);
		System.out.println("value = OWN_PROPRIETOR should be selected");

//Enter SIC Code
		driver.findElementByXPath("//input[@id='createLeadForm_sicCode']").sendKeys("abc");

//Enter Description
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']")
				.sendKeys("Creating a sample lead to verify the scripts");

//Enter Important Note
		driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote']").sendKeys("important lead role 1");

//Enter Country Code
		WebElement inputCountryCode = driver
				.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']");
		inputCountryCode.clear();
		inputCountryCode.click();

//Enter Area Code
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("9");

//Enter Extension
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("044");

//EnterDepartment
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("Testing");

//Choose Preferred Currency

		Select dropdownCurrency = new Select(driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']"));

		dropdownCurrency.selectByVisibleText("ARA - Argentinian Austral");
		
		System.out.println("The selected value from the dropdown is ARA - Argentinian Austral");

//Enter Number Of Employees
		driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("25000");

//Enter Ticker Symbol
		driver.findElementByXPath("//input[@name='tickerSymbol']").sendKeys("Yes");

//Enter Person to Ask For
		driver.findElementByXPath("//input[@name='primaryPhoneAskForName']").sendKeys("name");
//Enter Web Url
		driver.findElementByXPath("//input[@name='primaryWebUrl']").sendKeys("gmail");

//Enter To Name
		driver.findElementByXPath("//input[@name='generalToName']").sendKeys("gayathri");
//Enter Address Line 1 and 2
		driver.findElementByXPath("//input[@name='generalAddress1']").sendKeys("abirami flats");
		driver.findElementByXPath("//input[@name='generalAddress2']").sendKeys("4th street");

//Enter City
		driver.findElementByXPath("//input[@name='generalCity']").sendKeys("chennai");

//Choose State/Province
		Select dropdownState = new Select(driver.findElementByXPath("//select[@name='generalStateProvinceGeoId']"));
		dropdownState.selectByVisibleText("Maine");
//Choose Country
		
		Select dropdownCountry = new Select(driver.findElementByXPath("//select[@name='generalCountryGeoId']"));
		dropdownCountry.selectByValue("IND");
//Enter Zip/Postal Code
		driver.findElementByXPath("//input[@name='generalPostalCode']").sendKeys("600");

//Enter Zip/Postal Code Extension
		driver.findElementByXPath("//input[@name='generalPostalCodeExt']").sendKeys("091");

//Choose Marketing Campaign

//Enter phone number
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("029179");

//Enter email address
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("gayathri945@gmail.com");

//Click Create lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();
//Verify the first name
		
		String firstNameText = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		System.out.println("First name present in Create lead page is :" + firstNameText);
		
		if (firstNameText.equals("Gayathri")) {
			System.out.println("Verified the first name successfully");
			
		} else {
			System.out.println("The name present doesnot  match");

		}
		

	}
}
