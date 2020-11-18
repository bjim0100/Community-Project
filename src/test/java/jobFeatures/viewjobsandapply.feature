Feature: View job and apply

Scenario:
Given user naviagates to url  (VJ)
When user submits email and password (VJ)
And user clicks login (VJ)
And user clicks job (VJ)
And user clicks job title (VJ) 
And user clicks apply (VJ)
Then user should see a response prompt (VJ)