package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewBusinessProfile extends BasePage{
	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[6]/span[1]") WebElement button_members;
	public @FindBy(xpath = "//span[contains(text(),'Kimasod Ent')]") WebElement button_OrgInfo;
	
	
	
	
	public ViewBusinessProfile() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ViewBusinessProfile gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ViewBusinessProfile();
		
	}
	
	public ViewBusinessProfile emailandpassword() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new ViewBusinessProfile();
	}
	public ViewBusinessProfile clicklogin() throws Exception {
		waitAndClickElement(button_login);
		return new ViewBusinessProfile();
		
	}
	
	public ViewBusinessProfile clickmember() throws IOException, InterruptedException {
		//waitAndClickElement(button_members);
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("//div[@id='__next']/div/div/div/div/div/div[2]/a[5]/span")).click();
		return new ViewBusinessProfile();
		
	}
//	public ViewBusinessProfile clickOrg() throws InterruptedException, IOException {
//		waitAndClickElement(button_OrgInfo);
//		return new ViewBusinessProfile();
//	}
//	
	public ViewBusinessProfile clickBusinessname() throws Exception {
		waitAndClickElement(button_OrgInfo);
		return new ViewBusinessProfile();
	}
	
	public ViewBusinessProfile landingpage() throws Exception {	
		String url = "http://20.52.44.20/businessprofiledetails?pid=6";
		Thread.sleep(5000);
		String current_url =getDriver().getCurrentUrl();
		Assert.assertEquals(url, current_url);
		return new ViewBusinessProfile();
	}
	

}
