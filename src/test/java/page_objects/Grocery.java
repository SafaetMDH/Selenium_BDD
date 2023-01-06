package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Grocery extends page_objects.Categories {
    private static final Logger LOGGER = LogManager.getLogger(Grocery.class);
    public Grocery(WebDriver driver) {
        super(driver);
    }

    private static final By GroceryDeal = By.xpath("//*[@id='k4uyq']/a/div[text()='Grocery Deals']");
    private static final By NestlePure = By.xpath("//*[@id='mainContainer']//div//a[@aria-label='Nestle Pure Life Purified Water - 28pk/0.5 L Bottles']");
    private static final By PickItUp = By.xpath("//*[@id='viewport']//button[text()='Pick it up']");
    private static final By ViewCart = By.xpath("/html/body//button[text()='View cart & checkout']");
    private static final By Dairy = By.xpath("//*[@id='5xszm']//div[text()='Dairy']");
    private static final By Milk = By.xpath("//*[@id='5xszh']//div[text()='Milk']");
    private static final By MilkType = By.xpath("//*[@id='mainContainer']//a/span[2][text()='Type']");
    private static final By MilkBrand = By.xpath("//*[@id='mainContainer']/div[3]//div/a/span[text()='Brand']");
    private static final By AddAlmondMilk = By.xpath("//*[@id='mainContainer']//div/a[@aria-label='Almond Breeze Classic Egg Nog - 32 fl oz']");
    private static final By MilkPrice = By.xpath("//*[@id='viewport']//div[text()='$4.99']");
    private static final By MeatAndSeafood = By.xpath("//*[@id='5xsyh']//div[text()='Meat & Seafood']");
    private static final By SelectBeef = By.xpath("//*[@id='4tgi8']//div[text()='Beef']");
    private static final By SelectMeatballs = By.xpath("//*[@id='mainContainer']//div/a[text()='Beef Meatballs - Frozen - 26oz - Good & Gather™']");
    private static final By MeatBallTitleValidation = By.xpath("//*[@id='viewport']//span[text()='Beef Meatballs - Frozen - 26oz - Good & Gather™']");
    private static final By Beverages = By.xpath("//*[@id='5xt0r']//div[text()='Beverages']");
    private static final By ExploreAll = By.xpath("//*[@id='categoriesMenu']//a[text()='Explore all']");
    private static final By orderPickUp = By.xpath("//span[text()='Nestle Pure Life Purified Water - 28pk/0.5 L Bottles']");
    private static final By ValidateMeatballTitle = By.xpath("//*[@id='viewport']//div/h1/span[text()='Beef Meatballs - Frozen - 26oz - Good & Gather™']");
    private static final By Cat_Produce = By.xpath("//*[@id='u7fty']/a/div[text()='Produce']");
    private static final By SubCat_FreshFruit = By.xpath("//*[@id='4tglt']/a/div[text()='Fresh Fruit']");
    private static final By Product_OrganicBanana = By.xpath("//*[@id='mainContainer']//div/a[@aria-label='Organic Bananas - 2lb']");
    private static final By ValidatePrice = By.xpath("//*[@id='viewport']//div[text()='$1.59']");
    private static final By ValidateViewCart = By.xpath("//*[@id='viewport']//div/h1[text()='Your cart (1 item)']");

    public Grocery selectGroceryDeals(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,GroceryDeal).click();
        LOGGER.info("User clicked on Grocery Deals");
        return this;
    }
    public Grocery addNestlePureWater(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,NestlePure).click();
        LOGGER.info("User click on NestlePure Water ");
        return this;
    }

    public Grocery selectItemsForPickUp(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,PickItUp).click();
        LOGGER.info("User add item to pickUP");
        return this;
    }

    public Grocery viewCart(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,ViewCart).click();
        LOGGER.info("User click on ViewCart to view item");
        return this;
    }
    public Grocery validateOrder(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        boolean yourCart = driver.findElement(orderPickUp).isDisplayed();
        Assert.assertTrue("Logout button is not displayed", yourCart);
        LOGGER.info("User able to Add to PickUp");
        return this;
    }

    public Grocery navigateToProduce(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,Cat_Produce).click();
        LOGGER.info("User navigate to Produce");
        return this;
    }

    public Grocery navigateToFreshFruit(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,SubCat_FreshFruit).click();
        LOGGER.info("User navigate to Fresh Fruit");
        return this;
    }

    public Grocery addOrganicBanana(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ActOn.element(driver,Product_OrganicBanana).click();
        LOGGER.info("User open Organic Banana");
        return this;
    }

    public Grocery validatePrice(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        AssertThat.elementAssertions(driver,ValidatePrice).elementExist();
        LOGGER.info("Expected price is there");
        return this;
    }

    public Grocery clickOnBeverage(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,Beverages).click();
        ActOn.element(driver,ExploreAll).click();
        return this;
    }

    public Grocery exploreDairy(){
        ActOn.element(driver,Dairy).click();
        ActOn.element(driver,Milk).click();
        LOGGER.info("User Open Milk page from Dairy Category");
        return this;
    }

    public Grocery selectMilkType(String value){
        ActOn.element(driver,MilkType).selectValue(value);
        LOGGER.info("User select Milk Type");
        return this;
    }

    public Grocery selectMilkBrand(String value){
        ActOn.element(driver,MilkBrand).selectValue(value);
        LOGGER.info("User select Milk Brand");
        return this;
    }
    public Grocery AddAlmondMilk(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ActOn.element(driver,AddAlmondMilk).click();
        LOGGER.info("User add Almond MIlk");
        return this;
    }

    public Grocery milkPrice(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,MilkPrice).getTextValue();
        return this;
    }

    public Grocery navigateToSeaFood(){
        ActOn.element(driver,MeatAndSeafood).click();
        LOGGER.info("User navigated to Sea Food items page");
        return this;
    }
    public Grocery selectBeef(){
        ActOn.element(driver,SelectBeef).click();
        LOGGER.info("User is in the Beef Page");
        return this;
    }
    public Grocery selectBeefMeatballs(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ActOn.element(driver,SelectMeatballs).click();
        LOGGER.info("User select BeefMeatBalls");
        return this;
    }
    public Grocery selectMeatBallValidate(){
        AssertThat.elementAssertions(driver,ValidateMeatballTitle).elementExist();
        LOGGER.info("User select MeatBalls Quantity");
        return this;
    }

    public Grocery validateCheckout(){
        AssertThat.elementAssertions(driver,ValidateViewCart).elementExist();
        LOGGER.info("User validate the CheckOut");
        return this;
    }

    public Grocery popUpHandle(){
        try{
            driver.switchTo().alert().accept();
        }catch(Exception e){
            System.out.println("unexpected pop up not present");
        }
        return this;
    }
}
