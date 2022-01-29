Feature: Login and logout functionality.

  As a customer in order to use the application
  the user wants to login with email and password
  & log out from account.

  @SmokeTest
  Scenario: Login with valid credentials
    Given User open login page
    When User entered valid email and password
    And User click on the login button
    Then Verify dashboard page is opened

  @Critical
  Scenario Template: Login with invalid credentials
    Given User open login page
    When User entered invalid email '<email>' and password '<password>'
    And User click on the login button
    Then Alert '<message>' is appear on the page

    Examples:
      | email         | password           | message                                      |
      | user@mail.com | 12345              | Invalid login credentials. Please try again. |
      | admin@vk.com  | verystrongpassword | Invalid login credentials. Please try again. |

  @SmokeTest
  Scenario Template: Successful logout from account
    Given User open login page
    When User entered valid email and password
    And User click on the login button
    And User click on the logout link on the header
    Then Message '<message>' of successful logout is appear on the logout page

    Examples:
      | message                                              |
      | You have been successfully logged out of the system. |