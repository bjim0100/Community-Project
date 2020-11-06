package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import org.junit.Assert;

public class AddProductServices extends BasePage{
	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]") WebElement button_market;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]") WebElement button_addproducts;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]") WebElement Textfield_name;
	public @FindBy(xpath = "//div[@id='__next']/div/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div[3]/input") WebElement Textfield_price;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/select[1]") WebElement dropdwn_type;
	public @FindBy(xpath = "//div[@id='__next']/div/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div[4]/select") WebElement dropdwn_category;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/d") WebElement Textfield_discount;
	public @FindBy(xpath = "//div[@id='__next']/div/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div[2]/textarea") WebElement Textfield_description;
	public @FindBy(xpath = "//button[contains(text(),'Add')]") WebElement button_save;
	
	
	public AddProductServices() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewBusinessProfile gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ViewBusinessProfile();
		
	}
	
	
	public AddProductServices emailandpass() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@business.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new AddProductServices();
		
	}
	
	public AddProductServices clicksLogin() throws InterruptedException, IOException {
		waitAndClickElement(button_login);
		
		return new AddProductServices();
	}
	
	public AddProductServices clickmarket() throws IOException, InterruptedException {
		waitAndClickElement(button_market);
		return new AddProductServices();
	}
	
	public AddProductServices clickaddproducts() throws InterruptedException, IOException {
		waitAndClickElement(button_addproducts);
		return new AddProductServices();
	}
	
	public AddProductServices addname(String name) throws Exception {
		sendKeysToWebElement(Textfield_name, name);
		return new AddProductServices();
	}
	
	public AddProductServices addtype(String type) throws Exception {
		Thread.sleep(5000);
		Select Type = new Select(dropdwn_type);
		Type.selectByVisibleText(type);
		return new AddProductServices();
	}
	
	public AddProductServices addprice(String price) throws Exception {
		sendKeysToWebElement(Textfield_price, price);
		return new AddProductServices();
	}
	
	public AddProductServices category(String category) throws Exception {
		Thread.sleep(5000);
		Select select = new Select(dropdwn_category);
		select.selectByVisibleText(category);
		return new AddProductServices();
	}
	
	public AddProductServices discount() throws Exception {
		sendKeysToWebElement(Textfield_discount, "10");
		return new AddProductServices();
	}
	
	public AddProductServices description(String description) throws Exception {
		sendKeysToWebElement(Textfield_description, description);
		return new AddProductServices();
	}
	
	public AddProductServices save() throws InterruptedException, IOException {
		waitAndClickElement(button_save);
		return new AddProductServices();
	}
	
	
	public AddProductServices Message(String message) throws Exception {
		Thread.sleep(5000);
		String error = getDriver().findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/div[1]/p")).getText();
		Assert.assertEquals(message, error);
//		String bodyText = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/div[1]/p")).getText();
//		Assert.assertTrue(message, bodyText.contains(message));
		
		return new AddProductServices();
		
	}
	
}
