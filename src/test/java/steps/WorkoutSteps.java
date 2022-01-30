package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WorkoutSteps extends AbstractSteps {

    @And("User expand Workouts drop down menu on the header")
    public void userExpandWorkoutsDropDownMenuOnTheHeader() {
        headerPage.expandWorkoutDropDownMenu();
    }

    @And("User click on the add workout button")
    public void userClickOnTheAddWorkoutButton() {
        headerPage.clickOnTheAddWorkoutButton();
    }

    @And("User select Activity Type {string}")
    public void userSelectActivity(String activity) {
        workoutAddPage.selectActivityType(activity);
    }

    @And("User filling workout name {string} field")
    public void userFillingWorkoutNameField(String name) {
        workoutAddPage.fillingWorkoutNameField(name);
    }

    @And("User filling description {string} field")
    public void userFillingDescriptionField(String description) {
        workoutAddPage.fillingDescriptionNameField(description);
    }

    @When("User click on the add new workout button")
    public void userClickOnTheAddNewWorkoutButton() {
        workoutAddPage.clickOnSaveButton();
    }

    @Then("Workout activity {string} is displayed on the workout details page")
    public void isWorkoutActivityDisplayedOnTheWorkoutDetailsPage(String activity) {
        Assert.assertTrue(workoutDetailsPage.isActivityDisplayed(activity));
    }
}
