package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestDemo {
		
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		}
	
		@Test(priority=1,groups="Title")
		public void googleTitleTest() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		@Test(priority=2,groups="logo")
		public void googleLogoTest() {
			boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		}
		
		@Test(priority=3,groups="Link test")
		public void mialLinkTest() {
			boolean b = driver.findElement(By.linkText(" mail")).isDisplayed();
		}
		
		
		
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	
}
