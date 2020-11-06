@COMMUNITY-553
@REQ_COMMUNITY-2
Feature: Marketplace

	#Tests As a customer I want to be able to add selected list of item to cart  ***************
	#
	#Acceptance Criteria: 
	#
	## For guest/logged-in users, Any request add to the cart return and increase the counter value and display the total  list of items 
	## User must be able to select product of their choice to cart 
	## The user must be able to add to cart from different business
	## User must see price of each product and the total price of all selected product to cart
	##  The cart currency is set to ghs 
	## The price of the product added to cart is calculated in ghs
	@TEST_COMMUNITY-631 @REQ_COMMUNITY-437 @TESTSET_COMMUNITY-547
	Scenario Outline: Automated Adding product to Cart
		Given user navigates to url (add to cart)
		When user logs in (add to cart)
		And user clicks login (add to cart)
		And user clicks market (add to cart)
		And user clicks on product "<product>" (add to cart)
		And user clicks cart (add to cart) 
		
		Examples:
		|product|
		|    http://20.52.44.20/market/1  |
		|    http://20.52.44.20/market/2   |
		|    http://20.52.44.20/market/3  |