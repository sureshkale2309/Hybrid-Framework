Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch firefox browser
    When I open orangeHrm homepage
    Then I verify that the logo present on page
    And close browser
