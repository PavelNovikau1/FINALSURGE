package page_objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class TrainingCalendarPage extends HeaderPage {

    private final SelenideElement quickAddButton = $("#QuickAddToggle");
    private final SelenideElement workoutDateField = $("#WorkoutDate");
    private final SelenideElement workoutTimeField = $("#WorkoutTime");
    private static final String SELECT_ACTIVITY = "//select[@id='ActivityType']//*[contains(text(),'%s')]";
    private final SelenideElement workoutNameField = $("#Name");
    private final SelenideElement saveButton = $("#saveButton");
    private static final String ACTIVITY_NAME = "//*[contains(text(),'%s')]";

    public TrainingCalendarPage openCalendarPagePage() {
        openPage("Calendar.cshtml");
        return this;
    }

    public TrainingCalendarPage openQuickAddWorkoutMenu() {
        log.info("Click on the <quick add button>");
        quickAddButton.click();
        return this;
    }

    public void setDateByName(String date) {
        executeJavaScript("arguments[0].value = '';", workoutDateField);
        log.info(String.format("Set date: '%s' workout date field", date));
        workoutDateField.sendKeys(date);
    }

    public TrainingCalendarPage enterWorkoutTime(String time) {
        log.info(String.format("Set time: '%s' workout time field", time));
        workoutTimeField.sendKeys(time);
        return this;
    }

    public TrainingCalendarPage selectActivityType(String activityType) {
        log.info(String.format("Select: '%s' activity from list", activityType));
        $(By.xpath(String.format(SELECT_ACTIVITY, activityType))).click();
        return this;
    }

    public TrainingCalendarPage workoutName(String text) {
        log.info(String.format("Enter text: '%s' into workout name field", text));
        workoutNameField.sendKeys(text);
        return this;
    }

    public TrainingCalendarPage clickOnSaveButton() {
        log.info("Click on <save button>");
        saveButton.click();
        return this;
    }

    public boolean isActivityTypeDisplayed(String activityType) {
        return $(By.xpath(String.format(ACTIVITY_NAME, activityType))).isDisplayed();
    }
}