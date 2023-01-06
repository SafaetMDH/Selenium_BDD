Feature: Grocery Items Test Automation

Background:
  Given a user is in the home page

  #TC001
  Scenario: User checking the search functionalities

    When user enters item name on search bar
    And user click on search button
    Then user validated the search result

  #TC002
  Scenario: User adding a item to pickup from Grocery

    When user navigating to Grocery
    And from Grocery user select "<Grocery Deals>"
    Then user select a item name "<Nestle-pure>"
    And user should able to add that item for PickUp

  #TC003
  Scenario: User validating a item price from Grocery Produce

    When user navigating to "<Fresh Fruit>" from Grocery "<Produce>"
    And user select "<Organic Bananas - 2lb>"
    Then user should validate the "<Price>"

  #TC004
  Scenario: From Dairy and Milk Subcategory user search a item by Type and Brand

    When user navigating to Dairy from Grocery
    And user select "<eggnog>" Type and "<Almond Breeze>" Brand from Milk
    Then user should able to select the item

  #TC005
  Scenario: From Meat and Seafood Beef Items user add a item with different quantity

    When user navigate to Meat adn Seafood Beef Items
    And user select item name "<Beef MeatBalls>"
    Then user then validate the title
    And user should able to add that item for delivery