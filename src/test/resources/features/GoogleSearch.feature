Feature:  Google Search Functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results
@hicham
  Scenario: Search page default title verification
    When user is on the Google search page
    And user search apple
    Then user should see title is apple - Google

