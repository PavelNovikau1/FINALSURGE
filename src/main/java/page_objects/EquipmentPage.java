package page_objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class EquipmentPage extends HeaderPage {

    private final SelenideElement shoesEquipmentLink = $(By.xpath("//*[@class='table']//*[contains(text(),'Shoes')]"));

    public EquipmentPage openEquipmentPage() {
        openPage("Equipment.cshtml");
        return this;
    }

    public EquipmentPage selectShoeEquipment() {
        log.info("Select shoe equipment>");
        shoesEquipmentLink.click();
        return this;
    }
}
