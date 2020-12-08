package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Forum_commentSteps extends DriverFactory{

	@Given("^user navigates to url \\(FC\\)$")
	public void user_navigates_to_url_FC() throws IOException {
	    forum_comment.gotopage();
	}

	@When("^user submits email and password \\(FC\\)$")
	public void user_submits_email_and_password_FC() throws Exception {
	   forum_comment.emailandpass();
	}

	@When("^user clicks login \\(FC\\)$")
	public void user_clicks_login_FC() throws IOException, InterruptedException  {
	    forum_comment.clicksLogin();
	}

	@When("^user clicks Forum \\(FC\\)$")
	public void user_clicks_Forum_FC() throws IOException, InterruptedException  {
	   forum_comment.clicksForum();
	}

	@When("^user submits comment \\(FC\\)$")
	public void user_submits_comment_FC() throws IOException, InterruptedException {
	    forum_comment.submitscomment();
	}

	@When("^user clicks post \\(FC\\)$")
	public void user_clicks_post_FC() throws IOException, InterruptedException  {
	    forum_comment.clickPost();
	}
	
}
