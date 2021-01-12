Feature: Blog post

Scenario Outline:
Given user navigates to url (CBP)
When user submits email and password (CBP)
And user clicks login (CBP)
And user clicks blog (CBP)
And user clicks add my post (CBP)
And user sends "<title>" title(CBP)
And user selects "<category>" category(CBP)
And user sends "<description>" description(CBP)
And user sends "<contact>"  contact(CBP)
And user sends "<videoURL>" videoURL(CBP)
And user clicks post (CBP)
Then post should appear in my blog posts (CBP)

Examples: 
|title |category|description|contact|videoURL|
|title |category|description|contact|videoURL|
|title |category|description|contact|videoURL|
|title |category|description|contact|videoURL|
