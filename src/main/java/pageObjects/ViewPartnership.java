package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewPartnership extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]") WebElement button_partnership;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]") WebElement button_addpartnership;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_businessname;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement button_industry;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_location;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_description;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement button_typeofpartnership;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_formemail;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_phonenumber;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement button_save;
	
	public ViewPartnership() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ViewBusinessProfile gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ViewBusinessProfile();
		
	}
	
	
	public ViewBusinessProfile emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new ViewBusinessProfile();
		
	}
	
	public ViewBusinessProfile clicksLogin() throws InterruptedException, IOException {
		waitAndClickElement(button_login);
		
		return new ViewBusinessProfile();
	}
	
	public ViewBusinessProfile clickpartnership() throws IOException, InterruptedException {
		waitAndClickElement(button_partnership);
		return new ViewBusinessProfile();
	}
	
	
	
	public ViewBusinessProfile businesstitle() throws IOException {
		getDriver().get("");
		return new ViewBusinessProfile();
	}
	
	public ViewBusinessProfile validate() throws IOException {
		String current_url =getDriver().getCurrentUrl();
		String url = "";
		Assert.assertEquals(url, current_url);
		return new ViewBusinessProfile();
	}
	
	
}
