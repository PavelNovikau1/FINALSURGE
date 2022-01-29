Feature: Equipment functionality.

  As a customer to use the app
  user wants to manage his training equipment

  @SmokeTest
  Scenario Template: Add equipment
    Given User is logged on his account
    When User open Equipment page
    And User click on current equipment type shoes
    And User filling shoe name '<Name>' field
    And User select shoes brand '<Brand>'
    And User filling model name '<Model>' field
    And User enter cost '<Cost>'
    And User select shoe size '<Size>'
    And User press on add shoe button
    Then New added shoes name '<Name>' is displayed in current shoes table

    Examples:
      | Name                                    | Brand  | Model               | Cost   | Size |
      | My favorite Shoes                       | Nike   | Air max 90          | 119.99 | 9    |
      | Sneakers for running away from the cops | adidas | Ultraboost 21 Tokyo | 159.99 | 10   |
