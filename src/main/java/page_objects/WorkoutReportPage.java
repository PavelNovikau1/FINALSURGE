package page_objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class WorkoutReportPage extends HeaderPage {

    private final SelenideElement groupByMonthRadioButton = $("#groupBy3");
    private final SelenideElement viewReportButton = $("#saveButton");
    private final SelenideElement athleteWorkoutReportTable = $(By.xpath("//*[@class='w-box w-box-blue']//*[contains(text(),'Athlete Workout Report')]"));
    public void openWorkoutReportPage() {
        open(BASE_URL + "WorkoutReport.cshtml");
    }

    public WorkoutReportPage clickOnTheGroupByMonthRadioButton() {
        log.info("Click on the <group by month radio button>");
        groupByMonthRadioButton.click();
        return this;
    }

    public WorkoutReportPage clickOnTheViewReportButton() {
        log.info("Click on the <view report button>");
        viewReportButton.click();
        return this;
    }

    public boolean isAthleteWorkoutReportTableDisplayed() {
        return athleteWorkoutReportTable.isDisplayed();
    }
}
