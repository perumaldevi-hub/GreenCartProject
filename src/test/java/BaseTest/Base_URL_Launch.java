package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_URL_Launch {
	
	protected WebDriver driver;
	
	@BeforeClass
	// Launch Base URL
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String name = driver.getTitle();
		System.out.println("The URL is:"+name);
		
		
		
	}
	
	@AfterClass
	
	public void tearDown() {
		driver.quit();
	}

}
