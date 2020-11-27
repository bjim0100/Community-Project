package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class IndividualProfileList extends DriverFactory {

	
//	@Given("^user clicks on members button$")
//	public void user_clicks_on_members_button() throws Exception  {
//	    individualprofilelist.clickmember();
//	}
//
////	@When("^user clicks on individuals$")
////	public void user_clicks_on_individuals() throws Exception {
////	   individualprofilelist.clickindividual();
////	}
//
//	@Then("^A list of individuals appear$")
//	public void a_list_of_individuals_appear() throws Exception {
//	    individualprofilelist.validateList();
//	}


	
	@Given("^user navigates to url \\(IP\\)$")
	public void user_navigates_to_url_IP() throws Exception {
		individualprofilelist.gotopage();
	}

	@When("^user submits email \\(IP\\)$")
	public void user_submits_email_IP() throws Exception  {
		individualprofilelist.emailandpassword();
	}

//	@When("^user submits password \\(IP\\)$")
//	public void user_submits_password_IP()  {
//	   
//	}

	@When("^user clicks login button \\(IP\\)$")
	public void user_clicks_login_button_IP() throws Exception {
		individualprofilelist.clicklogin();
	}

	@When("^user clicks on members button \\(IP\\)$")
	public void user_clicks_on_members_button_IP() throws Exception {
		individualprofilelist.clickmember();
	}
	
	@When("^user clicks on individual$")
	public void user_clicks_on_individual() throws Exception {
		individualprofilelist.clickindividual();
	}

	@Then("^A list of individuals appear \\(IP\\)$")
	public void a_list_of_individuals_appear_IP()  {
	    
	}


	
	
}
