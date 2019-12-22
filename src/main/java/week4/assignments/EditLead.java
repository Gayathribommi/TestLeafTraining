package week4.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {

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

//		Click Leads link
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
//		Click Find leads
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
//		Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gayathri");
//		Click Find leads button
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(3000);
//		Click on first resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
//		Verify title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is: " + title);
//		Click Edit
		driver.findElementByXPath("//a[text()='Edit']").click();
//		Change the company name
		WebElement enterCompny = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		enterCompny.clear();
		enterCompny.sendKeys("Amazon");
//		Click Update
		driver.findElementByXPath("//input[@value='Update']").click();
//		Confirm the changed name appears
		String chanedNme = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if (chanedNme.equalsIgnoreCase("Amazon")) {
			System.out.println("The changed name appears in the lead page");

		} else {
			System.out.println("The changed name doesnot appear in the lead page");
		}
//		Close the browser (Do not log out)
		driver.close();

	}

}
