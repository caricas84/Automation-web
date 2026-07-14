# Autor: Carolina Castaño González
# language: en

Feature: Shopping cart

  Scenario: Add a product to the cart

    Given that the user opens the application
    When enter valid credentials
    And add the Sauce Labs Backpack product
    And open the shopping cart
    Then you should see the Sauce Labs Backpack product
