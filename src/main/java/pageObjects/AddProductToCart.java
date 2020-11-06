package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToCart extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]") WebElement button_market;
	public @FindBy(xpath = "//button[contains(text(),'Add to cart')]") WebElement button_cart;
	
	public AddProductToCart() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AddProductToCart gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new AddProductToCart();
	}
	
	public AddProductToCart login() throws Exception {
		sendKeysToWebElement(Textfield_email, "obeng.boateng@amalitech.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new AddProductToCart();
	}
	
	public AddProductToCart clicklogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new AddProductToCart();
	}
	public AddProductToCart market() throws IOException, InterruptedException {
		Thread.sleep(5000);
		//waitAndClickElement(button_market);
		getDriver().findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]")).click();
		return new AddProductToCart();
	}
	
	public AddProductToCart product(String product) throws IOException {
		getDriver().get(product);
		return new AddProductToCart();
	}
	
	public AddProductToCart cart() throws IOException, InterruptedException {
		waitAndClickElement(button_cart);
		return new AddProductToCart();
	}

}
