Feature: ForumPosts_delete

Scenario:
Given user navigates to url (FP_D)
When user submits email and password (FP_D)
And user clicks login (FP_D)
And user clicks Forum (FP_D)
And user clicks my post (FP_D)
And user clicks on delete (FP_D)
Then a prompt will appear for user to click yes (FP_D)