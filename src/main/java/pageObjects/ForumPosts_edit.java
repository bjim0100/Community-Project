package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForumPosts_edit extends BasePage {
	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "") WebElement button_Forum;
	public @FindBy(xpath = "") WebElement button_MyPost;
	public @FindBy(xpath = "") WebElement button_Edit;
	public @FindBy(xpath = "") WebElement Textfield_topic;
	public @FindBy(xpath = "") WebElement button_Post;

	public ForumPosts_edit() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ForumPosts_edit gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ForumPosts_edit();
	}

	public ForumPosts_edit emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new ForumPosts_edit();
	}

	public ForumPosts_edit clicksLogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new ForumPosts_edit();
	}

	public ForumPosts_edit clicksForum() throws IOException, InterruptedException {
		waitAndClickElement(button_Forum);
		return new ForumPosts_edit();
	}

	public ForumPosts_edit clicksMypost() throws IOException, InterruptedException {
		waitAndClickElement(button_MyPost);
		return new ForumPosts_edit();
	}

	public ForumPosts_edit clicksEdit() throws IOException, InterruptedException {
		waitAndClickElement(button_Edit);
		return new ForumPosts_edit();
	}

	public ForumPosts_edit Changetopic() throws Exception {
		sendKeysToWebElement(Textfield_topic, "");
		return new ForumPosts_edit();
	}

	public ForumPosts_edit clicksPost() throws IOException, InterruptedException {
		waitAndClickElement(button_Post);
		return new ForumPosts_edit();
	}

}
