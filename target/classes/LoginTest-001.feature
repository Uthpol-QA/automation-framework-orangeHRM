@smoketest_001

Feature:       Login function test with valid credential, positive scenario

Description:   valid user can login successfully by using valid credential

  @TC_001
  
  Scenario: as a user, I must log in successfully with a valid credential
    Given Open a browser
    And go to URL
    
    When select user and put user name
    And select password and put password
    And click sign in button
    
    Then validate outcomes,if sign out button is there --> test passed


    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
