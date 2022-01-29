package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
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
        log.info("Click on logout link");
        logOutLink.click();
    }

    public HeaderPage expandWorkoutDropDownMenu() {
        log.info("Expand workout drop down menu");
        $(workoutDropDownMenu).hover();
        return this;
    }

    public WorkoutAddPage clickOnTheAddWorkoutButton() {
        log.info("Click on the <add workout button>");
        $(addWorkoutButton).click();
        return new WorkoutAddPage();
    }

    public void openWorkoutsCalculator() {
        log.info("Open workout calculator");
        $(workoutsCalculatorButton).click();
        switchTo().frame(intensityCalcIFrame);
    }

    public void openOtherCalculators() {
        log.info("Open other calculator");
        $(othersCalculatorsButton).click();
        switchTo().frame(otherCalcIFrame);
    }
}
