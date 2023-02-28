Feature: bing funcontonality
@bing
  Scenario: Bing Search Title Verification
    When user user in bing page
    And  user search orange
    Then user should see the title orange – Search