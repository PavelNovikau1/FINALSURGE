package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

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
        $(shoeNameField).sendKeys(shoeName);
        return this;
    }

    public EquipmentShoesPage selectBrand(String brand) {
        brandDropDownMenu.click();
        searchField.sendKeys(brand);
        searchField.pressEnter();
        return this;
    }

    public EquipmentShoesPage fillingBrandNameField(String name) {
        $(brandName).sendKeys(name);
        return this;
    }

    public EquipmentShoesPage enterCost(String value) {
        $(cost).sendKeys(value);
        return this;
    }

    public EquipmentShoesPage selectShoeSize(String value) {
        $(shoeSizeDropDownMenu).click();
        $(shoeSizeDropDownMenu).sendKeys(value);
        return this;
    }

    public EquipmentShoesPage clickOnAddShoeButton(){
        $(addShoeButton).click();
        return this;
    }

    public boolean isNewAddedShoeInformationDisplayed(String text) {
        return $(By.xpath(String.format(SHOES_INFORMATION, text))).isDisplayed();
    }
}
