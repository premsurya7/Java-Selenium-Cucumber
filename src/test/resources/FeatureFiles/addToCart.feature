Feature: Add product to cart
 To add products to Cart

	@tag1
  Scenario: Add product to cart
  	Given I am logged into the website
    When I choose to add a product to cart
    And I navigate to cart
    Then I see product is added to cart successfully
