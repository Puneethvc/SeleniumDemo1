package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcepionTimeOutTest {
	public static void main(String[] args) {
		
	

//	@Test(invocationtimetOut=2,expectedExceptions=NumberFormatException,class)
//	public void infintLoopTest(){
//	int i = 1;
//	while(i == 1) {
//		System.out.println(i);
//	}
//	}	
//@Test(expectedExceptions=NumberFormatException.class)
//  public void test1() {
//	String X = "100A";
//	Integer.parseInt(X);

		
		WebDriverManager.chromedriver.setup();
		WebDriver driver = new ChromeDriver();
		
}
}






