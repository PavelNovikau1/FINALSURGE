package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class OtherCalculatorsModalPage extends HeaderPage {

    private final SelenideElement weightInputField = $("#Weight");
    private final SelenideElement heightInputField = $("#HeightInchCent");
    private final SelenideElement ageInputField = $("#Age");
    private final SelenideElement runDistanceInputField = $("#RunDist");
    private final SelenideElement maleGenderRadioButton = $("#optionsRadios5");
    private final SelenideElement calculateCaloricNeedsButton = $(" #saveButtonSettings");
    private final SelenideElement caloricNeedsTable = $(By.xpath("//*[contains(text(),'Total Calories Required')] "));

    public OtherCalculatorsModalPage enterWeight(String value) {
        weightInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage enterHeight(String value) {
        heightInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage enterAge(String value) {
        ageInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage enterRunDistance(String value) {
        runDistanceInputField.sendKeys(value);
        return this;
    }

    public OtherCalculatorsModalPage clickOnTheMaleRadioButton() {
        maleGenderRadioButton.click();
        return this;
    }
    public OtherCalculatorsModalPage clickOnTheCalculateCaloricNeedsButton() {
        calculateCaloricNeedsButton.click();
        return this;
    }

    public boolean isCaloricNeedsTableDisplayed(){
        return caloricNeedsTable.isDisplayed();
    }
}
