package week4.day1.classroomalert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser

		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//click on the button
		
		driver.findElementByXPath("//button[.='Open Multiple Windows']").click();
		
		//get all the windows in a set
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
		//get the size of the windows and print it
		int size = lstWindowHandles.size();
		System.out.println("Size of the windows are:" +size);
		
		//to get the title of second window
		
		driver.switchTo().window(lstWindowHandles.get(1));
		System.out.println(driver.getTitle());
		driver.quit();
		
}
}
