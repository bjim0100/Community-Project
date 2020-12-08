package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ForumPosts_deleteSteps extends DriverFactory{

	@Given("^user navigates to url \\(FP_D\\)$")
	public void user_navigates_to_url_FP_D() throws IOException {
	   forumpost_delete.gotopage();
	}

	@When("^user submits email and password \\(FP_D\\)$")
	public void user_submits_email_and_password_FP_D() throws Exception  {
	   forumpost_delete.emailandpass();
	}

	@When("^user clicks login \\(FP_D\\)$")
	public void user_clicks_login_FP_D() throws IOException, InterruptedException  {
	    forumpost_delete.clicksLogin();
	}

	@When("^user clicks Forum \\(FP_D\\)$")
	public void user_clicks_Forum_FP_D() throws IOException, InterruptedException {
	    forumpost_delete.clicksForum();
	}

	@When("^user clicks my post \\(FP_D\\)$")
	public void user_clicks_my_post_FP_D() throws IOException, InterruptedException  {
	   forumpost_delete.clicksMypost();
	}

	@When("^user clicks on delete \\(FP_D\\)$")
	public void user_clicks_on_delete_FP_D() throws IOException, InterruptedException  {
	   forumpost_delete.clicksDelete();
	}

	@Then("^a prompt will appear for user to click yes \\(FP_D\\)$")
	public void a_prompt_will_appear_for_user_to_click_yes_FP_D() throws IOException, InterruptedException  {
	    forumpost_delete.clicksDeletePrompt();
	}
	
}
