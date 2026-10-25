package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProccedPage {
	WebDriver driver;
	WebDriverWait wait;
	
	private By proceedButton= By.xpath("//button[text()='Place Order']");
	
	public ProccedPage(WebDriver driver) {
		this.driver= driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	}
	public void proceed() throws Exception {
//		wait.until(ExpectedConditions.elementToBeClickable(proceedButton));
		Thread.sleep(5000);
		driver.findElement(proceedButton).click();
		
	}

}
