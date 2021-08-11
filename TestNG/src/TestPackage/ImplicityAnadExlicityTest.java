package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityAnadExlicityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com"); 
	
	WebElement firstname = driver.findElement(By.name("first name"));
	WebElement lastname  = driver.findElement(By.name("lastname"));
	WebElement mobileNum = driver.findElement(By.name("reg.email__"));
	WebElement password = driver.findElement(By.name("reg__passwd")); 
			
	sendKeys(driver, firstname, 10, "tomm");
	sendKeys( driver, lastname, 5, "flixx");
	sendKeys(driver, mobileNum, 4, "1234567890");
	sendKeys(driver, password, 23, "test1234");
	

	}
	
	public static void sendKeys( WebDriver driver, WebElement element, int timeout, String volume)
	{
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(volume);
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
