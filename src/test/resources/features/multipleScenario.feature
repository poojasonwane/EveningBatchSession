Feature: Product Search Functionality
 
 Background:
 		Given User is on the Products page
 
  Scenario: Search for an existing product
    Given User is on the Automation Exercise homepage
    When User clicks on products
    And Users enters "Blue Top" in the search box 
    And User clicks search button
    Then Matching products should be displayed
    
#  Scenario: Search for multiple products
#    
#    When User searches for "Tshirt"
#    Then Relevant products should be displayed
    
#  Scenario: Search for a non-existing product
#  	Given User is on the Products page
#  	When User searches for "XYZ123Non-existing"
#  	Then No Matching products should be displayed
  	
#  Scenario: Search with empty input
# 	Given User is on the Products page
#  	When User clicks on search without entering a product
# 	Then Search should not return a matching product list
  	
#  Scenario: verify searched product details
#  	Given User is on the Products page
#  	When User searches for "Blue Top"
#  	Then Product name and price should be displayed
  	
    
    
 

 