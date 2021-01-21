package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class CreateABlogPost extends BasePage {

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//div[@id='__next']/div[2]/div/div/div/div/div[2]/div[4]/a/span") WebElement button_blog;
	public @FindBy(xpath = "//input[@id='blog_topic']") WebElement Textfield_title;
	public @FindBy(xpath = "//select[@id='blog_category']") WebElement Textfield_category;
	public @FindBy(css = "#tinymce") WebElement Textfield_description;
	public @FindBy(xpath = "//input[@id='blog_contact_details']") WebElement Textfield_contact;
	public @FindBy(xpath = "(//input[@id='blog_topic'])[2]") WebElement Textfield_url;
	public @FindBy(xpath = "//a[contains(text(),'Add post')]") WebElement button_addPost;
	public @FindBy(xpath = "//div[@id='__next']/div[2]/div/div[2]/form/div[2]/div/button") WebElement button_Post;
	
	

	public CreateABlogPost() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateABlogPost gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new CreateABlogPost();
	}

	public CreateABlogPost emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "testing.amalitech@gmail.com");
		sendKeysToWebElement(Textfield_password, "12345678!Aa");
		return new CreateABlogPost();
	}

	public CreateABlogPost clicksLogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new CreateABlogPost();
	}

	public CreateABlogPost clicksBLog() throws IOException, InterruptedException {
		Thread.sleep(5000);
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
		Thread.sleep(30000);
		//sendKeysToWebElement(Textfield_description, description);
		driver.switchTo().frame(0);
		WebElement el  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(el).perform();
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys("Lorep ipsium");
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
		Thread.sleep(5000);
		//waitAndClickElement(button_Post);
		getDriver().findElement(By.cssSelector("#blog_save_btn")).click();
		getDriver().findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		return new CreateABlogPost();

	}
	
	public CreateABlogPost validate() throws Exception {
		String current_url = getDriver().getCurrentUrl();
		String url = "http://20.52.44.20/blog/viewmyblogpost";
		 Assert.assertEquals(current_url, url);
		return new CreateABlogPost();

	}
}
