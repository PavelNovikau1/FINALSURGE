package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PaymentSteps extends AbstractSteps{
    @Given("User open coaching upgrade page")
    public void userOpenCoachingUpgradePage() {
        coachingUpgradePage.openCoachingUpgradePage();
    }

    @And("User select pro package yearly")
    public void userSelectProPackageYearly() {
        coachingUpgradePage.selectYearlyProPackage();
    }

    @And("User filling cardholder first name {string} field")
    public void userFillingCardholderFirstNameField(String firstName) {
        coachingUpgradePage.fillingCardholderFirstName(firstName);
    }

    @And("User filling cardholder last name {string}field")
    public void userFillingCardholderLastNameField(String lastName) {
        coachingUpgradePage.fillingCardholderLastName(lastName);
    }

    @And("User filling credit card number {string} field")
    public void userFillingCreditCardNumberField(String cardNumber) {
        coachingUpgradePage.fillingCreditCardNumberField(cardNumber);
    }

    @And("User select card expiration date {string} and {string}")
    public void userSelectCardExpirationDateMonthAndYear(String month, String year) {
        coachingUpgradePage.selectCardExpirationDate(month, year);
    }

    @And("User filling card CVV {string} field")
    public void userFillingCardCVVCvvField(String cvvNumber) {
        coachingUpgradePage.fillingCvvNumberField(cvvNumber);
    }

    @And("User Click on the pay now button")
    public void userClickOnThePayNowButton() {
        coachingUpgradePage.clickOnThePayNowButton();
    }

    @Then("Pop up alert is is appear on the page")
    public void popUpAlertIsIsAppearOnThePage() {
        Assert.assertTrue(coachingUpgradePage.isPopUpAlertDisplayed());
    }
}
