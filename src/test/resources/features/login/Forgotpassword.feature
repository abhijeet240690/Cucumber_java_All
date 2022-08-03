Feature: Forgot password page

  Scenario Outline: Open the forgot password page
    Given I Visit the Vodacom Login page
    When I enter my vodacom username "<username1>"
    And  I enter my vodacom password "<password1>"
    Then I click on the Accept Cookies Button
    Then I click on the forgot password link
    Then I hover on the shop menu

    @QA
    Examples:
      | username1  | password1 |
      | 2701500024 | Testing2  |