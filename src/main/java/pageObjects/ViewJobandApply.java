package pageObjects;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ViewJobandApply extends BasePage{

	
	public @FindBy(xpath = "//input[@id='InputEmail']") WebElement Textfield_email;
	public @FindBy(xpath = "//input[@id='InputPassword1']") WebElement Textfield_password;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_login;
	public @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]") WebElement button_job;
	public @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/div[2]/div[4]/div[1]/div/div[4]/p") WebElement button_Ajob;
	public @FindBy(xpath = "//button[@id='apply']") WebElement button_apply;
	public @FindBy(xpath = "//button[@id='signin_button']") WebElement button_modal;
	
	
	public ViewJobandApply() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
public ViewJobandApply gotopage() throws IOException {
	
	getDriver().get("http://20.52.44.20/auth/login");
	return new ViewJobandApply();
}

public ViewJobandApply emailandpassword() throws Exception {
	
	sendKeysToWebElement(Textfield_email, "aa@individual.com");
	sendKeysToWebElement(Textfield_password, "Kankama1");
	return new ViewJobandApply();
}

public ViewJobandApply clicklogin() throws IOException, InterruptedException {
	waitAndClickElement(button_login);
	return new ViewJobandApply();
}

public ViewJobandApply clickjob() throws IOException, InterruptedException {
	Thread.sleep(5000);
	waitAndClickElement(button_job);
	
	return new ViewJobandApply();
}
public ViewJobandApply clickapply() throws IOException, InterruptedException {
	waitAndClickElement(button_apply);
	Thread.sleep(5000);
	getDriver().findElement(By.xpath("//button[@id='placeorder_button']")).click();
	
	return new ViewJobandApply();
}
public ViewJobandApply message() throws IOException {

	getDriver().findElement(By.xpath("(//a[contains(@href, '/jobs/viewjobsandapply')])[3]")).click();
	//	String text =getDriver().findElement(By.xpath("//a[contains(text(),'close')]")).getText();
//	assertEquals(text, "Yay! Your application has been successfully sent. Best of Luck");
//	
	return new ViewJobandApply();
}
public ViewJobandApply jobtitle() throws IOException, InterruptedException {

	Thread.sleep(5000);
	//getDriver().get("http://20.52.44.20/jobs/details/dc09d90c");
	getDriver().findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[4]/p[1]")).click();
	
	
	return new ViewJobandApply();
}


}
