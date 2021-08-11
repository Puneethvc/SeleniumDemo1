package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	@BeforeSuite
	public void setup() {
		System.out.println(" @BeforeSuite---set up system  property to chrome ");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass--- Launch chrome Browser ");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod--- enter URL ");
	}
	
	@BeforeTest
	public void login() {
		System.out.println(" login method ");
	}
	
	@Test
	public void googleTitleTest() {
     System.out.println(" google Title Test  ");
	}
	@Test
	public void searchTest() {
		System.out.println(" search test "); 
	}
	@Test
	public void googleimage() {
		System.out.println(" google image test");
	}
	@Test
	public void documetfile() {
		System.out.println("google documents find");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod--- log out from app ");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println(" delete All cookies ");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass--- close browser");
	}
	
	@AfterSuite
	public void genateTestReport() {
		System.out.println("@AfterSuite---generate test report ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
