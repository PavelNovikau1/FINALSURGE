Feature: Calendar functionality.

  As a customer to use the app
  user wants to quickly add a workout
  on the calendar page menu.

  @SmokeTest
  Scenario Template: Workout quick add
    Given User is logged on his account
    And User open calendar page
    And User click on quick add button
    And User enters a date '<date>'
    And User enters a time of day '<time>'
    And User select activity type '<activity>'
    And User named activity as '<name>'
    When User click on the Add Workout button
    Then Activity '<name>' is appear on the calendar

    Examples:
      | date       | time     | activity | name                    |
      | 02/18/2022 | 11:15 AM | Walk     | walking on the park     |
      | 02/20/2022 | 7:15 pM  | Bike     | driven on the mountains |

