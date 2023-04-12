Feature: Login

  
  Scenario: Successful Login with valid credentials
    Given User launch a Firefox Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title Should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    And Close browser

  
  Scenario Outline: Login Data Driven
    Given User launch a Firefox Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title Should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    And Close browser

    Examples:
      | email               | password |
      | admin@yourstore.com | admin    |
      | admin1@yourstore.com | admin123 |