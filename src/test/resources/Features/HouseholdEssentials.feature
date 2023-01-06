Feature: HouseHold Essentials Items Test Automation

  Background:
    Given user is in the Home Page

  #TC006
  Scenario: User add a item from Laundry Care and validate price

    When user navigate to Household Essentials subcategory Laundry Care
    And user select a item name Ariel
    Then user should able to add that Arial Detergent for PickUpInStore

#  #TC007
#  Scenario: A user select a item from Toilet Paper
#
#    When user navigate to "<Toilet Paper>" from "<Household Essentials>"
#    And user select this "<Best Available Toilet Paper>"
#    Then user should able to see the price "<$12.99>"
#
#  #TC008
#  Scenario: From Cleaning Tools add a item to ship
#
#    When user navigate to the "<Cleaning Tools>" from "<Household>"
#    And user select a item name from "<Clorox ToiletWand>"
#    Then user should able to add the item to ship
#
#  #TC009
#  Scenario: From Hand Sanitizer check the Suave Hand Sanitizer Price
#
#    When user navigate to Hand Soap & Sanitizers from Hand Soap & Sanitizers
#    And user select sanitizer "<Suave Hand Sanitizer>"
#    Then user should able to see the price
#
#  #TC010
#  Scenario: From Household essentials deals filter product range $50-$100
#
#    When user navigating to "<Household Essentials Deals>" from "<Household Essentials>"
#    And user filter the "<Price>" to desired price
#    Then user should able to find the items  by price ranged