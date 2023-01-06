package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Categories {
    private static final Logger LOGGER = LogManager.getLogger(Categories.class);
    public Categories(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    private static final By Categories = By.xpath("//*[@id='categories']//span[text()='Categories']");
    private static final By Grocery = By.xpath("//*[@id='5xt1a']/a/div[text()='Grocery']");
    private static final By ExploreAll = By.xpath("//*[@id='categoriesMenu']//a[text()='Explore all']");
    private static final By HouseholdEssentials = By.xpath("//*[@id='5xsz1']/a");

    public Categories navigateToCategories() {
        ActOn.element(driver, Categories).click();
        LOGGER.info("User is in the Categories");
        return this;
    }

    public Categories navigateToGroceries(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ActOn.element(driver, Grocery).click();
        LOGGER.info("User is in the Grocery Categories");
        return this;
    }

    public Categories exploreAll(){
        ActOn.element(driver,ExploreAll).click();
        LOGGER.info("User Explored ALL");
        return this;
    }

    public Categories navigateToHouseEssentials() {
        ActOn.element(driver, HouseholdEssentials).click();
        ActOn.element(driver,ExploreAll).click();
        LOGGER.info("User is on the House Essentials Page");
        return this;
    }
}
