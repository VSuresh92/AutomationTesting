package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reusables.CustomsListener;

public class SamplePage extends CustomsListener{
	
	WebDriver driver;
	@FindBy(name = "q")
	public WebElement w_googleSearchBar;
	
	public SamplePage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterValueInGoogleBar(String value) {

		try {
				if(w_googleSearchBar.isEnabled()) {
					w_googleSearchBar.sendKeys(value);
				}

		} catch (Exception e) {
		}

	}

}
