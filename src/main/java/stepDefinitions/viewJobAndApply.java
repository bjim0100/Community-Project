package stepDefinitions;

import java.io.IOException;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class viewJobAndApply extends DriverFactory{

	
	@Given("^user naviagates to url \\(VJAA\\)$")
	public void user_naviagates_to_url_VJAA() throws Exception  {
	    viewjobsandapply.gotopage();
	}

	@When("^user submits email and password \\(VJAA\\)$")
	public void user_submits_email_and_password_VJAA() throws Exception  {
	    viewjobsandapply.emailandpassword();
	}

	@When("^user clicks login \\(VJAA\\)$")
	public void user_clicks_login_VJAA() throws IOException, InterruptedException  {
	    viewjobsandapply.clicklogin();
	}

	@When("^user clicks job \\(VJAA\\)$")
	public void user_clicks_job_VJAA() throws IOException, InterruptedException {
	    viewjobsandapply.clickjob();
	}

	@When("^user clicks job title \\(VJAA\\)$")
	public void user_clicks_job_title_VJAA() throws IOException, InterruptedException  {
	    viewjobsandapply.clickJobTitle();
	}

	@When("^user clicks apply \\(VJAA\\)$")
	public void user_clicks_apply_VJAA() throws IOException, InterruptedException  {
	    viewjobsandapply.clickapply();
	}

	@Then("^user should see a response prompt \\(VJAA\\)$")
	public void user_should_see_a_response_prompt_VJAA() throws IOException {
	    viewjobsandapply.message();
	}


	
}
