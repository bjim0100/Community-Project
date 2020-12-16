@COMMUNITY-814
@REQ_COMMUNITY-5
Feature: Forum

	#Tests As a user, I want to be able to:
	#
	#Acceptance Criteria:
	#
	## View all my posts when I click the “My Posts” link in the navigation pane. Posts should show by latest timestamp.
	## Edit or delete my posts by clicking on the functionalities
	@TEST_COMMUNITY-1000 @REQ_COMMUNITY-907 @TESTSET_COMMUNITY-913
	Scenario: Automated Edit post
		Given user navigates to url (FP_E)
		When user submits email and password (FP_E)
		And user clicks login (FP_E)
		And user clicks Forum (FP_E)
		And user clicks my post (FP_E)
		And user clicks on edit a post (FP_E)
		And user changes topic (FP_E)
		And user clicks post (FP_E)