package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PostPartnership extends BasePage{

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
	
	
	public PostPartnership() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PostPartnership gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new PostPartnership();
		
	}
	
	
	public PostPartnership emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new PostPartnership();
		
	}
	
	public PostPartnership clicksLogin() throws InterruptedException, IOException {
		waitAndClickElement(button_login);
		
		return new PostPartnership();
	}
	
	public PostPartnership clickpartnership() throws IOException, InterruptedException {
		waitAndClickElement(button_partnership);
		return new PostPartnership();
	}
	
	public PostPartnership clickaddpartnership() throws IOException, InterruptedException {
		waitAndClickElement(button_addpartnership);
		return new PostPartnership();
	}
	
	
	
	public PostPartnership businesstitle() throws Exception {
		sendKeysToWebElement(Textfield_businessname, "");
		
		return new PostPartnership();
	}
	
	public PostPartnership businesstype() throws IOException {
		Select select = new Select(button_industry);
		select.selectByIndex(1);
		
		return new PostPartnership();
	}
	public PostPartnership partnershiptype() throws IOException {
		return new PostPartnership();
	}
	

}
