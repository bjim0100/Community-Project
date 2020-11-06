package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageOrg extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	
	
	
	public LandingPageOrg() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public LandingPageOrg goTopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new LandingPageOrg();
		
	}
	
	public LandingPageOrg email() throws Exception {
		
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		return new LandingPageOrg();
	}
	
	public LandingPageOrg password() throws Exception {
		
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new LandingPageOrg();
	}
	
	public LandingPageOrg clicklogin() throws Exception {
		waitAndClickElement(button_login);
		return new LandingPageOrg();
		
		
	}
	
	public LandingPageOrg profilepage() throws Exception {
		Thread.sleep(5000);
		String current_url =getDriver().getCurrentUrl();
		String url = "http://20.52.44.20/businessprofile";
		Assert.assertEquals(url, current_url);
		return new LandingPageOrg();
	}
}
