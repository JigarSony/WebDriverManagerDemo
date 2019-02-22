package WebDriverManagerDemo.WDMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMMain {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().version("2.45").setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Driver Initialized");
		
		driver.quit();
	}

}
