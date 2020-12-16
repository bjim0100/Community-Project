package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forum_comment extends BasePage{

	

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[4]/span[1]") WebElement button_Forum;
	public @FindBy(xpath = "//div[@id='headingOne']/div/div[5]/a/span") WebElement Textfield_comment;
	
	public @FindBy(xpath = "//button[contains(.,'Comment')]") WebElement button_Post;
	
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
		Thread.sleep(5000);
		waitAndClickElement(button_Forum);
		return new Forum_comment();
	}
	public Forum_comment submitscomment() throws IOException, InterruptedException {
		waitAndClickElement(Textfield_comment);
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/input[1]")).sendKeys("Godsway");
		return new Forum_comment();
	}
	
	public Forum_comment clickPost() throws IOException, InterruptedException {
		waitAndClickElement(button_Post);
		return new Forum_comment();
	}
	
	

}
