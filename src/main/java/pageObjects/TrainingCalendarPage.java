package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class TrainingCalendarPage extends HeaderPage {

    private final SelenideElement quickAddButton = $("#QuickAddToggle");
    private final SelenideElement workoutDateField = $("#WorkoutDate");
    private final SelenideElement workoutTimeField = $("#WorkoutTime");
    private static final String SELECT_ACTIVITY = "//select[@id='ActivityType']//*[contains(text(),'%s')]";
    private final SelenideElement workoutNameField = $("#Name");
    private final SelenideElement saveButton = $("#saveButton");
    private static final String ACTIVITY_NAME = "//*[contains(text(),'%s')]";

    public TrainingCalendarPage openCalendarPagePage() {
        open(BASE_URL + "Calendar.cshtml");
        return this;
    }

    public TrainingCalendarPage openQuickAddWorkoutMenu() {
        quickAddButton.click();
        return this;
    }

    public void setDateByName(String date) {
        executeJavaScript("arguments[0].value = '';", workoutDateField);
        workoutDateField.sendKeys(date);
    }

    public TrainingCalendarPage enterWorkoutTime(String time) {
        workoutTimeField.sendKeys(time);
        return this;
    }

    public TrainingCalendarPage selectActivityType(String activityType) {
        $(By.xpath(String.format(SELECT_ACTIVITY, activityType))).click();
        return this;
    }

    public TrainingCalendarPage workoutName(String text) {
        workoutNameField.sendKeys(text);
        return this;
    }

    public TrainingCalendarPage clickOnSaveButton() {
        saveButton.click();
        return this;
    }

    public boolean isActivityTypeDisplayed(String activityType) {
        return $(By.xpath(String.format(ACTIVITY_NAME, activityType))).isDisplayed();
    }
}