package selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LearningAutomation  {
	
	
	public WebDriver driver;
	SamplePage sp;
	@Test
	public void searchValueInGoogle() {

		try {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			System.out.println("Launch Driver");
			driver.get("https://www.google.co.in/");
			Thread.sleep(2000);
			sp = PageFactory.initElements(driver, SamplePage.class);
			sp.enterValueInGoogleBar("Seleium");
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
