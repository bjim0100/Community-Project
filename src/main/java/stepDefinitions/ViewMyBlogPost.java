package stepDefinitions;

import java.io.IOException;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ViewMyBlogPost extends DriverFactory{
	
	
	@Given("^user navigates to url \\(VMBP\\)$")
	public void user_navigates_to_url_VMBP() throws IOException  {
	    viewmyblogpost.gotopage();
	}

	@When("^user submits email and password \\(VMBP\\)$")
	public void user_submits_email_and_password_VMBP() throws Exception  {
	   viewmyblogpost.emailandpass();
	}

	@When("^user clicks login \\(VMBP\\)$")
	public void user_clicks_login_VMBP() throws IOException, InterruptedException {
	    viewmyblogpost.clicksLogin();
	}

	@When("^user clicks blog \\(VMBP\\)$")
	public void user_clicks_blog_VMBP() throws IOException, InterruptedException  {
	   viewmyblogpost.clicksBLog(); 
	}

	@When("^user clicks view my post \\(VMBP\\)$")
	public void user_clicks_view_my_post_VMBP() throws IOException  {
	   viewmyblogpost.Validation();
	}

	@Then("^all blog post should appear \\(VMBP\\)$")
	public void all_blog_post_should_appear_VMBP() {
	    
	}

	
	

}
