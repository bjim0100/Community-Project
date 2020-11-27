package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IndividualProfileList extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[6]/span[1]") WebElement button_members;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/span[1]/i[1]") WebElement button_individualOrg;
	public @FindBy(xpath = "") WebElement message_success;
	
	
	public IndividualProfileList() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IndividualProfileList gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new IndividualProfileList();
		
	}
	
	
	
	public IndividualProfileList emailandpassword() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@individual.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new IndividualProfileList();
	}
	public IndividualProfileList clicklogin() throws Exception {
		waitAndClickElement(button_login);
		return new IndividualProfileList();
		
	}
	

	public IndividualProfileList clickmember() throws Exception {
		Thread.sleep(5000);
		waitAndClickElement(button_members);
		return new IndividualProfileList();
		
	}
	
	public IndividualProfileList clickindividual() throws Exception {
		waitAndClickElement(button_individualOrg);
		Thread.sleep(20000);
		getDriver().findElement(By.xpath("//a[@id='display-individuals']")).click();
		return new IndividualProfileList();
	}
	
	public IndividualProfileList validateList() throws Exception {
		String url = "http://20.52.44.20/memberlist";
		if(url.equalsIgnoreCase(driver.getCurrentUrl())) {
			System.out.println("Pass");
		} 
		return new IndividualProfileList();
		
	}
	
}
