Feature: Logging in to Vodacom Application

  Scenario Outline: Logging in to Vodacom WebApplication
    Given I Visit the Vodacom Login page
    When I enter my vodacom username "<username1>"
    And I enter my vodacom password "<password1>"
    Then I click on the Accept Cookies Button
    Then I click on the Next button

    @QA
    Examples:
      | username1  | password1 |
      | 2701578524 | Testing1  |
