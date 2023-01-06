package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.Categories;
import page_objects.Grocery;
import page_objects.HomePage;
import java.io.IOException;

public class GrocerySteps {
    WebDriver driver = Hooks.driver;

    //TC001 Checking Search Functionalities.
    @Given("^a user is in the home page$")
    public void navigateToHomePage() throws IOException {
        new HomePage(driver)
                .navigateToURL();
    }

    @When("^user enters item name on search bar")
    public void searchItemsFromSearchBar(){
        new HomePage(driver)
                .searchItems("AirPod Pro");
    }

    @And("^user click on search button$")
    public void clickOnSearchButton(){
        new HomePage(driver)
                .clickToSearchButton();
    }

    @Then("^user validated the search result$")
    public void validateTheSearchResult(){
        new HomePage(driver)
                .validateSearchResult();
    }

    //TC002 Adding a item to pickup from Grocery
    @When("^user navigating to Grocery$")
    public void navigatingToGrocery(){
        new Categories(driver)
                .navigateToCategories()
                .navigateToGroceries();
    }

    @And("^from Grocery user select \"<.+?>\"$")
    public void navigateToGroceryDeals(){
        new Grocery(driver)
                .selectGroceryDeals();
    }

    @Then("^user select a item name \"<.+?>\"$")
    public void selectAItem() {
        new Grocery(driver)
                .addNestlePureWater();
    }

    @And("^user should able to add that item for PickUp$")
    public void addItemForPickUp(){
        new Grocery(driver)
                .selectItemsForPickUp()
                .viewCart()
                .validateOrder();
    }

    //TC003 User validating a item price from Grocery Produce
    @When("^user navigating to \"<.+?>\" from Grocery \"<.+?>\"$")
    public void navigatingToFreshFruit(){
         new Categories(driver)
                 .navigateToCategories()
                 .navigateToGroceries();
    }

    @And("^user select \"<.+?>\"$")
    public void selectItem() {
        new Grocery(driver)
                .navigateToProduce()
                .navigateToFreshFruit()
                .addOrganicBanana()
                .popUpHandle();
    }

    @Then("^user should validate the \"<.+?>\"$")
    public void validateProductPrice(){
        new Grocery(driver)
                .validatePrice();
    }

    //TC004->From Dairy check the 2% milk price
    @When("^user navigating to Dairy from Grocery$")
    public void navigatingToDairy() {
        new Categories(driver)
                .navigateToCategories()
                .navigateToGroceries();
    }

    @And("^user select \"<.+?>\" Type and \"<.+?>\" Brand from Milk$")
    public void filterTypeAndBrand(String value) {
        new Grocery(driver)
                .exploreDairy()
                .selectMilkType(value)
                .selectMilkBrand(value);
    }

    @Then("^user should able to select the item$")
    public void clickTheMilk() {
        new Grocery(driver)
                .AddAlmondMilk();
    }


    //TC005->From Meat & Seafood validate beef meatballs price
    @When("^user navigate to Meat adn Seafood Beef Items$")
    public void navigatingToBeefItems() {
        new Categories(driver)
                .navigateToCategories()
                .navigateToGroceries();
    }

    @And("^user select item name \"<.+?>\"$")
    public void selectMeatBall(){
        new Grocery(driver)
                .navigateToSeaFood()
                .selectBeef()
                .popUpHandle()
                .selectBeefMeatballs();
    }

    @Then("^user then validate the title$")
    public void selectQuantityOfMeatballs(){
        new Grocery(driver)
                .selectMeatBallValidate();
    }

    @And("^user should able to add that item for delivery$")
    public void validateMeatballAddItem(){
        new Grocery(driver)
                .selectItemsForPickUp()
                .viewCart()
                .validateCheckout();
    }
}
