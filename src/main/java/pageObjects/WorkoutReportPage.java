package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class WorkoutReportPage extends HeaderPage {

    private final SelenideElement groupByMonthRadioButton = $("#groupBy3");
    private final SelenideElement viewReportButton = $("#saveButton");
    private final SelenideElement athleteWorkoutReportTable = $(By.xpath("//*[@class='w-box w-box-blue']//*[contains(text(),'Athlete Workout Report')]"));
    public void openWorkoutReportPage() {
        open(BASE_URL + "WorkoutReport.cshtml");
    }

    public WorkoutReportPage clickOnTheGroupByMonthRadioButton() {
        groupByMonthRadioButton.click();
        return this;
    }

    public WorkoutReportPage clickOnTheViewReportButton() {
        viewReportButton.click();
        return this;
    }

    public boolean isAthleteWorkoutReportTableDisplayed() {
        return athleteWorkoutReportTable.isDisplayed();
    }
}
