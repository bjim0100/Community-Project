package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateABlogPost extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "") WebElement button_blog;
	public @FindBy(xpath = "") WebElement button_addPost;
	
	
	
	
	public CreateABlogPost() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CreateABlogPost gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new CreateABlogPost();
	}

	public CreateABlogPost emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new CreateABlogPost();
	}

	public CreateABlogPost clicksLogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new CreateABlogPost();
	}
	
	public CreateABlogPost clicksBLog() throws IOException {
		
		return new CreateABlogPost();
		
	}

}
