package week4.day2.classroomassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement enterText = driver.findElementByXPath("//input[@id='twotabsearchtextbox']");
		enterText.sendKeys("oneplus 7 pro mobiles");
		WebElement enter = driver.findElementByXPath("//input[@value='Go']");
		enter.sendKeys(Keys.ENTER);
		
		//print the price of the first price
		WebElement firstPrice = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]");
		String textPrice = firstPrice.getText();
		System.out.println("The value of the first mobile price is:" +textPrice);
		
		//click on first image mobile
		driver.findElementByXPath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]").click();
		System.out.println("clicked on first mobile image");
		
		//switch to the window
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
		//get the size of the windows and print it
		int size = lstWindowHandles.size();
		System.out.println("Size of the windows are:" +size);
		
		//to get the title of second window
		
		driver.switchTo().window(lstWindowHandles.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//print the number of customer rating
		WebElement customerRating = driver.findElementByXPath("//span[@id='acrCustomerReviewText']");
		String text = customerRating.getText();
		System.out.println("The customer rating are:" +text);

		//click add to cart
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		
		//confirm the text in added to cart
		
		WebElement cartElement = driver.findElementByXPath("//div[@class='a-box-inner']//div[2]/div/div/div//h1");
		String successTextCart = cartElement.getText();
		System.out.println(successTextCart);
		
		//proceed to buy
		
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native-bottom']").click();
		System.out.println("Clicked on add to cart");
		
		
		//confirm the title is amazon signin
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		
		//click on continue
		
		driver.findElementByXPath("//input[@id='continue']").click();
		WebElement textElement = driver.findElementByXPath("//div[contains(text(),'Enter your email or mobile phone number')]");
		String errorText = textElement.getText();
		
		System.out.println("Verified the message successfully: " + errorText);
		
		driver.quit();
	}

}
