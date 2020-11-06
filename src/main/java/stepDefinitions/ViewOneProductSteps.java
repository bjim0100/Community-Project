package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ViewOneProductSteps extends DriverFactory{

	
	@Given("^user navigates to url \\(view one product\\)$")
	public void user_navigates_to_url_view_one_product() throws Throwable {
	    viewoneproduct.gotopage();
	}

	@When("^user logs in \\(view one product\\)$")
	public void user_logs_in_view_one_product() throws Throwable {
	   viewoneproduct.login();
	}
	
	@When("^user clicks save \\(view one product\\)$")
	public void user_clicks_save_view_one_product() throws Throwable {
	    viewoneproduct.clicklogin();
	}

	@When("^user clicks on market \\(view one product\\)$")
	public void user_clicks_on_market_view_one_product() throws Throwable {
	    viewoneproduct.market();
	}

	@When("^user clicks on product \"([^\"]*)\" \\(view one product\\)$")
	public void user_clicks_on_product_view_one_product(String product) throws Throwable {
	    viewoneproduct.clickproduct(product);
	}

	@Then("^user should see a single product \"([^\"]*)\" \\(view one product\\)$")
	public void user_should_see_a_single_product_view_one_product(String url) throws Throwable {
	    viewoneproduct.verifypage(url);
	}


}
