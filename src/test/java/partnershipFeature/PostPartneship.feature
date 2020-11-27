@COMMUNITY-814
Feature: Automation for Post a partnership

	@TEST_COMMUNITY-880
	Scenario Outline: Automation for Post a partnership
		Given user navigates to market circle (PAJ)
		When user sends email and password (PAJ)
		And user clicks login (PAJ)
		And user clicks partnership (PAJ)
		And user clicks add partnership (PAJ)
		And user adds business type "<Btype>"(PAJ)
		And user adds partnership type "<Ptype>"(PAJ)
		#And user adds "<email>" email (PAJ)
		 #And user adds "<phonenumber>" phone number (PAJ)
		And user adds partnership description "<description>" (PAJ)
		And user clicks save (PAJ)
		Then user should be redirected to my partnerships (PAJ)
		
		Examples:
		|Btype|Ptype|email        |phonenumber    |description                          |
		|1|2|aa@gmail.com|0544300353|Need a partner to sell tomatoes|
		|5|1|bb@gmail.com.com|0211326545|Need a partner to buy my tomatoes|
		|8|1|cc@gmail.com|0455787878|A doctor to run my clinic part time|
