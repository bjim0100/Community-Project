@COMMUNITY-214
@REQ_COMMUNITY-6
Feature: Job portal

	#Automated test for viewing individual profile list for a logged in user.
	@TEST_COMMUNITY-223 @REQ_COMMUNITY-32 @TESTSET_COMMUNITY-186
	Scenario: Test Individual profiles list for a logged in user
		Given user navigates to url (IP)
		When user submits email (IP)
	#	And user submits password (IP)
		And user clicks login button (IP)
		And user clicks on members button (IP)
		And user clicks on individual
		Then A list of individuals appear (IP)
