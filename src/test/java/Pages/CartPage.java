package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	WebDriverWait wait;
	
	private By cartSymbol = By.xpath("//a[@class='cart-icon']");
	private By checkOut = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	

	public CartPage(WebDriver driver) {
		this.driver= driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void addCart() {
	driver.findElement(cartSymbol).click();
	
	}
	
	public void proccedProcess() {
		wait.until(ExpectedConditions.elementToBeClickable(checkOut)).click();
		
	}


}
