package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PostPartnership extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//div[@id='__next']/div/div/div/div/div/div[2]/div[3]/a/span") WebElement button_partnership;
	public @FindBy(xpath = "(//a[contains(text(),'Add Request')])[2]") WebElement button_addpartnership;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_businessname;
	public @FindBy(xpath ="//div[@id='__next']/div/div/div[2]/div[2]/div[2]/div/div/div[2]/select") WebElement button_industry;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_location;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_description;
	public @FindBy(xpath ="//body/div[@id='__next']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/select[1]") WebElement button_typeofpartnership;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_formemail;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_phonenumber;
	public @FindBy(xpath ="//button[contains(text(),'Post Request')]") WebElement button_save;
	public @FindBy(xpath = "") WebElement textfield_phonenumber;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/textarea[1]") WebElement textfield_partnershipDescription;
	
	public PostPartnership() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PostPartnership gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new PostPartnership();
		
	}
	
	
	public PostPartnership emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new PostPartnership();
		
	}
	
	public PostPartnership clicksLogin() throws InterruptedException, IOException {
		waitAndClickElement(button_login);
		
		return new PostPartnership();
	}
	
	public PostPartnership clickpartnership() throws IOException, InterruptedException {
		Thread.sleep(5000);
		waitAndClickElement(button_partnership);
		return new PostPartnership();
	}
	
	public PostPartnership clickaddpartnership() throws IOException, InterruptedException {
		waitAndClickElement(button_addpartnership);
		return new PostPartnership();
	}
	
	
	
	public PostPartnership businesstitle() throws Exception {
		sendKeysToWebElement(Textfield_businessname, "");
		
		return new PostPartnership();
	}
	
	public PostPartnership businesstype(int Btype) throws IOException, InterruptedException {
		Thread.sleep(5000);
		Select select = new Select(button_industry);
		select.selectByIndex(Btype);
		
		return new PostPartnership();
	}
	public PostPartnership partnershiptype(int Ptype) throws IOException, InterruptedException {
		Thread.sleep(5000);
		Select select = new Select(button_typeofpartnership);
		select.selectByIndex(Ptype);
		
		
		return new PostPartnership();
	}
	public PostPartnership FormEmail(String email) throws Exception {
		sendKeysToWebElement(Textfield_formemail, email);
		
		return new PostPartnership();
	}
	
public PostPartnership phonenumber(String phonenumber) throws Exception {
		sendKeysToWebElement(textfield_phonenumber, phonenumber);
		
		return new PostPartnership();
	}

public PostPartnership location() throws Exception {
	
	sendKeysToWebElement(Textfield_location, "");
	return new PostPartnership();
}
	
public PostPartnership businessDescription() throws Exception {
	sendKeysToWebElement(Textfield_description, "");
	
	return new PostPartnership();
}

public PostPartnership partnershipDescription(String description) throws Exception {
	sendKeysToWebElement(textfield_partnershipDescription, description);
	
	return new PostPartnership();
}
public PostPartnership clickPost() throws Exception {
	waitAndClickElement(button_save);
	Thread.sleep(5000);
	getDriver().findElement(By.xpath("//a[contains(text(),'Close')]")).click();
	return new PostPartnership();
}

public PostPartnership validate() throws Exception {
	Thread.sleep(5000);
	
	String current_url =getDriver().getCurrentUrl();
	String url = "http://20.52.44.20/partnership/mypartnerships";
	Assert.assertEquals(url, current_url);
	
	return new PostPartnership();
}



}
