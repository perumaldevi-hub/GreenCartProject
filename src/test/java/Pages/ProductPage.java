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
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver driver;
	WebDriverWait wait;

	private By sel_product = By.xpath("//a[@class='increment']");
	private By inc_quantity = By.xpath("//a[@class='increment']");
	private By add_button = By.xpath("(//button[text()= 'ADD TO CART'])[1]");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void product(String ProductName) {
		driver.findElement(sel_product);

	}

	public void no_Of_Product(String Quantity) {
		driver.findElement(inc_quantity);

	}

	public void addCart(String CartButton) {
		driver.findElement(add_button).click();
		takeScreenshot("product add");
//	Select.click();
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
