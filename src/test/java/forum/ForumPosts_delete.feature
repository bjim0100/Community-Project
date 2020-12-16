@COMMUNITY-814
@REQ_COMMUNITY-5
Feature: Forum

	#Tests As a user, I want to be able to:
	#
	#Acceptance Criteria:
	#
	## View all my posts when I click the “My Posts” link in the navigation pane. Posts should show by latest timestamp.
	## Edit or delete my posts by clicking on the functionalities
	@TEST_COMMUNITY-999 @REQ_COMMUNITY-907 @TESTSET_COMMUNITY-913
	Scenario: Automated Delete post
		Given user navigates to url (FP_D)
		When user submits email and password (FP_D)
		And user clicks login (FP_D)
		And user clicks Forum (FP_D)
		And user clicks my post (FP_D)
		And user clicks on delete (FP_D)
		Then a prompt will appear for user to click yes (FP_D)
