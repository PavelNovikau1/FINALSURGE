package page_objects;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

public class WorkoutDetailsPage extends TrainingCalendarPage {

    private static final String WORKOUT_NAME = "//*[@class='activityTypeName'][contains(text(),'%s')]";

    public Boolean isActivityDisplayed(String name) {
        return $(By.xpath(String.format(WORKOUT_NAME, name))).isDisplayed();
    }
}
