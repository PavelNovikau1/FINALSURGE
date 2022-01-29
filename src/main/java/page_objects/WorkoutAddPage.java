package page_objects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class WorkoutAddPage extends TrainingCalendarPage {

    private static final String ACTIVITY_TYPE = "//*[@class='accordion-group']//*[contains(text(),'%s')]";
    private final SelenideElement workoutNameField = $("#Name");
    private final SelenideElement descriptionField = $("#Desc");
    private final SelenideElement saveButton = $(By.xpath("//*[@id='saveButton']"));

    public WorkoutAddPage selectActivityType(String activityType) {
        log.info(String.format("Select: '%s' activity from list", activityType));
        $(By.xpath(String.format(ACTIVITY_TYPE, activityType))).click();
        return this;
    }

    public WorkoutAddPage fillingWorkoutNameField(String name) {
        log.info(String.format("Enter text: '%s' into workout name field", name));
        workoutNameField.sendKeys(name);
        return this;
    }

    public WorkoutAddPage fillingDescriptionNameField(String description) {
        log.info(String.format("Enter text: '%s' into description name field", description));
        descriptionField.sendKeys(description);
        return this;
    }

    public WorkoutDetailsPage clickOnSaveButton() {
        log.info("Click on the <save button>");
        saveButton.click();
        return new WorkoutDetailsPage();
    }
}
