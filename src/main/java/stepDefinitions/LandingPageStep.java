package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LandingPageStep extends DriverFactory{

	@Given("^user navigates to url\\(landing page\\)$")
	public void user_navigates_to_url_landing_page() throws Exception  {
	    landingpage.goTopage();
	}

	@When("^user sends email$")
	public void user_sends_email() throws Exception  {
	   landingpage.email();
	}

	@And("^user submits password$")
	public void user_submits_password() throws Exception  {
	    landingpage.password();
	}

	@And("^user clicks login\\(landing page\\)$")
	public void user_clicks_login_landing_page() throws Exception  {
	    landingpage.clicklogin();
	}

	@Then("^user should be navigated to profile$")
	public void user_should_be_navigated_to_profile() throws Exception  {
	    landingpage.profilepage();
	}


	
}
