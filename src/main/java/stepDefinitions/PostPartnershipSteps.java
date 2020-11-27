package stepDefinitions;

import java.io.IOException;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class PostPartnershipSteps extends DriverFactory{

	
	@Given("^user navigates to market circle \\(PAJ\\)$")
	public void user_navigates_to_market_circle_PAJ() throws Exception {
		postpartnership.gotopage();
		
	}

	@When("^user sends email and password \\(PAJ\\)$")
	public void user_sends_email_and_password_PAJ() throws Exception  {
		postpartnership.emailandpass();
	}

	@When("^user clicks login \\(PAJ\\)$")
	public void user_clicks_login_PAJ() throws InterruptedException, IOException {
		postpartnership.clicksLogin();
	}

	@When("^user clicks partnership \\(PAJ\\)$")
	public void user_clicks_partnership_PAJ() throws IOException, InterruptedException  {
		postpartnership.clickpartnership();
	}

	@When("^user clicks add partnership \\(PAJ\\)$")
	public void user_clicks_add_partnership_PAJ() throws IOException, InterruptedException {
		postpartnership.clickaddpartnership();
	}

	@When("^user adds business type \"([^\"]*)\"\\(PAJ\\)$")
	public void user_adds_business_type_PAJ(int Btype) throws IOException, InterruptedException {
		postpartnership.businesstype(Btype);
	}

	@When("^user adds partnership type \"([^\"]*)\"\\(PAJ\\)$")
	public void user_adds_partnership_type_PAJ(int Ptype) throws IOException, InterruptedException  {
		postpartnership.partnershiptype(Ptype);
	}

	@When("^user adds \"([^\"]*)\" email \\(PAJ\\)$")
	public void user_adds_email_PAJ(String email) throws Exception {
		postpartnership.FormEmail(email);
	}

	@When("^user adds \"([^\"]*)\" phone number \\(PAJ\\)$")
	public void user_adds_phone_number_PAJ(String phonenumber) throws Exception  {
		postpartnership.phonenumber(phonenumber);
	}

	@When("^user adds partnership description \"([^\"]*)\" \\(PAJ\\)$")
	public void user_adds_partnership_description_PAJ(String description) throws Exception {
		postpartnership.partnershipDescription(description);
	}

	@When("^user clicks save \\(PAJ\\)$")
	public void user_clicks_save_PAJ() throws Exception {
		postpartnership.clickPost();
	}

	@Then("^user should be redirected to my partnerships \\(PAJ\\)$")
	public void user_should_be_redirected_to_my_partnerships_PAJ() throws Exception  {
		postpartnership.validate();
	}
	
}
