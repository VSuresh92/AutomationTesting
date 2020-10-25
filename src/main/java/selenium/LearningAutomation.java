package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearningAutomation {

	public WebDriver driver;
	JavascriptExecutor jse;
	SamplePage sp;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		System.out.println("Launch Driver");
	}

	@Test
	public void searchValueInGoogle() {

		try {

			driver.get("https://www.google.co.in/");
			Thread.sleep(2000);
			jse = (JavascriptExecutor) driver;
			// Get domain, URL and title using Java Script Executor
			System.out.println(jse.executeScript("return document.domain;").toString());
			System.out.println(jse.executeScript("return document.URL;").toString());
			System.out.println(jse.executeScript("return document.title;").toString());

			sp = PageFactory.initElements(driver, SamplePage.class);
			sp.enterValueInGoogleBar("Seleium" + "\n");
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
