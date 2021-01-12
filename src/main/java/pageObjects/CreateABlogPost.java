package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class CreateABlogPost extends BasePage {

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "") WebElement button_blog;
	public @FindBy(xpath = "") WebElement Textfield_title;
	public @FindBy(xpath = "") WebElement Textfield_category;
	public @FindBy(xpath = "") WebElement Textfield_description;
	public @FindBy(xpath = "") WebElement Textfield_contact;
	public @FindBy(xpath = "") WebElement Textfield_url;
	public @FindBy(xpath = "") WebElement button_addPost;
	public @FindBy(xpath = "") WebElement button_Post;

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

	public CreateABlogPost clicksBLog() throws IOException, InterruptedException {
		waitAndClickElement(button_blog);
		return new CreateABlogPost();

	}

	public CreateABlogPost clicksAddPost() throws IOException, InterruptedException {
		waitAndClickElement(button_addPost);
		return new CreateABlogPost();

	}

	public CreateABlogPost Title(String title) throws Exception {
		sendKeysToWebElement(Textfield_title, title);
		return new CreateABlogPost();

	}

	public CreateABlogPost Category(int category) throws IOException {
		Select select = new Select(Textfield_category);
		select.selectByIndex(category);
		return new CreateABlogPost();

	}

	public CreateABlogPost Description(String description) throws Exception {
		sendKeysToWebElement(Textfield_description, description);
		return new CreateABlogPost();

	}

	public CreateABlogPost Contactdetails(String contact) throws Exception {
		sendKeysToWebElement(Textfield_contact,contact);
		return new CreateABlogPost();

	}

	public CreateABlogPost videoURL(String videoURL) throws Exception {
		sendKeysToWebElement(Textfield_url,videoURL);
		return new CreateABlogPost();

	}
	public CreateABlogPost clickPost() throws Exception {
		waitAndClickElement(button_Post);
		return new CreateABlogPost();

	}
	
	public CreateABlogPost validate() throws Exception {
		String current_url = getDriver().getCurrentUrl();
		String url = "";
		 Assert.assertEquals(current_url, url);
		return new CreateABlogPost();

	}
}
