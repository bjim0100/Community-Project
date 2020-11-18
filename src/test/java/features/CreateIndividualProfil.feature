Feature: User creates individual profile by adding  profile


Background:
Given user navigates to url (CP)
When user submits email (CP)
And user submits password (CP)
And user clicks login button (CP)


Scenario Outline:
Given user clicks on header (CP)
When user clicks on profile (CP)
And user clicks on edit profile (CP)
And user submits "<firstname>" firstname  (CP)
And user submits "<address>" (CP)
# And user edits Date of birth (CP)
And user sends phone number "<number>" (CP)
And user submits  gps "<gps>" (CP)
And user selects gender (CP)
And user changes privacy level (CP)
And user clicks save (CP)
Then user information should be saved successfully (CP)

Examples:
|firstname     | address  | gps         | number |
| obeng Boateng       |      Anaji     |WS-123-4564       | 0245345324|
| Kankama      |      Anaji     |BS-123-4564       | 0245777777|
| obeng Boateng       |      Anaji     |AS-123-4564       | 0544388567|