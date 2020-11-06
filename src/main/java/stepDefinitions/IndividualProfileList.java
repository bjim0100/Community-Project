package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class IndividualProfileList extends DriverFactory {

	
	@Given("^user clicks on members button$")
	public void user_clicks_on_members_button() throws Exception  {
	    individualprofilelist.clickmember();
	}

//	@When("^user clicks on individuals$")
//	public void user_clicks_on_individuals() throws Exception {
//	   individualprofilelist.clickindividual();
//	}

	@Then("^A list of individuals appear$")
	public void a_list_of_individuals_appear() throws Exception {
	    individualprofilelist.validateList();
	}


	
}
