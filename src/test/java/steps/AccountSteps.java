package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.PropertyReader;

public class AccountSteps extends AbstractSteps {

    @Given("User open login page")
    public void userOpenLoginPage() {
        loginPage.openLoginPage();
    }

    @And("User entered valid email and password")
    public void userEnteredValidEmailAndPassword() {
        loginPage.fillingEmailField(System.getenv().getOrDefault("email", PropertyReader.getProperty("email")))
                 .fillingPasswordField(System.getenv().getOrDefault("password", PropertyReader.getProperty("password")));
    }

    @When("User click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.clickOnTheLoginButton();
    }

    @Then("Verify dashboard page is opened")
    public void verifyDashboardPageIsOpened() {
        Assert.assertTrue(headerPage.isTheProfilePhotoDisplayed());
    }

    @Then("Alert {string} is appear on the page")
    public void alertMessageIsAppearOnThePage(String message) {
        Assert.assertEquals(loginPage.getInvalidLoginMessage(), message);
    }

    @And("User entered invalid email {string} and password {string}")
    public void userEnteredInvalidEmailAndPassword(String email, String password) {
        loginPage.fillingEmailField(email)
                 .fillingPasswordField(password);
    }

    @When("User click on the logout link on the header")
    public void userClickOnTheLogoutLinkOnTheHeader() {
        headerPage.logoutFromAccount();
    }

    @Then("Message {string} of successful logout is appear on the logout page")
    public void messageOfSuccessfulLogoutIsAppearOnTheLogoutPage(String message) {
        Assert.assertEquals(logoutPage.getSuccessfulLogoutMessage(), message);
    }
}
