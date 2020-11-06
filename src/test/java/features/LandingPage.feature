Feature: landingPage

Scenario:
Given user navigates to url(landing page)
When user sends email
And user submits password
And user clicks login(landing page)
Then user should be navigated to profile
