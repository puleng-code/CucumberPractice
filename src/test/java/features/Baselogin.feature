#Feature: Login
#  Scenario Outline: As a user I want to verify that I am logged in successfully
#    Given I am on Login page
#    And I enter the username <user_name>
#    And I enter the password <pass>
#    When I click on login button
#    Then The homepage is displayed
#    Then I quit the browser
#    Examples:
#      | user_name               | pass         |
#      | standard_user           | secret_sauce |
##      | problem_user            | secret_sauce |
##      | performance_glitch_user | secret_sauce |