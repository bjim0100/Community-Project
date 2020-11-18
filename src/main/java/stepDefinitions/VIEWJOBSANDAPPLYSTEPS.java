package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class VIEWJOBSANDAPPLYSTEPS extends DriverFactory{

	
//	@Given("^user naviagates to url  \\(VJ\\)$")
//	public void user_naviagates_to_url_VJ() throws IOException  {
//		viewjobandapply.gotopage();
//	}
//
//	@When("^user submits email and password \\(VJ\\)$")
//	public void user_submits_email_and_password_VJ() throws Exception  {
//		viewjobandapply.emailandpassword();
//	}
//
//	@When("^user clicks login \\(VJ\\)$")
//	public void user_clicks_login_VJ() throws IOException, InterruptedException {
//		 viewjobandapply.clicklogin();
//	}
//
//	@When("^user clicks job \\(VJ\\)$")
//	public void user_clicks_job_VJ() {
//		 getDriver().get("http://20.52.44.20/jobs/details/64805048");
//	}
//
//	@When("^user clicks job title \\(VJ\\)$")
//	public void user_clicks_job_title_VJ() throws IOException  {
//		viewjobandapply.jobtitle();
//	}
//
//	@When("^user clicks apply \\(VJ\\)$")
//	public void user_clicks_apply_VJ() throws IOException, InterruptedException{
//		viewjobandapply.clickapply();
//	}
//
//	@Then("^user should see a response prompt \\(VJ\\)$")
//	public void user_should_see_a_response_prompt_VJ() throws IOException {
//		viewjobandapply.message();
//	}
//
//	
	
	@Given("^user naviagates to url  \\(VJ\\)$")
	public void user_naviagates_to_url_VJ() throws Throwable {
		viewjobandapply.gotopage();
	}

	@When("^user submits email and password \\(VJ\\)$")
	public void user_submits_email_and_password_VJ() throws Throwable {
		viewjobandapply.emailandpassword();
	}

	@When("^user clicks login \\(VJ\\)$")
	public void user_clicks_login_VJ() throws Throwable {
		 viewjobandapply.clicklogin();
	}

	@When("^user clicks job \\(VJ\\)$")
	public void user_clicks_job_VJ() throws Throwable {
	    viewjobandapply.clickjob();
	}

	@When("^user clicks job title \\(VJ\\)$")
	public void user_clicks_job_title_VJ() throws Throwable {
		
		 getDriver().get("http://20.52.44.20/jobs/details/dc09d90c");
	}

	@When("^user clicks apply \\(VJ\\)$")
	public void user_clicks_apply_VJ() throws Throwable {
		viewjobandapply.clickapply();
	}

	@Then("^user should see a response prompt \\(VJ\\)$")
	public void user_should_see_a_response_prompt_VJ() throws Throwable {
		viewjobandapply.message();
	}

	
}
