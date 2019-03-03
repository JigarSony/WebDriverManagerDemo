package WebDriverManagerDemo.WDMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WDM_FF_Testng {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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
