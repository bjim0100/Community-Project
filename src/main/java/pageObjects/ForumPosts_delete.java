package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForumPosts_delete extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "") WebElement button_Forum;
	public @FindBy(xpath = "") WebElement button_MyPost;
	public @FindBy(xpath = "") WebElement button_Delete;
	public @FindBy(xpath = "") WebElement button_Yes;
	
	public ForumPosts_delete() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ForumPosts_delete gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ForumPosts_delete();
	}

	public ForumPosts_delete emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new ForumPosts_delete();
	}

	public ForumPosts_delete clicksLogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new ForumPosts_delete();
	}

	public ForumPosts_delete clicksForum() throws IOException, InterruptedException {
		waitAndClickElement(button_Forum);
		return new ForumPosts_delete();
	}

	public ForumPosts_delete clicksMypost() throws IOException, InterruptedException {
		waitAndClickElement(button_MyPost);
		return new ForumPosts_delete();
	}

	public ForumPosts_delete clicksDelete() throws IOException, InterruptedException {
		waitAndClickElement(button_Delete);
		return new ForumPosts_delete();
	}
	
	public ForumPosts_delete clicksDeletePrompt() throws IOException, InterruptedException {
		waitAndClickElement(button_Yes);
		return new ForumPosts_delete();
	}
	
	
}
