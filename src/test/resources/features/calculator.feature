Feature: Calculators functionality.

  As a customer to use the application
  the user wants to have a possibility
  to calculate a number steps per workout
  and daily calorie requirement.

  @SmokeTest
  Scenario Template: Calculate the pace of workout.
    Given User is logged on his account
    And User open intensity calculator on the header
    And User select event Marathon by clicking on radio button
    And User enter event time '<hours>' '<minutes>' '<seconds>'
    When User click on calculate passes button
    Then Workouts paces result table is open

    Examples:
      | hours | minutes | seconds |
      | 7     | 24      | 36      |

  @SmokeTest
  Scenario Template: Calculate daily caloric needs.
    Given User is logged on his account
    And User open other calculators on the header
    And User enter '<weight>' '<height>' '<age>' '<distance>'
    And User chose male gender radio button
    When User click on the calculate caloric needs button
    Then Today caloric needs table is displayed

    Examples:
      | weight | height | age | distance |
      | 210    | 73     | 95  | 20       |