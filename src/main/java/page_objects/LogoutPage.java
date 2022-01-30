package page_objects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LogoutPage extends HeaderPage{

    private final SelenideElement successfulLogoutMessage = $(By.xpath("//*[contains(text(),'You have been successfully logged')]"));

    public String getSuccessfulLogoutMessage(){
        return successfulLogoutMessage.getText();
    }
}
