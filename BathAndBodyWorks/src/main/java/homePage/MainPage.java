package homePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"secondary\"]/div[2]/div[2]/div[1]/ul/li[2]/a")
    WebElement Bodycare;

    @FindBy(css = "#body-care-dropdown > a")
    WebElement DropdownBodycare;

    @FindBy(css = "#secondary > div.active-sub-category > ul:nth-child(2) > li:nth-child(4) > a")
    WebElement travelSize;

    @FindBy(css = "#q")
    WebElement searchbar;

    @FindBy(css = "#primary > div.fragrance-list.fr-category > ul > li:nth-child(1) > a > img")
    WebElement FragranceCitrus;

    @FindBy(css = "#wrapper > header > div.header-banner.addOn.stickyOn > div > div:nth-child(3) > div > a > img")
    WebElement click;

    @FindBy(css = "#primary > div.fragrance-list.fr-category > ul > li:nth-child(2) > a > img")
    WebElement Exotic;

    @FindBy(css = "#primary > div.fragrance-list.fr-category > ul > li:nth-child(3) > a > img")
    WebElement floral;

    @FindBy(css = "#primary > div.fragrance-list.fr-category > ul > li:nth-child(4) > a > img")
    WebElement fresh;

    @FindBy(css ="#primary > div.fragrance-list.fr-category > ul > li:nth-child(5) > a > img")
    WebElement fruit;

    @FindBy(css ="#primary > div.fragrance-list.fr-category > ul > li:nth-child(6) > a > img")
    WebElement gouramand;

    @FindBy(css ="#primary > div.fragrance-list.fr-category > ul > li:nth-child(7) > a > img")
    WebElement warm;

    @FindBy(css ="#primary > div.fragrance-list.fr-category > ul > li:nth-child(8) > a > img")
    WebElement woods;

    @FindBy(css = "#body-care-dropdown > a")
    WebElement SelectBodyCare;

    @FindBy(xpath = "//*[@id=\"secondary\"]/div[2]/div[2]/div[2]/ul[1]/li[1]/a")
    WebElement SelectNewBodycare;

    @FindBy(css = "#\\32 6ee6803b54d53d08711ab72ea > div.product-outline-block > a > div.product-image > div > div > div > img")
    WebElement Selectproduct;

    @FindBy(css = "#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType > h3 > i")
    WebElement productType;

    @FindBy(css = "#q")
    WebElement Title;

    @FindBy(css = "#wrapper > div.breadcrumb > span")
    WebElement breadcrum;

    @FindBy(css = "#\\32 dda07ee14757ccad658ace668 > div.product-outline-block > a > div.product-cont > div.product-name")
    WebElement productCream;

    @FindBy(css = "#add-to-cart")
    WebElement cart;

    @FindBy(css = "body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.ui-dialog-buttons > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-child(2) > span")
    WebElement checkout;

    @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.primary-logo > a > img")
    WebElement navigateBackHome;

    @FindBy(css = "#hand-soaps-dropdown > a")
    WebElement Clickonshop;

    @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.primary-logo > a > img")
    WebElement getTitleHome;

    @FindBy(css = "#secondary > div.filter-overflow > div.filter-content > div.active-sub-category > ul:nth-child(4) > li:nth-child(1) > a")
    WebElement ClickHandsoaps;

    @FindBy(css = "#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType > h3 > i")
    WebElement HandsoapDropdown;

    @FindBy(css = "#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType.open > h3")
    WebElement candleHolder;

    @FindBy(css = "#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.fragranceName.custom-filter > h3")
    WebElement Fragranename;

    @FindBy(css = "#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.fragranceCategory > h3 > i")
    WebElement clickonFragrance;

    @FindBy(css = "#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.fragranceCategory > h3 > i" )
    WebElement fragranceCategory;

    @FindBy(css = "#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(2) > a" )
    WebElement selectFoamingSoap;

    @FindBy(css = "body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.global-email-dialog.ui-draggable > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon-primary.ui-icon.ui-icon-closethick")
    WebElement HandlepopUp;

    public void getTitle() {
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(title,"Body Care & Home Fragrances You'll Love | Bath & Body Works");
    }

    public void HomePageHandlepopup() {
        HandlepopUp.click();
        String title = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), title);
    }

     public void setDropdownBodycare(){
         HomePageHandlepopup();
         DropdownBodycare.click();
     }

     public void setBodycare(){
         setDropdownBodycare();
         Bodycare.click();
     }

     public void getproductCocoshea(){
         setBodycare();
         driver.navigate().back();
         driver.navigate().refresh();
     }

     public void setTravelSize(){
         setBodycare();
         travelSize.click();
     }

     public void Setsearch(){
         HomePageHandlepopup();
         searchbar.sendKeys("Fragrance");
         searchbar.click();
     }

     public void setCitrus(){
         Setsearch();
         WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
         FragranceCitrus.click();
         driver.navigate().back();
     }

     public void setClick(){
         HomePageHandlepopup();
         click.click();
     }

     public void setExotic(){
         setClick();
         Exotic.click();
     }

     public void navigateTofragrance(){
         setExotic();
         driver.navigate().back();
     }

     public void setFloral(){
         setClick();
         floral.click();
     }

     public void setFresh(){
         setClick();
         fresh.click();
     }

     public void setFruit() {
         setClick();
         fruit.click();
     }

     public void setGouramand() {
        setClick();
        gouramand.click();
    }

    public void setWarm() {
        setClick();
        warm.click();
    }

    public void setWoods() {
        setClick();
        woods.click();
    }

    public void selectBodycare() {
        HomePageHandlepopup();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        SelectBodyCare.click();
    }

    public void setgotobodycare() {
        selectBodycare();
        SelectNewBodycare.click();
    }

    public void product() {
        setgotobodycare();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        wait.until(ExpectedConditions.visibilityOf(Selectproduct));
        Selectproduct.click();
        driver.navigate().back();
    }

    public void setType() {
        product();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        productType.click();
    }

    public void setTitle() {
        setType();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        Title.sendKeys("PINK PASSIONFRUIT & BANANA FLOWER", Keys.ENTER);
    }

    public void selectbreadcrum(){
        setTitle();
        breadcrum.click();
    }

    public void Productcream() {
        selectbreadcrum();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        productCream.click();
    }

    public void setCart(){
        Productcream();
        cart.click();
    }

    public void setCheckout() {
        setCart();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        wait.until(ExpectedConditions.visibilityOf(checkout));
        checkout.click();
    }

    public void navigatebackHome() {
        setCheckout();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        navigateBackHome.click();
        driver.navigate().refresh();
    }

    public  void shopto() {
        HomePageHandlepopup();
        driver.navigate().refresh();
    }

    public  void gettitlehome(){
        shopto();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        getTitleHome.click();
    }

    public void clickonshop() {
        gettitlehome();
        Clickonshop.click();
    }

    public void clickhandsoaps() {
        clickonshop();
        ClickHandsoaps.click();
    }

    public void handsoapproductdropdown() {
        clickhandsoaps();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        HandsoapDropdown.click();
    }

    public void clickcandleholder() throws InterruptedException {
        Thread.sleep(2000);
        handsoapproductdropdown();
        candleHolder.click();
    }

    public void clickfragrancename() throws InterruptedException {
        Thread.sleep(2000);
        clickcandleholder();
        Fragranename.click();
    }

    public void clickFragrance() throws InterruptedException {
        clickfragrancename();
        clickonFragrance.click();
    }

    public void clickfragrancecategory() throws InterruptedException {
        clickFragrance();
        fragranceCategory.click();
    }

    public void clickfoamingsoap() throws InterruptedException {
        clickfragrancecategory();
        selectFoamingSoap.click();
    }
}
