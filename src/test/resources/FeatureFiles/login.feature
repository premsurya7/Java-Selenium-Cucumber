Feature: Login Functionality
  To Validate login functionality

	@tag1
  Scenario: Validate login functionality
    Given I launch the website   
    When I provide username and password
    And Click on login button   
    Then I am logged into the website   
