Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User is on the login Page
    When User enters valid username "test@gmail.com"
    And User enters valid password "Test123"
    And User clicks on the login button
    Then User should navigate to the home page
   
 