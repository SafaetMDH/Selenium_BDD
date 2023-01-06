package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HouseholdEssentials extends page_objects.Categories {

    public HouseholdEssentials(WebDriver driver) {super(driver);}

    private static final Logger LOGGER = LogManager.getLogger(page_objects.HouseholdEssentials.class);

    private static final By BulkItems = By.xpath("//*[@id='rrgkm']//div[text()='Bulk Items']");
    private static final By HandSoapAndSanitizers = By.xpath("//*[@id='5xu1f']//div[text()='Hand Soap & Sanitizers']");
    private static final By ToiletPaper = By.xpath("//*[@id='5xsyk']//div[text()='Toilet Paper']");
    private static final By CleaningSupplies = By.xpath("//*[@id='5xsyy']//div[text()='Cleaning Supplies']");
    private static final By LaundryCare = By.xpath("//*[@id='5xsyr']//div[text()='Laundry Care']");
    private static final By TotalItems = By.xpath("//*[@id='mainContainer']//span[text()='Household Essentials (6376)']");
    private static final By HouseholdEssentials = By.xpath("//*[@id='5xsz1']/a/div");
    private static final By ExploreAll = By.xpath("//*[@id='categoriesMenu']//a[text()='Explore all']");
    private static final By Refine = By.xpath("//*[@id='N-uqe9q']//div/button[text()='Refine']");
    private static final By Brand = By.xpath("//*[@id='select-586']/button");
    private static final By SelectArial = By.xpath("//*[@id='filmstrip-501']//div/a/span[text()='Ariel Ultra Concentrated Color & Style Liquid Laundry Detergent - 100 fl oz']");
    private static final By PickUpHerButton = By.xpath("//*[@id='viewport']//div/button[text()='Pick up here']");
    private static final By ViewCart = By.xpath("/html/body//div/button[text()='View cart & checkout']");
    private static final By ValidateItem = By.xpath("//*[@id='item-title-1b3b5d21-4987-11eb-ae01-794c4cfd089a']//span[text()='Liquid Laundry Detergent - 100 fl oz']");
    private static final By Categories = By.xpath("//*[@id='categories']//span[text()='Categories']");

    public HouseholdEssentials navigateToHouseEssentials() {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        ActOn.element(driver, HouseholdEssentials).click();
        LOGGER.info("User click on Household Essentials");
        return this;
    }

    public HouseholdEssentials navigateToLandryItem(){
        ActOn.element(driver,LaundryCare).click();
        ActOn.element(driver,ExploreAll).click();
        LOGGER.info("User is in the LaundryCare Page");
        return this;
    }

    public HouseholdEssentials refineItems(String value){
        ActOn.element(driver,Brand).selectValue(value);
        LOGGER.info("User refine Brand");
        return this;
    }

    public HouseholdEssentials selectArial(){
        ActOn.element(driver, SelectArial).click();
        LOGGER.info("User click on the item");
        return this;
    }

    public HouseholdEssentials clickOnPickUpHere(){
        ActOn.element(driver, PickUpHerButton).click();
        LOGGER.info("User clicked on PickUpHere");
        return this;
    }

    public HouseholdEssentials clickOnViewItem(){
        ActOn.element(driver,ViewCart).click();
        LOGGER.info("User clicked on ViewCart");
        return this;
    }

    public HouseholdEssentials validateViewCart(){
        AssertThat.elementAssertions(driver,ValidateItem).elementExist();
        LOGGER.info("Element Exist");
        return this;
    }
}