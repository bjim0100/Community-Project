package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AddProductsSteps extends DriverFactory{
	
	@Given("^user navigates to url \\(add product\\)$")
	public void user_navigates_to_url_add_product() throws Exception  {
	    addproductsservices.gotopage();
	}

	@When("^user sends email and password$")
	public void user_sends_email_and_password() throws Exception {
	    addproductsservices.emailandpass();
	}

	@And("^user clicks login$")
	public void user_clicks_login() throws InterruptedException, IOException {
	    addproductsservices.clicksLogin();
	}

	@And("^user clicks market$")
	public void user_clicks_market() throws IOException, InterruptedException  {
	    addproductsservices.clickmarket();
	}

	@And("^user clicks add products$")
	public void user_clicks_add_products() throws InterruptedException, IOException  {
	    addproductsservices.clickaddproducts();
	}

	@And("^user submits name \"([^\"]*)\"$")
	public void user_submits_name(String name) throws Exception {
	    addproductsservices.addname(name);
	}

	@And("^user submits type \"([^\"]*)\"$")
	public void user_submits_type(String type) throws Exception {
	    addproductsservices.addtype(type);
	}

	@And("^user submits description \"([^\"]*)\"$")
	public void user_submits_description(String description) throws Exception  {
	   addproductsservices.description(description);
	}

	@And("^user submits price \"([^\"]*)\"$")
	public void user_submits_price(String price) throws Exception {
	   addproductsservices.addprice(price);
	}

	@And("^user submits category \"([^\"]*)\"$")
	public void user_submits_category(String category) throws Exception  {
	   addproductsservices.category(category);
	}
	
	@And("^user clicks save$")
	public void user_clicks_save() throws InterruptedException, IOException  {
	    addproductsservices.save();
	}

	@Then("^user sees a message \"([^\"]*)\"$")
	public void user_sees_a_message(String message) throws Exception  {
	    addproductsservices.Message(message);
	}

}
