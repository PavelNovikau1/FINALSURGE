package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalculatorSteps extends AbstractSteps {

    @And("User open intensity calculator on the header")
    public void userOpenIntensityCalculatorOnTheHeader() {
        headerPage.openWorkoutsCalculator();
    }

    @And("User select event Marathon by clicking on radio button")
    public void userSelectEventMarathonByClickingOnRadioButton() {
        workoutsCalculatorModalPage.clickOnTheMarathonRadioButton();
    }

    @And("User enter event time {string} {string} {string}")
    public void userEnterEventTime(String hours, String minutes, String seconds) {
        workoutsCalculatorModalPage.enterHours(hours)
                .enterMinutes(minutes)
                .enterSeconds(seconds);
    }

    @And("User click on calculate passes button")
    public void userClickOnCalculatePassesButton() {
        workoutsCalculatorModalPage.clickOnCalculatePacesButton();
    }

    @Then("Workouts paces result table is open")
    public void workoutsPacesResultTableIsOpen() {
        Assert.assertTrue(workoutsCalculatorModalPage.isWorkoutPacesResultTableDisplayed());
    }

    @And("User open other calculators on the header")
    public void userOpenOtherCalculatorsOnTheHeader() {
        headerPage.openOtherCalculators();
    }

    @And("User enter {string} {string} {string} {string}")
    public void userEnterWeightHeightSecondsDistance(String weight, String height, String age, String distance) {
        otherCalculatorsModalPage.enterWeight(weight)
                .enterHeight(height)
                .enterAge(age)
                .enterRunDistance(distance);
    }

    @And("User chose male gender radio button")
    public void userChoseMaleGenderRadioButton() {
        otherCalculatorsModalPage.clickOnTheMaleRadioButton();
    }


    @When("User click on the calculate caloric needs button")
    public void userClickOnTheCalculateCaloricNeedsButton() {
        otherCalculatorsModalPage.clickOnTheCalculateCaloricNeedsButton();
    }

    @Then("Today caloric needs table is displayed")
    public void todayCaloricNeedsTableIsDisplayed() {
        Assert.assertTrue(otherCalculatorsModalPage.isCaloricNeedsTableDisplayed());
    }
}
