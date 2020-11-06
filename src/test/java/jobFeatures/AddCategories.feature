@COMMUNITY-713
Feature: Automated Adding job categories

	@TEST_COMMUNITY-765
	Scenario Outline: Automated Adding job categories
		Given user navigates to url (addcategory)
		When user submits email and passwword (addcategory)
		And user clicks login (addcategory)
		And user clicks on job (addcategory)
		And user clicks on job categories (addcategory)
		And user clicks on add category (addcategory)
		And user types category "<category>"
		
		Examples:
		|category|
		|Education|
		|Sports|
		|Phones and Accessories|
		|Groceries|
