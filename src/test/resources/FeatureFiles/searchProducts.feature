Feature: To search products
  I want to search products
 
  @tag1
  Scenario: Drop down based search
    Given I am logged into the website
    When I choose to search based on drop down
    Then I see products displayed    
