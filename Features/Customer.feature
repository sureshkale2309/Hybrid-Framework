Feature: Customers

  Scenario:
    Given User launch a Firefox Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customer Menu
    And Click on customer Menu Item
    And Click on Add new button
    Then User can View Add new customer page
    When User enter customer info
    And Click on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And Close browser
