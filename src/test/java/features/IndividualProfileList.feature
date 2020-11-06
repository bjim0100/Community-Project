@COMMUNITY-214
@REQ_COMMUNITY-6
Feature: Job portal

	#Automated test for viewing individual profile list for a logged in user.
	@TEST_COMMUNITY-223 @REQ_COMMUNITY-32 @TESTSET_COMMUNITY-186
	Scenario: Test Individual profiles list for a logged in user
		Given user navigates to url
		When user submits email
		And user submits password
		And user clicks login button
		And user clicks on members button
		Then A list of individuals appear
