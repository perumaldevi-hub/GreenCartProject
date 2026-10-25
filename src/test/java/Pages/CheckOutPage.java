package Pages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	WebDriver driver;
	WebDriverWait wait;
	
	private By selectCountry= By.tagName("select");
	private By checkBox = By.xpath("//input[@type='checkbox']");
	private By process= By.xpath("//input[@type='checkbox']");
	
	public CheckOutPage(WebDriver driver) {
		this.driver= driver;
		this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
	public void countrySelection() {
		WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountry));
		
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
	}
	public void clickCheckBox() {
		driver.findElement(checkBox);
	}
	public void completeProcess() {
		driver.findElement(process);
		takeScreenshot("Check out");
	}
	
	public void takeScreenshot(String fileName) {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File source = screenshot.getScreenshotAs(OutputType.FILE);

		File destination = new File("screenshots/" + fileName + ".png");

		destination.getParentFile().mkdirs();

		try {
			Files.copy(source.toPath(), destination.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);

			System.out.println("Screenshot saved: " + destination.getAbsolutePath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
