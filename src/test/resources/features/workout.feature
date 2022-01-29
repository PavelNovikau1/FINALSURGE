Feature: Workout add functionality.

  As a customer to use the application
  user wants to add a workout
  with a choice of activities

  @SmokeTest
  Scenario Template: Add workout
    Given User is logged on his account
    When User expand Workouts drop down menu on the header
    And User click on the add workout button
    And User select Activity Type '<activity>'
    And User enters a date '<date>'
    And User enters a time of day '<time>'
    And User filling workout name '<name>' field
    And User filling description '<description>' field
    And User click on the add new workout button
    Then Workout activity '<activity>' is displayed on the workout details page


    Examples:
      | activity          | date       | time     | name         | description                   |
      | Strength Training | 01/20/2022 | 11:15 AM | Best workout | Train hard like Chuck Norris! |




