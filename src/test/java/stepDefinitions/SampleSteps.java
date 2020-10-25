package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class SampleSteps {

	WebDriver driver;
	String url="https://google.co.in";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\Projects\\SampleAutomation\\SampleCucumberFramework\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("url is successfully launched")
	public void url_is_successfully_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to(url);
		Thread.sleep(2000);
	}


	@Then("verify the title of the page \"([^\"]*)\"$")
	public void verify_the_title_of_the_page(String expectedTitle) {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
}
