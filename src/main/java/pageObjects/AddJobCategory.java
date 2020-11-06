package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddJobCategory extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]") WebElement button_job;
	public @FindBy(xpath = "//li[contains(text(),'View job categories')]") WebElement button_job_categories;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/input[1]") WebElement button_addCategories;
	
	
	
	public AddJobCategory() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddJobCategory gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new AddJobCategory();
	}
	
	public AddJobCategory emailandpassword() throws Exception {
		sendKeysToWebElement(Textfield_email, "alhaji@gmail.com");
		sendKeysToWebElement(Textfield_password, "Amalitech@2020");
		return new AddJobCategory();
	}
	public AddJobCategory clicklogin() throws Exception {
		waitAndClickElement(button_login);
		return new AddJobCategory();
		
	}
	public AddJobCategory clickjobs() throws Exception {
		Thread.sleep(5000);
		getDriver().findElement(By.id("openicon")).click();
		waitAndClickElement(button_job);
		return new AddJobCategory();
	}
	
	public AddJobCategory clickjobcategories() throws Exception {
		waitAndClickElement(button_job_categories);
		return new AddJobCategory();
	}
	
	public AddJobCategory clickaddCategory() throws Exception {
		waitAndClickElement(button_addCategories);
		return new AddJobCategory();
	}
	public AddJobCategory sendCategory(String category) throws Exception {
		
		WebElement txt = getDriver().findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/input[1]"));
		txt.sendKeys(category,Keys.ENTER);
		return new AddJobCategory();
	}
	
	
	
}
