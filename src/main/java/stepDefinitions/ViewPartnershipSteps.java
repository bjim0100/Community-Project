package stepDefinitions;

import java.io.IOException;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ViewPartnershipSteps extends DriverFactory{

	@Given("^user navigates to url \\(VP\\)$")
	public void user_navigates_to_url_VP() throws Exception  {
		viewpartnership.gotopage();
	}

	@When("^user sends email and password \\(VP\\)$")
	public void user_sends_email_and_password_VP() throws Exception  {
		viewpartnership.emailandpass();
	}

	@When("^user clicks login \\(VP\\)$")
	public void user_clicks_login_VP() throws InterruptedException, IOException  {
		viewpartnership.clicksLogin();
	}

	@When("^user clicks partnership \\(VP\\)$")
	public void user_clicks_partnership_VP() throws IOException, InterruptedException  {
		viewpartnership.clickpartnership();
	}

	@When("^user clicks on partnership a partnership \\(VP\\)$")
	public void user_clicks_on_partnership_a_partnership_VP() throws IOException {
		viewpartnership.businesstitle();
	}

	@Then("^the partnership view is opened \\(VP\\)$")
	public void the_partnership_view_is_opened_VP() throws IOException  {
		viewpartnership.validate();
	}

	
	
}
