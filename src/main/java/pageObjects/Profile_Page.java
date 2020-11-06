package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Profile_Page extends BasePage{
	public @FindBy(xpath ="//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath ="//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath ="//button[@class='btn btn-primary btn-block']") WebElement button_login;
	public @FindBy(xpath ="//input[@placeholder='Full name']") WebElement Textfield_firstname;
	public @FindBy(xpath ="//input[@placeholder='eg. AK-039-5028']") WebElement Textfield_gps;
	public @FindBy(xpath = "//input[@id='dob']") WebElement Textfield_dateofbirth;
	public @FindBy(xpath ="//input[@placeholder='Executive Avenue Anaji']") WebElement Textfield_address;
	public @FindBy(xpath ="//a[@class='btn btn-primary btn-block mt-1']") WebElement button_editprofile;
	public @FindBy(xpath = "sdsfdf") WebElement Textfield_message;
	public @FindBy(xpath ="//button[contains(@class,'mb-1 mt-5')]") WebElement button_save;
	public @FindBy(xpath = "//a[contains(text(),'View Profile')]") WebElement button_profile;
	public @FindBy(xpath = "//div[5]//select[1]") WebElement dropdown_privacylevel;
	public @FindBy(xpath ="//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div/a/span") WebElement button_profilename;
	//public @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[3]/form/div[1]/div[1]/div[3]/div/input") WebElement Textfield_profileEmail;
	public @FindBy(xpath = "//input[@placeholder='eg. 024 567 3456']") WebElement Textfield_number;
	public @FindBy(xpath = "//input[@id='inlineRadio2']") WebElement radiobutton_female;
	
	
	public Profile_Page() throws IOException {
		super();
		
	}
	
	public Profile_Page getmarketcircle() throws Exception   {
		getDriver().get("http://20.52.44.20/auth/login");
	return new Profile_Page();	
}
	
	public Profile_Page enteremail() throws Exception   {
		sendKeysToWebElement(Textfield_email, "obeng.boateng@amalitech.com");
	return new Profile_Page();	
}
	
	public Profile_Page enterpassword() throws Exception   {
		sendKeysToWebElement(Textfield_password, "Boateng1");
	return new Profile_Page();	
}
	
	
	
	public Profile_Page clicklogin() throws Exception   {
		waitAndClickElement(button_login);
	return new Profile_Page();	
}
	
	public Profile_Page clickprofilename() throws Exception {
		waitAndClickElement(button_profilename);
		//getDriver().findElement(By.xpath("//span[@class='avatar avatar-md brround cover-image']")).click();
		return new Profile_Page();
	}
	public Profile_Page clickprofile() throws Exception   {
		waitAndClickElement(button_profile);
	return new Profile_Page();	
}
	public Profile_Page clickeditprofile() throws Exception   {
		waitAndClickElement(button_editprofile);
	return new Profile_Page();	
}


	
	
	
	
	public Profile_Page enterFirstname(String firstname) throws Exception   {
			sendKeysToWebElement(Textfield_firstname, firstname);
		return new Profile_Page();
		
	}


	public Profile_Page enteraddress(String address) throws Exception   {
		sendKeysToWebElement(Textfield_address, address);
	return new Profile_Page();
	
}
	public Profile_Page enterdateofbirth() throws Exception {
		//sendKeysToWebElement(Textfield_dateofbirth, "10/31/2020");
		getDriver().findElement(By.xpath("//input[@id='dob']")).sendKeys("10/31/2020");
		return new Profile_Page();
		
		
	}
	
	public Profile_Page entergps(String gps) throws Exception {
		sendKeysToWebElement(Textfield_gps, gps);
		return new Profile_Page();
		
		
	}
	
	public Profile_Page clicksave() throws Exception   {
		
		waitAndClickElement(button_save);
	return new Profile_Page();
	
}
	public Profile_Page privacylevel() throws Exception {
		waitAndClickElement(dropdown_privacylevel);
		Select select = new Select(dropdown_privacylevel);
		select.selectByIndex(1);
		return new Profile_Page();
	}
	
	

	public Profile_Page editprofilesuccessmessage() throws Exception   {
		
		
	return new Profile_Page();
	
}
	public Profile_Page sendnumber(String number) throws Exception {
		sendKeysToWebElement(Textfield_number, number);
		return new Profile_Page();
		
	}
//	public Profile_Page sendprofileemail() throws Exception {
//		sendKeysToWebElement(Textfield_profileEmail, "lois@email.com");
//		return new Profile_Page();
//		
//	}
	public Profile_Page selectGender() throws Exception {
		waitAndClickElement(radiobutton_female);
		return new Profile_Page();
	}
	
	
	
	
	
}
