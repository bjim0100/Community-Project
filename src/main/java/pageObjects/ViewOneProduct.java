package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewOneProduct extends BasePage {

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]") WebElement button_market;
	public @FindBy(xpath = "//button[@id='dropdown-basic-button']") WebElement button_product;

	public ViewOneProduct() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewOneProduct gotopage() throws IOException {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ViewOneProduct();

	}

	public ViewOneProduct login() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@individual.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new ViewOneProduct();

	}

	public ViewOneProduct clicklogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new ViewOneProduct();

	}

	public ViewOneProduct market() throws IOException, InterruptedException {
		Thread.sleep(10000);
		//waitAndClickElement(button_market);
		getDriver().findElement(By.xpath("//div[@id='__next']/div/div/div/div/div/div[2]/a/span")).click();
		return new ViewOneProduct();

	}

	public ViewOneProduct clickproduct(String product) throws IOException, InterruptedException {
		getDriver().get(product);
		return new ViewOneProduct();

	}

	public ViewOneProduct verifypage(String url) throws IOException {
		String currenturl = getDriver().getCurrentUrl();
		Assert.assertEquals(url, currenturl);
		return new ViewOneProduct();
		
	}
	
	
}
