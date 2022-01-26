package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CoachingUpgradePage extends HeaderPage {

    private final SelenideElement selectYearlyProPackageButton = $(By.xpath("//*[contains(text(),'12 Months / $390.00')]/ancestor::*//*[@type='submit'][normalize-space()='Select']"));
    private final SelenideElement cardholderFirstNameField = $("#fcardname");
    private final SelenideElement cardholderLastNameField = $("#lcardname");
    private final SelenideElement creditCardNumberField = $("#cardnum");
    private final SelenideElement monthDropDownMenu = $("#expmonth");
    private final SelenideElement yearDropDownMenu = $("#expyear");
    private final SelenideElement cvvNumberField = $("#cardcvv");
    private final SelenideElement payNowButton = $("#btnPayment");
    private final SelenideElement popUpAlertMessage = $(By.xpath("//*[contains(text(),'Please fix the following errors:')]"));

    public void openCoachingUpgradePage() {
        open(BASE_URL + "CoachingUpgrade.cshtml");
    }

    public CoachingUpgradePage selectYearlyProPackage() {
        selectYearlyProPackageButton.click();
        return this;
    }

    public CoachingUpgradePage fillingCardholderFirstName(String value) {
        cardholderFirstNameField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage fillingCardholderLastName(String value) {
        cardholderLastNameField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage fillingCreditCardNumberField(String value) {
        creditCardNumberField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage selectCardExpirationDate(String firstValue, String secondValue) {
        monthDropDownMenu.selectOptionContainingText(firstValue);
        yearDropDownMenu.selectOptionContainingText(secondValue);
        return this;
    }

    public CoachingUpgradePage fillingCvvNumberField(String value) {
        cvvNumberField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage clickOnThePayNowButton() {
        payNowButton.click();
        return this;
    }

    public boolean isPopUpAlertDisplayed() {
        return popUpAlertMessage.isDisplayed();
    }
}
