package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IndividualProfileList extends BasePage{

	
	public @FindBy(xpath = "//span[contains(text(),'Members')]") WebElement button_members;
	public @FindBy(xpath = "//a[contains(text(),'Individual')]") WebElement button_individualOrg;
	public @FindBy(xpath = "") WebElement message_success;
	
	
	public IndividualProfileList() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public IndividualProfileList clickmember() throws Exception {
		waitAndClickElement(button_members);
		return new IndividualProfileList();
		
	}
	
	public IndividualProfileList clickindividual() throws Exception {
		waitAndClickElement(button_individualOrg);
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
