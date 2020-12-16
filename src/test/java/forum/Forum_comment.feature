@COMMUNITY-814
@REQ_COMMUNITY-5
Feature: Forum

	#Tests As a user, I should be able to:
	#
	#*Acceptance Criteria:*
	#
	## Post a comment under a post. Text field should allow for only texts and emojis.
	## Edit or delete comment posted
	## When a user deletes their post, all other comments underneath it should be deleted
	@TEST_COMMUNITY-1001 @REQ_COMMUNITY-904 @TESTSET_COMMUNITY-914
	Scenario: Automated adding comments
		Given user navigates to url (FC)
		When user submits email and password (FC)
		And user clicks login (FC)
		And user clicks Forum (FC)
		And user submits comment (FC)
		And user clicks post (FC)
