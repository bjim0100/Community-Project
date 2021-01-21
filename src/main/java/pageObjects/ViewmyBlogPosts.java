package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewmyBlogPosts extends BasePage{
	
	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//div[@id='__next']/div[2]/div/div/div/div/div[2]/div[4]/a/span") WebElement button_blog;
	public @FindBy(xpath = "(//a[contains(text(),'View my Post')])[2]") WebElement button_viewpost;
	
	
	
	public ViewmyBlogPosts() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ViewmyBlogPosts gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ViewmyBlogPosts();
	}

	public ViewmyBlogPosts emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "testing.amalitech@gmail.com");
		sendKeysToWebElement(Textfield_password, "12345678!Aa");
		return new ViewmyBlogPosts();
	}

	public ViewmyBlogPosts clicksLogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new ViewmyBlogPosts();
	}
	
	public ViewmyBlogPosts clicksBLog() throws IOException, InterruptedException {
		waitAndClickElement(button_blog);
		return new ViewmyBlogPosts();
		
	}
	
	public ViewmyBlogPosts clicksViewPost() throws IOException, InterruptedException {
		waitAndClickElement(button_viewpost);
		return new ViewmyBlogPosts();
		
	}
	
	public ViewmyBlogPosts Validation() throws IOException {
		
		String current_url =getDriver().getCurrentUrl();
		String url = "http://20.52.44.20/businessprofile";
		Assert.assertEquals(url, current_url);
		return new ViewmyBlogPosts();
		
	}


}
