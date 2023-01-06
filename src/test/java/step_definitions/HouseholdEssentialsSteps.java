package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;
import page_objects.HouseholdEssentials;

import java.io.IOException;

public class HouseholdEssentialsSteps {
    WebDriver driver = Hooks.driver;
    
    //#TC006 Scenario:  User add a item from Laundry Care and validate price
    @Given("^user is in the Home Page$")
    public void navigateToHomePage() throws IOException {
        new HomePage(driver)
                .navigateToURL()
                .navigateToCategories();
    }

    @When("^user navigate to Household Essentials subcategory Laundry Care$")
    public void navigateToHouseholdEssentials(){
        new HouseholdEssentials(driver)
                .navigateToHouseEssentials();

    }

    @And("^user filter items by Brand selecting \"<.+?>\"$")
    public void findOutAvailableItem(String value){
        new HouseholdEssentials(driver)
                .refineItems(value)
                .selectArial();
    }

    @Then("^user should able to add that Arial Detergent for PickUpInStore$")
    public void addLaundryItemToPickup(){
        new HouseholdEssentials(driver)
                .clickOnPickUpHere()
                .validateViewCart();
    }

   //#TC007 Scenario: A user select a item from Toilet Paper
   @When("^user navigate to \"<.+?>\" from \"<.+?>\"$")
    public void navigatingToToiletPaper(){

   }

   @And("^user select this \"<.+?>\"$")
    public void selectItemBestAvailable(){

   }

   @Then("^user should able to see the price \"<.+?>\"$")
    public void validatePrice(){

   }

   //#TC008 Scenario: From Cleaning Tools add a item to ship
    @When("^user navigate to the \"<.+?>\" from \"<.+?>\"$")
    public void navigatingTOCleaningTools(){

    }
    @And("^user select a item name from \"<.+?>\"$")
    public void selectItemName(){

    }

    @Then("^user should able to add the item to ship$")
    public void addAItemToShip(){

    }

    //#TC009 Scenario: From Hand Sanitizer check the Suave Hand Sanitizer Price
    @When("^user navigate to Hand Soap & Sanitizers from Hand Soap & Sanitizers$")
    public void navigatingToSanitizers(){

    }
    @And("^user select sanitizer \"<.+?>\"$")
    public void selectDesiredSanitizer(){

    }
    @Then("^user should able to see the price$")
    public void validatingPrice(){

    }

    //#TC010    Scenario: From Household essentials deals filter product range $50-$100
    @When("^user navigating to \"<.+?>\" from \"<.+?>\"$")
    public void navigatingToDeals(){

    }

    @And("^user filter the \"<.+?>\" to desired price$")
    public void filteringPriceRange(){

    }

    @Then("^user should able to find the items  by price ranged$")
    public void validationsOfFilteredPrice(){

    }
}
