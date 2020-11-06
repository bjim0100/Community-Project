@COMMUNITY-553
@REQ_COMMUNITY-2
Feature: Marketplace

	#Tests As a user I want to be able to see one product and all the details at a time if I select product  from product list  
	#
	#Acceptance Criteria
	#
	##  List of all product must be available  to the user to  click on a particular product 
	## The user clicks on a particular product and individual product page loads up with all the details ( product title , images, price , quantity text field, add to cart button , business title,  business address )
	## User should be able to view one product and all the product details at a time
	@TEST_COMMUNITY-566 @REQ_COMMUNITY-18 @TESTSET_COMMUNITY-546
	Scenario Outline: Automated view one product
		Given user navigates to url (view one product)
		When user logs in (view one product)
		And user clicks save (view one product)
		And user clicks on market (view one product)
		And user clicks on product "<product>" (view one product)
		Then user should see a single product "<url>" (view one product)
		
		Examples:
		| product | url |
		|   http://20.52.44.20/market/1     |http://20.52.44.20/market/1   |
		| http://20.52.44.20/market/2       | http://20.52.44.20/market/2   |
		|  http://20.52.44.20/market/3      |  http://20.52.44.20/market/3  |
