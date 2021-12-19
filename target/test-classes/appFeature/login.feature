 
Feature: Login page feature
 
Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then user enters username and password
    Then user clicks on login button
   
Scenario: Adding items to the cart
		Given user is in product items
		When  user select the item and user click on ADD TO CART
		Then  user move BACK TO PRODUCTS
		Then  user add another item and ADD TO CART
		Then  Again user select the item and ADD TO CART
		   

Scenario: Removing an item to the cart
		Given User goto YOUR CART and REMOVE an item
		When  User click on CHECKOUT
		Then  CHECKOUT INFORMAtION
		Then  User Click on CONTINUE Button and click FINISH