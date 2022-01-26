package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class EquipmentPage extends HeaderPage {

    private final SelenideElement shoesEquipmentLink = $(By.xpath("//*[@class='table']//*[contains(text(),'Shoes')]"));

    public EquipmentPage openEquipmentPage() {
        open(BASE_URL + "Equipment.cshtml");
        return this;
    }

    public EquipmentPage selectShoeEquipment() {
        shoesEquipmentLink.click();
        return this;
    }
}
