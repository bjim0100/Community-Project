package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewPartnership extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]") WebElement button_partnership;
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
		sendKeysToWebElement(Textfield_email, "aa@individual.com");
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
		getDriver().get("http://20.52.44.20/partnership/details/26b492fc?pid=26b492fc&access=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNjA2NzI3NjcwLCJqdGkiOiIyMzM5NmFmZWE4ZjA0"
				+ "NmQ3YjQzYWU1M2NmYTViODllNiIsInVzZXJfaWQiOjE1Nn0.MK3K8A19BkqdYqFO1no62RSUSnx12MGupPtZR2ADEZ4");
		return new ViewBusinessProfile();
	}
	
	public ViewBusinessProfile validate() throws IOException {
		String current_url =getDriver().getCurrentUrl();
		String url = "http://20.52.44.20/partnership/details/26b492fc?pid=26b492fc&access=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0b2tlbl90eXBlIjoiYWNjZXNzIiwiZXhwIjoxNjA2NzI3NjcwLCJqdGkiOiIyMzM5NmFmZWE4ZjA0NmQ"
				+ "3YjQzYWU1M2NmYTViODllNiIsInVzZXJfaWQiOjE1Nn0.MK3K8A19BkqdYqFO1no62RSUSnx12MGupPtZR2ADEZ4";
		Assert.assertEquals(url, current_url);
		return new ViewBusinessProfile();
	}
	
	
}
