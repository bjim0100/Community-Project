Feature: User creates individual profile by adding  profile


Background:
Given user navigates to url
When user submits email
And user submits password
And user clicks login button


Scenario Outline:
Given user clicks on header
When user clicks on profile
And user clicks on edit profile
And user submits "<firstname>" firstname 
And user submits "<address>"
And user edits Date of birth
And user sends phone number "<number>"
And user submits  gps "<gps>" 
And user selects gender
And user changes privacy level
And user clicks save
Then user information should be saved successfully 

Examples:
|firstname     | address  | gps         | number |
| obeng Boateng       |      Anaji     |WS-123-4564       | 0245345324|
| obeng Boateng       |      Anaji     |BS-123-4564       | 0245777777|
| obeng Boateng       |      Anaji     |AS-123-4564       | 0544388567|