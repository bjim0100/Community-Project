@COMMUNITY-423
@REQ_COMMUNITY-2
Feature: Add products

	#Tests As a registered business I want to add products so that individuals can view and express interest in the product.
	#
	#*Acceptance Criteria:*
	#
	## User should be logged in to add product
	## User clicks on add product to display add product form with the following details:
	### Product name: required
	### Type (product/service): required
	### Description
	### Price: Required
	### category(dropdown), Required (prepopulated list provided by BAs)
	### discount(%age) :optional 
	### User clicks on add image to attach image(s) (up to 3) to the add to product-form
	## After successful validation of the input fields users click on the save/add a button to save the product.
	@TEST_COMMUNITY-417 @REQ_COMMUNITY-14 @TESTSET_COMMUNITY-365
	Scenario Outline: Automated adding products(scenarios)
		Given user navigates to url (add product)
		When user sends email and password
		And user clicks login
		And user clicks market
		And user clicks add products
		And user submits name "<name>"
		And user submits type "<type>"
		And user submits description "<description>"
		And user submits price "<price>"
		And user submits category "<category>"
		And user clicks save
		Then user sees a message "<message>"
		
		Examples:
		  |name|type|description|price|category|message|
		  | Shoe|product |It is a shoe | 30 | Phones, Tablets and Computers | Product Added Successfully  |
#		  | Doctor|services |give health advice|  |services|     |
   #	  |     |services |give health advice| 40|  services   |     |
  #	  |    Nurse M |services |give health advice| 40|Plastics and Rubbers| Product Added Successfully|
#		  | Shoe|product |It is a shoe | 50  |Shoes, Sandals and Footwears | Product Added Successfully|
