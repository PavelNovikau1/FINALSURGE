package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StatisticSteps extends AbstractSteps {
    @When("User open workout report page")
    public void userOpenWorkoutReportPage() {
        workoutReportPage.openWorkoutReportPage();
    }

    @And("User select report view group by month")
    public void userSelectReportViewGroupByMonth() {
        workoutReportPage.clickOnTheGroupByMonthRadioButton();
    }

    @And("User click on the view report button")
    public void userClickOnTheViewReportButton() {
        workoutReportPage.clickOnTheViewReportButton();
    }

    @Then("Athlete workout report table is appear on the page")
    public void athleteWorkoutReportTableIsAppearOnThePage() {
        Assert.assertTrue(workoutReportPage.isAthleteWorkoutReportTableDisplayed());
    }
}
