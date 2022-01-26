package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class WorkoutAddPage extends TrainingCalendarPage {

    private static final String ACTIVITY_TYPE = "//*[@class='accordion-group']//*[contains(text(),'%s')]";
    private final SelenideElement workoutNameField = $("#Name");
    private final SelenideElement descriptionField = $("#Desc");
    private final SelenideElement saveButton = $(By.xpath("//*[@id='saveButton']"));

    public WorkoutAddPage selectActivityType(String activityType) {
        $(By.xpath(String.format(ACTIVITY_TYPE, activityType))).click();
        return this;
    }

    public WorkoutAddPage fillingWorkoutNameField(String name) {
        workoutNameField.sendKeys(name);
        return this;
    }

    public WorkoutAddPage fillingDescriptionNameField(String description) {
        descriptionField.sendKeys(description);
        return this;
    }

    public WorkoutDetailsPage clickOnSaveButton() {
        saveButton.click();
        return new WorkoutDetailsPage();
    }
}
