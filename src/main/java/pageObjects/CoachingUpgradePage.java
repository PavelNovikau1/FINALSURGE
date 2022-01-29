package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
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
        openPage("CoachingUpgrade.cshtml");
    }

    public CoachingUpgradePage selectYearlyProPackage() {
        log.info("Select yearly PRO package");
        selectYearlyProPackageButton.click();
        return this;
    }

    public CoachingUpgradePage fillingCardholderFirstName(String value) {
        log.info(String.format("Type text: '%s' into card holder first name field", value));
        cardholderFirstNameField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage fillingCardholderLastName(String value) {
        log.info(String.format("Type text: '%s' into card holder last name field", value));
        cardholderLastNameField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage fillingCreditCardNumberField(String value) {
        log.info(String.format("Type text: '%s' into credit card field", value));
        creditCardNumberField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage selectCardExpirationDate(String firstValue, String secondValue) {
        log.info(String.format("Select month: '%s' from drop down list", firstValue));
        monthDropDownMenu.selectOptionContainingText(firstValue);
        log.info(String.format("Select year: '%s' from drop down list", secondValue));
        yearDropDownMenu.selectOptionContainingText(secondValue);
        return this;
    }

    public CoachingUpgradePage fillingCvvNumberField(String value) {
        log.info(String.format("Type text: '%s' into cvv field", value));
        cvvNumberField.sendKeys(value);
        return this;
    }

    public CoachingUpgradePage clickOnThePayNowButton() {
        log.info("Click on the <pay now button>");
        payNowButton.click();
        return this;
    }

    public boolean isPopUpAlertDisplayed() {
        return popUpAlertMessage.isDisplayed();
    }
}
