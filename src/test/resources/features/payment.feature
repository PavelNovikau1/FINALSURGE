Feature: Payment functionality.

  As a customer to use the app
  user wants to be able
  to purchase a trainer account.

  @Critical
  Scenario Template:Acquisition of a coaching account with the input of invalid payment data.
    Given User is logged on his account
    When User open coaching upgrade page
    And User select pro package yearly
    And User filling cardholder first name '<firstName>' field
    And User filling cardholder last name '<lastName>'field
    And User filling credit card number '<cardNumber>' field
    And User select card expiration date '<month>' and '<year>'
    And User filling card CVV '<cvvNumber>' field
    And User Click on the pay now button
    Then Pop up alert is is appear on the page

    Examples:
      | firstName | lastName | cardNumber               | month    | year | cvvNumber |
      | John      | Smith    | 3644 err1 2344 2345 2533 | Feb (02) | 2023 | 000       |

