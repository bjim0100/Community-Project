package stepDefinitions;

import java.io.IOException;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class addcategorysteps extends DriverFactory{

	
	@Given("^user navigates to url \\(addcategory\\)$")
	public void user_navigates_to_url_addcategory() throws Exception  {
	    addjobcategory.gotopage();
	}

	@When("^user submits email and passwword \\(addcategory\\)$")
	public void user_submits_email_and_passwword_addcategory() throws Exception  {
	    addjobcategory.emailandpassword();
	}

	@When("^user clicks login \\(addcategory\\)$")
	public void user_clicks_login_addcategory() throws Exception {
	    addjobcategory.clicklogin();
	}

	@When("^user clicks on job \\(addcategory\\)$")
	public void user_clicks_on_job_addcategory() throws Exception  {
	    addjobcategory.clickjobs();
	}

	@When("^user clicks on job categories \\(addcategory\\)$")
	public void user_clicks_on_job_categories_addcategory() throws Exception  {
	    addjobcategory.clickjobcategories();
	}

	@When("^user clicks on add category \\(addcategory\\)$")
	public void user_clicks_on_add_category_addcategory() throws Exception  {
	    addjobcategory.clickaddCategory();
	}

	@When("^user types category \"([^\"]*)\"$")
	public void user_types_category(String category) throws Exception {
	    addjobcategory.sendCategory(category);
	}

	
}
