package tests;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Redbus_Login;
import reusables.CustomsListener;
import utils.DataInputProvider;

public class TC_1 extends CustomsListener {
	
	
	@BeforeClass
	public void setData() {

		browserName = "chrome";
		testCaseName = "Google Search Bar";
		testDescription = "Enter Value in Google Search Bar";
		category = "smoke";
		authors = "Suresh_V";
		dataSheetName = "TC_1";

	}

	// @Test(dataProvider = "file")
	@Test
	public void loginApp() {
		
		Redbus_Login loginPage = PageFactory.initElements(driver, Redbus_Login.class);
		loginPage.enterValueInGoogleBar("Selenium");
	}

}
