package page_objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class LoginPage extends BasePage {

    private final SelenideElement emailField = $(By.id("login_name"));
    private final SelenideElement passwordField = $(By.id("login_password"));
    private final SelenideElement loginButton = $(By.xpath("//button[normalize-space()='Login']"));
    private final SelenideElement invalidLoginMessage = $("[class='alert alert-error'] strong");

    public LoginPage openLoginPage() {
        openPage("login.cshtml");
        return this;
    }

    public LoginPage fillingEmailField(String email) {
        log.info(String.format("Type text: '%s' into email field", email));
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage fillingPasswordField(String password) {
        log.info(String.format("Type text: '%s' into email field", password));
        passwordField.sendKeys(password);
        return this;
    }

    public TrainingCalendarPage clickOnTheLoginButton() {
        log.info("Click on the login button");
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
