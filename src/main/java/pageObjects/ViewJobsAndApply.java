package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewJobsAndApply extends BasePage{

	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]") WebElement button_job;
	public @FindBy(xpath = "//p[contains(text(),'Home teacher to teach mathematics')]") WebElement button_Ajob;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_apply;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_modal;
	
	
	public ViewJobsAndApply() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ViewJobsAndApply gotopage() throws Exception {
		getDriver().get("http://20.52.44.20/auth/login");
		return new ViewJobsAndApply();
	}
	
	public ViewJobsAndApply emailandpassword() throws Exception {
		sendKeysToWebElement(Textfield_email, "aa@individual.com");
		sendKeysToWebElement(Textfield_password, "Kankama1");
		return new ViewJobsAndApply();
	}
	
	public ViewJobsAndApply clicklogin() throws IOException, InterruptedException {
		waitAndClickElement(button_login);
		return new ViewJobsAndApply();
	}
	
	public ViewJobsAndApply clickjob() throws IOException, InterruptedException {
		Thread.sleep(5000);
		waitAndClickElement(button_job);
		return new ViewJobsAndApply();
	}
	
	public ViewJobsAndApply clickJobTitle() throws IOException, InterruptedException {
		Thread.sleep(5000);
		waitAndClickElement(button_Ajob);
		return new ViewJobsAndApply();
	}
	public ViewJobsAndApply clickapply() throws IOException, InterruptedException {
		waitAndClickElement(button_apply);
		return new ViewJobsAndApply();
	}
	
	public ViewJobsAndApply message() throws IOException {
		boolean error = getDriver().findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/div[1]/p")).isEnabled();
		Assert.assertTrue(error);
		return new ViewJobsAndApply();
	}
	

}
