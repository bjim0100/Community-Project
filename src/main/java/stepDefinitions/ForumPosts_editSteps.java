package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ForumPosts_editSteps extends DriverFactory{

	@Given("^user navigates to url \\(FP_E\\)$")
	public void user_navigates_to_url_FP_E() throws IOException  {
	   forumpost_edit.gotopage();
	}

	@When("^user submits email and password \\(FP_E\\)$")
	public void user_submits_email_and_password_FP_E() throws Exception  {
	    forumpost_edit.emailandpass();
	}

	@When("^user clicks login \\(FP_E\\)$")
	public void user_clicks_login_FP_E() throws IOException, InterruptedException  {
	   forumpost_edit.clicksLogin();
	}

	@When("^user clicks Forum \\(FP_E\\)$")
	public void user_clicks_Forum_FP_E() throws IOException, InterruptedException  {
	    forumpost_edit.clicksForum();
	}

	@When("^user clicks my post \\(FP_E\\)$")
	public void user_clicks_my_post_FP_E() throws IOException, InterruptedException  {
	   forumpost_edit.clicksMypost();
	}

	@When("^user clicks on edit a post \\(FP_E\\)$")
	public void user_clicks_on_edit_a_post_FP_E() throws IOException, InterruptedException {
	    forumpost_edit.clicksEdit();
	}

	@When("^user changes topic \\(FP_E\\)$")
	public void user_changes_topic_FP_E() throws Exception  {
	    forumpost_edit.Changetopic();
	}

	@When("^user clicks post \\(FP_E\\)$")
	public void user_clicks_post_FP_E() throws IOException, InterruptedException {
	    forumpost_edit.clicksPost();
	}


	
}
