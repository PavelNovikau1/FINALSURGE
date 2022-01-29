package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class OtherCalculatorsModalPage extends HeaderPage {

    private final SelenideElement weightInputField = $("#Weight");
    private final SelenideElement heightInputField = $("#HeightInchCent");
    private final SelenideElement ageInputField = $("#Age");
    private final SelenideElement runDistanceInputField = $("#RunDist");
    private final SelenideElement maleGenderRadioButton = $("#optionsRadios5");
    private final SelenideElement calculateCaloricNeedsButton = $(" #saveButtonSettings");
    private final SelenideElement caloricNeedsTable = $(By.xpath("//*[contains(text(),'Total Calories Required')] "));

    public OtherCalculatorsModalPage enterWeight(String value) {
        log.info(String.format("Enter value: '%s' into weight field", value));
        weightInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage enterHeight(String value) {
        log.info(String.format("Enter value: '%s' into height field", value));
        heightInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage enterAge(String value) {
        log.info(String.format("Enter value: '%s' into age field", value));
        ageInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage enterRunDistance(String value) {
        log.info(String.format("Enter value: '%s' into distance field", value));
        runDistanceInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage clickOnTheMaleRadioButton() {
        log.info("Select <MALE> radio button");
        maleGenderRadioButton.click();
        return this;
    }
    public OtherCalculatorsModalPage clickOnTheCalculateCaloricNeedsButton() {
        log.info("Click oon the calculate button");
        calculateCaloricNeedsButton.click();
        return this;
    }

    public boolean isCaloricNeedsTableDisplayed(){
        return caloricNeedsTable.isDisplayed();
    }
}
