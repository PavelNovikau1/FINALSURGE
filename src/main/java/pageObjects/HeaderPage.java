package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class HeaderPage extends LoginPage{

    private final SelenideElement logOutLink = $(By.xpath("//*[contains(text(),'Logout')]"));
    private final SelenideElement userProfilePhoto = $("#LayoutProfilePic");
    private final SelenideElement workoutDropDownMenu = $(By.xpath("//*[@class='arrow_down'][contains(text(),'Workouts')]"));
    private final SelenideElement addWorkoutButton = $(By.xpath("//*[@href='WorkoutAdd.cshtml']"));
    private final SelenideElement workoutsCalculatorButton = $(By.xpath("//*[@data-reveal-id='IntensityCalc']"));
    private final SelenideElement intensityCalcIFrame = $("#IntensityCalciFrame");
    private final SelenideElement othersCalculatorsButton = $(By.xpath(" //*[@data-reveal-id='OtherCalc']"));
    private final SelenideElement otherCalcIFrame = $("#OtherCalciFrame");

    public boolean isTheProfilePhotoDisplayed() {
        return userProfilePhoto.isDisplayed();
    }

    public void logoutFromAccount(){
        logOutLink.click();
    }

    public HeaderPage expandWorkoutDropDownMenu() {
        $(workoutDropDownMenu).hover();
        return this;
    }

    public WorkoutAddPage clickOnTheAddWorkoutButton() {
        $(addWorkoutButton).click();
        return new WorkoutAddPage();
    }

    public void openWorkoutsCalculator() {
        $(workoutsCalculatorButton).click();
        switchTo().frame(intensityCalcIFrame);
    }

    public void openOtherCalculators() {
        $(othersCalculatorsButton).click();
        switchTo().frame(otherCalcIFrame);
    }
}
