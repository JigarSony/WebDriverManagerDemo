package WebDriverManagerDemo.WDMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMMain_FF {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Driver Initialized");
		
		driver.quit();
	}

}

