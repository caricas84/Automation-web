# Autor: Carolina Castaño González
# language: en

Feature: SauceDemo Login

  Scenario: Successful login

    Given that the user opens the application
    When enter valid credentials
    Then you should see the products page