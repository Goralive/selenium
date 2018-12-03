Feature:
  As an existing user
  I want to be able to add to log in to my Facebook account.
  Scenario: Login with a Facebook account.
    Given I am on Facebook login page
    When I fill my email "1501sez1@gmail.com"
    And I fill my password "aB123456"
    And I click on 'LogIn'
    Then I'm login with current profile

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
  #1501sez1@gmail.com aB123456