package page_objects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class EquipmentShoesPage extends EquipmentPage {

    private final SelenideElement shoeNameField = $(By.id("ShoeName"));
    private final SelenideElement brandDropDownMenu = $(By.id("s2id_ShoeBrand"));
    private final SelenideElement searchField = $(".select2-input");
    private final SelenideElement brandName = $("#ShoeModel");
    private final SelenideElement cost = $("#ShoeCost");
    private final SelenideElement shoeSizeDropDownMenu = $("#ShoeSize ");
    private final SelenideElement addShoeButton = $("#saveButton");
    private static final String SHOES_INFORMATION = "//*[@class='table']//*[contains(text(),'%s')]";

    public EquipmentShoesPage fillingShoeNameField(String shoeName) {
        log.info(String.format("Type text: '%s' into shoe name field", shoeName));
        $(shoeNameField).sendKeys(shoeName);
        return this;
    }

    public EquipmentShoesPage selectBrand(String brand) {
        log.info("Click on the drop down menu");
        brandDropDownMenu.click();
        log.info(String.format("Select: '%s' from brand drop down menu", brand));
        searchField.sendKeys(brand);
        log.info("Press enter");
        searchField.pressEnter();
        return this;
    }

    public EquipmentShoesPage fillingModelNameField(String name) {
        log.info(String.format("Type text: '%s' into model name field", name));
        $(brandName).sendKeys(name);
        return this;
    }

    public EquipmentShoesPage enterCost(String value) {
        log.info(String.format("Enter cost: '%s' into cost field", value));
        $(cost).sendKeys(value);
        return this;
    }

    public EquipmentShoesPage selectShoeSize(String value) {
        log.info("Open shoe size drop down menu");
        $(shoeSizeDropDownMenu).click();
        log.info(String.format("Select size: '%s' from drop down menu", value));
        $(shoeSizeDropDownMenu).sendKeys(value);
        return this;
    }

    public EquipmentShoesPage clickOnAddShoeButton(){
        log.info("Click on <add shoe button>");
        $(addShoeButton).click();
        return this;
    }

    public boolean isNewAddedShoeInformationDisplayed(String text) {
        return $(By.xpath(String.format(SHOES_INFORMATION, text))).isDisplayed();
    }
}
