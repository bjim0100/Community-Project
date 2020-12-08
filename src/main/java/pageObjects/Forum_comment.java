package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forum_comment extends BasePage{

	

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "") WebElement button_Forum;
	public @FindBy(xpath = "") WebElement Textfield_comment;
	
	public @FindBy(xpath = "") WebElement button_Post;
	
	public Forum_comment() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Forum_comment gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new Forum_comment();
	}

	public Forum_comment emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new Forum_comment();
	}

	public Forum_comment clicksLogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new Forum_comment();
	}

	public Forum_comment clicksForum() throws IOException, InterruptedException {
		waitAndClickElement(button_Forum);
		return new Forum_comment();
	}
	public Forum_comment submitscomment() throws IOException, InterruptedException {
		waitAndClickElement(Textfield_comment);
		return new Forum_comment();
	}
	
	public Forum_comment clickPost() throws IOException, InterruptedException {
		waitAndClickElement(button_Post);
		return new Forum_comment();
	}
	
	

}
