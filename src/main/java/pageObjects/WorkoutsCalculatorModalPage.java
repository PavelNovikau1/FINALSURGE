package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class WorkoutsCalculatorModalPage extends HeaderPage {

    private final SelenideElement marathonRadioButton = $(By.xpath("//*[@id='MARATHON']"));
    private final SelenideElement hoursInputField = $("#TimeHH");
    private final SelenideElement minutesInputField = $("#TimeMM");
    private final SelenideElement secondsInputField = $("#TimeSS");
    private final SelenideElement calculatePacesButton = $(" #saveButtonSettings");
    private final SelenideElement workOutsPacesResultTable = $(By.xpath("//*[contains(text(),'Your Workout Paces')]"));

    public void clickOnTheMarathonRadioButton(){
        marathonRadioButton.click();
    }

    public WorkoutsCalculatorModalPage enterHours(String value){
        hoursInputField.sendKeys(value);
        return this;
    }

    public WorkoutsCalculatorModalPage enterMinutes(String value){
        minutesInputField.sendKeys(value);
        return this;
    }
    public WorkoutsCalculatorModalPage enterSeconds(String value){
        secondsInputField.sendKeys(value);
        return this;
    }
    public WorkoutsCalculatorModalPage clickOnCalculatePacesButton(){
        calculatePacesButton.click();
        return this;
    }

    public boolean isWorkoutPacesResultTableDisplayed(){
        return workOutsPacesResultTable.isDisplayed();
    }
}
