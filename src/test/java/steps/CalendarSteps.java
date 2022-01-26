package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.PropertyReader;

public class CalendarSteps extends AbstractSteps {

    @Given("User is logged on his account")
    public void userIsLoggedOnHisAccount() {
        loginPage.openLoginPage()
                .login(System.getProperty("email", PropertyReader.getProperty("email")),
                        System.getProperty("password", PropertyReader.getProperty("password")));
    }

    @When("User open calendar page")
    public void userOpenCalendarPage() {
        trainingCalendarPage.openCalendarPagePage();
    }

    @And("User click on quick add button")
    public void userClickOnQuickAddButton() {
        trainingCalendarPage.openQuickAddWorkoutMenu();
    }

    @And("User enters a date {string}")
    public void userEntersADate(String date) {
        trainingCalendarPage.setDateByName(date);
    }

    @And("User enters a time of day {string}")
    public void userEntersATimeOfDay(String time) {
        trainingCalendarPage.enterWorkoutTime(time);
    }

    @And("User select activity type {string}")
    public void userSelectActivityType(String activityType) {
        trainingCalendarPage.selectActivityType(activityType);
    }

    @And("User named activity as {string}")
    public void userNamedActivity(String name) {
        trainingCalendarPage.workoutName(name);
    }

    @And("User click on the Add Workout button")
    public void userClickOnTheAddWorkoutButton() {
        trainingCalendarPage.clickOnSaveButton();
    }

    @Then("Activity {string} is appear on the calendar")
    public void activityNameIsAppearOnTheCalendar(String activity) {
        Assert.assertTrue(trainingCalendarPage.isActivityTypeDisplayed(activity));
    }
}
