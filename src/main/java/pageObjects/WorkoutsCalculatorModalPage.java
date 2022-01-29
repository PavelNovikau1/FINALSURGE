package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class WorkoutsCalculatorModalPage extends HeaderPage {

    private final SelenideElement marathonRadioButton = $(By.xpath("//*[@id='MARATHON']"));
    private final SelenideElement hoursInputField = $("#TimeHH");
    private final SelenideElement minutesInputField = $("#TimeMM");
    private final SelenideElement secondsInputField = $("#TimeSS");
    private final SelenideElement calculatePacesButton = $(" #saveButtonSettings");
    private final SelenideElement workOutsPacesResultTable = $(By.xpath("//*[contains(text(),'Your Workout Paces')]"));

    public void clickOnTheMarathonRadioButton(){
        log.info("Click on the <marathon radio button>");
        marathonRadioButton.click();
    }

    public WorkoutsCalculatorModalPage enterHours(String value){
        log.info(String.format("Enter value: '%s' into hours input field", value));
        hoursInputField.sendKeys(value);
        return this;
    }

    public WorkoutsCalculatorModalPage enterMinutes(String value){
        log.info(String.format("Enter value: '%s' into minutes input field", value));
        minutesInputField.sendKeys(value);
        return this;
    }
    public WorkoutsCalculatorModalPage enterSeconds(String value){
        log.info(String.format("Enter value: '%s' into seconds input field", value));
        secondsInputField.sendKeys(value);
        return this;
    }
    public WorkoutsCalculatorModalPage clickOnCalculatePacesButton(){
        log.info("Click on the <calculate paces button>");
        calculatePacesButton.click();
        return this;
    }

    public boolean isWorkoutPacesResultTableDisplayed(){
        return workOutsPacesResultTable.isDisplayed();
    }
}
