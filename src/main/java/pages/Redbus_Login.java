package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import reusables.CustomsListener;

public class Redbus_Login extends CustomsListener {

	@FindBy(id = "signin-block")
	public WebElement w_signInBlock;

	@FindBy(id = "signInLink")
	public WebElement w_signInLink;

	@FindBy(id = "customBtn")
	public WebElement w_customBtn;

	@FindBy(name = "q")
	public WebElement w_googleSearchBar;

	public Redbus_Login(RemoteWebDriver driver) {

		this.driver = driver;
	}

	public Redbus_Login clickCustomBtn() {

		try {
			w_customBtn.click();
		} catch (Exception e) {
			reportStep("Unable to click the element" + w_customBtn, "FAIL");
		}
		return this;

	}

	public Redbus_Login clickSigninLnk() {

		try {
			w_signInLink.click();
		} catch (Exception e) {
			reportStep("Unable to click the element" + w_signInLink, "FAIL");
		}
		return this;

	}

	public Redbus_Login clickSigninBlock() {

		try {
			w_signInBlock.click();
		} catch (Exception e) {
			reportStep("Unable to click the element" + w_signInBlock, "FAIL");
		}
		return this;

	}

	public void enterValueInGoogleBar(String value) {

		try {
			if (w_googleSearchBar.isEnabled()) {
				w_googleSearchBar.sendKeys(value);
				reportStep("Value [" + value + "]  entered successfully", "PASS");
			}

		} catch (Exception e) {
			reportStep("Unable to click the element" + w_signInBlock, "FAIL");
		}

	}
}
