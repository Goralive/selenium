Feature:
  As an enterprenuer
  I want to register a business project
  Scenario: Register a new project
    Given I am on new project registration page
    When I fill my first name "Igor" and last name "Nosovskyi"
    And I fill my city "Kiev"
    And I fill my phone "272-03-14"
    And I fill my email "chipolino@mail.com"
    And I fill my password "QAZxsw123789"


#Feature: Hello Cucumber
#  As a product manager
#  I want our users to be greeted when they visit our site
#  So that they have a better experience
#
#  Scenario: User sees the welcome message
#    When I go to the homepage
#    Then I should see the welcome message


#Feature: <feature title>
#  As a <persona|role>
#  I want to <action>
#  So that <outcome>