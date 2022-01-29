Feature: Workouts reports & statistic functionality.

  As a customer to use the app
  user wants to be able to view
  workouts reports.

  @SmokeTest
  Scenario: View athlete workout report activities
    Given User is logged on his account
    And User open workout report page
    And User select report view group by month
    When User click on the view report button
    Then Athlete workout report table is appear on the page


