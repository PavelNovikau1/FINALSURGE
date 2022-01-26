package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class EquipmentSteps extends AbstractSteps {
    @When("User open Equipment page")
    public void userOpenEquipmentPage() {
        equipmentPage.openEquipmentPage();
    }

    @And("User click on current equipment type shoes")
    public void userClickOnCurrentEquipmentTypeShoes() {
        equipmentPage.selectShoeEquipment();
    }

    @And("User filling shoe name {string} field")
    public void userFillingShoeNameField(String shoeName) {
        equipmentShoesPage.fillingShoeNameField(shoeName);
    }

    @And("User select shoes brand {string}")
    public void userSelectShoesBrand(String brand) {
        equipmentShoesPage.selectBrand(brand);
    }

    @And("User filling model name {string} field")
    public void userFillingModelNameField(String model) {
        equipmentShoesPage.fillingBrandNameField(model);
    }

    @And("User enter cost {string}")
    public void userEnterCost(String cost) {
        equipmentShoesPage.enterCost(cost);
    }

    @And("User select shoe size {string}")
    public void userSelectShoeSize(String size) {
        equipmentShoesPage.selectShoeSize(size);
    }

    @And("User press on add shoe button")
    public void userPressOnAddShoeButton() {
        equipmentShoesPage.clickOnAddShoeButton();
    }

    @Then("New added shoes name {string} is displayed in current shoes table")
    public void newAddedShoesNameIsDisplayedInCurrentShoesTable(String name) {
        Assert.assertTrue(equipmentShoesPage.isNewAddedShoeInformationDisplayed(name));
    }
}
