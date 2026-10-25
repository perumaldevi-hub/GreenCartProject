package Test;

import org.testng.annotations.Test;

import BaseTest.Base_URL_Launch;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.ProccedPage;
import Pages.ProductPage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Test1 extends Base_URL_Launch {

	@Test
	public void greenKartCompleteProcess() throws Exception {

		ProductPage vegetable = new ProductPage(driver);
		vegetable.product("Brocoli");
		vegetable.no_Of_Product("Quantity 1");
		vegetable.addCart("Added");

		CartPage cart = new CartPage(driver);
		cart.addCart();
		cart.proccedProcess();

		ProccedPage proceed = new ProccedPage(driver);
		proceed.proceed();

		CheckOutPage checkOut = new CheckOutPage(driver);
		checkOut.countrySelection();
		checkOut.clickCheckBox();
		checkOut.completeProcess();
	}

	
}
