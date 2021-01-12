Feature: BLog

Scenario: Viewing my post
Given user navigates to url (VMBP)
When user submits email and password (VMBP)
And user clicks login (VMBP)
And user clicks blog (VMBP)
And user clicks view my post (VMBP)
Then all blog post should appear (VMBP) 