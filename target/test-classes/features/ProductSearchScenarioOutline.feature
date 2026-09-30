Feature: Product Search Functioanlity

# 1 test scenario used with multiple test data 
  Scenario Outline: Search for different Products
    Given User is on the Automation Exerecise homepage
    When User clicks on Products
  	And User enters "<productName>" in the search box
    And User clicks on Search button
    Then Products related to "<productName>" should be displayed

    Examples: 
      | productName  | 
      | Blue Top     | 
      | Tshirt       |
      | Dress        |
      | Saree        | 
