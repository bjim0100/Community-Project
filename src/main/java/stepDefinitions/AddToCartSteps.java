package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddToCartSteps extends DriverFactory{

	
	@Given("^user navigates to url \\(add to cart\\)$")
	public void user_navigates_to_url_add_to_cart() throws Throwable {
	    addproducttocart.gotopage();
	}

	@When("^user logs in \\(add to cart\\)$")
	public void user_logs_in_add_to_cart() throws Throwable {
	    addproducttocart.login();
	}

	@When("^user clicks login \\(add to cart\\)$")
	public void user_clicks_login_add_to_cart() throws Throwable {
	   addproducttocart.clicklogin();
	}

	@When("^user clicks market \\(add to cart\\)$")
	public void user_clicks_market_add_to_cart() throws Throwable {
	    addproducttocart.market();
	}

	@When("^user clicks on product \"([^\"]*)\" \\(add to cart\\)$")
	public void user_clicks_on_product_add_to_cart(String product) throws Throwable {
	   addproducttocart.product(product);
	}

	@When("^user clicks cart \\(add to cart\\)$")
	public void user_clicks_cart_add_to_cart() throws Throwable {
	    addproducttocart.cart();
	}


	
	
}
