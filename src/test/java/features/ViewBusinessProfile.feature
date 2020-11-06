@COMMUNITY-423
@REQ_COMMUNITY-2
Feature: Marketplace

	#Tests As a platform visitor, I should be able to see all organizations/businesses. (View all members user story)
	#
	#Acceptance Criteria:
	#
	## Criteria for signed-in users (all available details)
	## Criteria for guest visitors (just title/name & location)
	## When clicked on an individual business profile, a landing page (separate user story) should load up.
	@TEST_COMMUNITY-424 @REQ_COMMUNITY-26 @TESTSET_COMMUNITY-363
	Scenario: Automation View business profile
		Given user navigates to url (view profile)
		And user sends email and password (view profile)
		And user clicks login (view profile)
		And user clicks members
		And user clicks a business profile
		Then user should see the landing page 
