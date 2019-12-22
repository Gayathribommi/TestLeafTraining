package week5.classroomtestng;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week4.assignments.TestNgAnnotations;

public class MergeLead  {
	@Test
	public void mergeLead() throws InterruptedException {

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

//		Click Merge leads
		driver.findElementByXPath("//a[contains(text(),'Merge Leads')]").click();
//		Click on Icon near From Lead
		driver.findElementByXPath("(//span[contains(text(),'From Lead')]//parent::node()//following::a)[1]").click();
//		Move to new window
		Set<String> wndw = driver.getWindowHandles();
		List<String> lstwndw = new ArrayList<String>(wndw);
		String window = lstwndw.get(1);
		driver.switchTo().window(window);
		
//		Enter Lead ID
		driver.findElementByXPath("(//label[contains(text(),'Lead ID:')]//following::div/input)[1]").sendKeys("1005");
//		Click Find Leads button
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
//		Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").click();
		Thread.sleep(2000);

//		Switch back to primary window
		driver.switchTo().window(lstwndw.get(0));
		
		System.out.println("User is in parent window after To Lead actions");
		
//		Click on Icon near To Lead
		driver.findElementByXPath("(//span[contains(text(),'To Lead')]//parent::node()//following::a)[1]").click();

		
//		Move to new window
		Set<String> scndwndw = driver.getWindowHandles();
		List<String> lstwndws = new ArrayList<String>(scndwndw);
		
		driver.switchTo().window(lstwndws.get(1));
		System.out.println("USer is in another window");
		
//		Enter Lead ID
		driver.findElementByXPath("(//label[contains(text(),'Lead ID:')]//following::div/input)[1]").sendKeys("1005");

//		Click Find Leads button
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);

//		Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").click();
		Thread.sleep(2000);

//		Switch back to primary window
		driver.switchTo().window(lstwndws.get(0));
		System.out.println("User is in parent window after To lead actions");

//		Click Merge
		driver.findElementByXPath("(//a[contains(text(),'Merge')])[2]").click();
		
//		Accept Alert
		driver.switchTo().alert().accept();
//		Click Find Leads link
//		Enter From Lead ID
//		Click Find Leads button
//		Verify message "No records to display" in the Lead List. This message confirms that the successful merge of leads
//		Close the browser (Do not log out)

	}
}
