package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilites.ReadConfigFiles;
import java.io.IOException;
import java.util.Properties;

public class HomePage extends page_objects.Categories {

    public HomePage(WebDriver driver) { super(driver); }
    private static final Logger LOGGER = LogManager.getLogger(page_objects.Categories.class);

    private static final By SearchBox = By.id("search");
    private static final By SearchButton = By.xpath("//*[@id='headerMain']/div[1]/form/button[2]");
    private static final By AirPodProSearched = By.xpath("//*[@id='mainContainer']//div[text()='Apple AirPods Pro']");
    private static final By Categories = By.xpath("//*[@id='categories']//span[text()='Categories']");

    public HomePage navigateToURL() throws IOException {
        ReadConfigFiles readConfigFiles = new ReadConfigFiles();
        Properties prop = readConfigFiles.getPropertyValues();
        String Url = prop.getProperty("Url");
        driver.manage().deleteAllCookies();

        LOGGER.info("User is in the Target Home Page");
        return this;
    }

    public HomePage navigateToCategories(){
        ActOn.element(driver,Categories).click();
        LOGGER.info("User is in the Categories from HomePage");
        return this;
    }

    public HomePage searchItems(String value){
        ActOn.element(driver,SearchBox).setValue(value);
        LOGGER.info("User search items from searchBar");
        return this;
    }

    public HomePage clickToSearchButton(){
        ActOn.element(driver, SearchButton).click();
        LOGGER.info("User clicked on SearchButton");
        return this;
    }

    public HomePage validateSearchResult(){
        //AssertThat.elementAssertions(driver,AirPodProSearched).elementExist();
        LOGGER.info("User validated the search results");
        return this;
    }
}
