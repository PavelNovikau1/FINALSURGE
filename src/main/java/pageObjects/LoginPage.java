package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final SelenideElement emailField = $(By.id("login_name"));
    private final SelenideElement passwordField = $(By.id("login_password"));
    private final SelenideElement loginButton = $(By.xpath("//button[normalize-space()='Login']"));
    private final SelenideElement invalidLoginMessage = $("[class='alert alert-error'] strong");

    public LoginPage openLoginPage() {
        open(BASE_URL + "login.cshtml");
        return this;
    }

    public LoginPage fillingEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage fillingPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public TrainingCalendarPage clickOnTheLoginButton() {
        loginButton.click();
        return new TrainingCalendarPage();
    }

    public String getInvalidLoginMessage() {
        return invalidLoginMessage.getText();
    }

    public HeaderPage login(String email, String password){
        openLoginPage();
        fillingEmailField(email);
        fillingPasswordField(password);
        clickOnTheLoginButton();
        return new HeaderPage();
    }
}
