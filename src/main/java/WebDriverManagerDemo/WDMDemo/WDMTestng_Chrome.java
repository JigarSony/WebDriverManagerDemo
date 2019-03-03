package WebDriverManagerDemo.WDMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMTestng_Chrome {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().version("2.45").setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	
	@Test
	public void driverTest() {
		System.out.println("Driver Initialized");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
