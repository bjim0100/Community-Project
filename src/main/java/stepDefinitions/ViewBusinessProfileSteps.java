package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ViewBusinessProfileSteps extends DriverFactory{
	
	
	@Given("^user navigates to url \\(view profile\\)$")
	public void user_navigates_to_url_view_profile() throws Exception {
	    viewbusiness.gotopage();
	}

	@When("^user sends email and password \\(view profile\\)$")
	public void user_sends_email_and_password_view_profile() throws Exception  {
	    viewbusiness.emailandpassword();
	}

	@And("^user clicks login \\(view profile\\)$")
	public void user_clicks_login_view_profile() throws Exception  {
	    viewbusiness.clicklogin();
	}

	@And("^user clicks members$")
	public void user_clicks_members() throws IOException, InterruptedException  {
	    viewbusiness.clickmember();
	}

//	@And("^user clicks Organization$")
//	public void user_clicks_Organization()  {
//	    viewbusiness.clickOrg();
//	}

	@And("^user clicks a business profile$")
	public void user_clicks_a_business_profile() throws Exception  {
	    viewbusiness.clickBusinessname();
	}

	@Then("^user should see the landing page$")
	public void user_should_see_the_landing_page() throws Exception  {
	    viewbusiness.landingpage();
	}

	

	

}
