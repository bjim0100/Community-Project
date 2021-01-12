package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CreateBlogPost extends DriverFactory{

	@Given("^user navigates to url \\(CBP\\)$")
	public void user_navigates_to_url_CBP() throws IOException {
	   createablogpost.gotopage();
	}

	@When("^user submits email and password \\(CBP\\)$")
	public void user_submits_email_and_password_CBP() throws Exception {
	    createablogpost.emailandpass();
	}

	@When("^user clicks login \\(CBP\\)$")
	public void user_clicks_login_CBP() throws IOException, InterruptedException  {
	    createablogpost.clicksLogin();
	}

	@When("^user clicks blog \\(CBP\\)$")
	public void user_clicks_blog_CBP() throws IOException, InterruptedException  {
	    createablogpost.clicksBLog();
	}

	@When("^user clicks add my post \\(CBP\\)$")
	public void user_clicks_add_my_post_CBP() throws IOException, InterruptedException  {
	   createablogpost.clicksAddPost();
	}

	@When("^user sends \"([^\"]*)\" title\\(CBP\\)$")
	public void user_sends_title_CBP(String title) throws Exception {
	    createablogpost.Title(title);
	}

	@When("^user selects \"([^\"]*)\" category\\(CBP\\)$")
	public void user_selects_category_CBP(int category) throws IOException  {
	    createablogpost.Category(category);
	}

	@When("^user sends \"([^\"]*)\" description\\(CBP\\)$")
	public void user_sends_description_CBP(String description) throws Exception {
	    createablogpost.Description(description);
	}

	@When("^user sends \"([^\"]*)\"  contact\\(CBP\\)$")
	public void user_sends_contact_CBP(String contact) throws Exception  {
	    createablogpost.Contactdetails(contact);
	}

	@When("^user sends \"([^\"]*)\" videoURL\\(CBP\\)$")
	public void user_sends_videoURL_CBP(String videoURL) throws Exception  {
	    createablogpost.videoURL(videoURL);
	}

	@When("^user clicks post \\(CBP\\)$")
	public void user_clicks_post_CBP() throws Exception  {
	    createablogpost.clickPost();
	}

	@Then("^post should appear in my blog posts \\(CBP\\)$")
	public void post_should_appear_in_my_blog_posts_CBP() throws Exception  {
	    createablogpost.validate();
	    
	}



	
	
	
}
