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


    public void getTitle() {
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(title,"Body Care & Home Fragrances You'll Love | Bath & Body Works");
    }

    @FindBy(css = "body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.global-email-dialog.ui-draggable > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon-primary.ui-icon.ui-icon-closethick")
    WebElement HandlepopUp;

    public void HomePageHandlepopup() {
        HandlepopUp.click();
        String title = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), title);
    }

    @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg")
    WebElement OpenLogin;

    public void clickOnLogin() {
        HomePageHandlepopup();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        OpenLogin.click();
    }

     @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg")
     WebElement Siginorsignup;

     public void getlogin() {
         clickOnLogin();
         Siginorsignup.click();
     }

     @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg" )
     WebElement clickSignin;

     public void setClickSignin() {
         getlogin();
         WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
         clickSignin.click();
     }

     @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > div > div > a:nth-child(1)")
     WebElement signinpage;

     public void setSigninpage(){
         setClickSignin();
         signinpage.click();
     }

     @FindBy(css = "#dwfrm_login_username")
     WebElement username;

     public void setUsername(){
         setSigninpage();
         username.sendKeys("jenniferkasi234@gmail.com");
     }

     @FindBy(css = "#dwfrm_login_password")
     WebElement password;

     public void setPassword(){
         setUsername();
         password.sendKeys("123456Abc");
     }

     @FindBy(css = "#dwfrm_login > fieldset > div.form-row.form-row-button > button")
     WebElement clicklogin;

     public void setClicklogin(){
         setPassword();
         clicklogin.click();
     }

     @FindBy(css = "body")
     WebElement myinfo;

     public void setMyinfo(){
         setClicklogin();
         myinfo.click();
         WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
         driver.navigate().back();
     }

     @FindBy(css = "#body-care-dropdown > a")
     WebElement DropdownBodycare;

     public void setDropdownBodycare(){
         HomePageHandlepopup();
         DropdownBodycare.click();
     }

     @FindBy(xpath = "//*[@id=\"secondary\"]/div[2]/div[2]/div[1]/ul/li[2]/a")
     WebElement Bodycare;

     public void setBodycare(){
         setDropdownBodycare();
         Bodycare.click();
     }

     public void getproductCocoshea(){
         setBodycare();
         driver.navigate().back();
         driver.navigate().refresh();
     }

     @FindBy(css = "#secondary > div.active-sub-category > ul:nth-child(2) > li:nth-child(4) > a")
     WebElement travelSize;

     public void setTravelSize(){
         setBodycare();
         travelSize.click();
     }

     @FindBy(css = "#q")
     WebElement searchbar;

     public void Setsearch(){
         HomePageHandlepopup();
         searchbar.sendKeys("Fragrance");
         searchbar.click();
     }

     @FindBy(css = "#primary > div.fragrance-list.fr-category > ul > li:nth-child(1) > a > img")
     WebElement FragranceCitrus;

     public void setCitrus(){
         Setsearch();
         WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
         FragranceCitrus.click();
         driver.navigate().back();
     }

     @FindBy(css = "#wrapper > header > div.header-banner.addOn.stickyOn > div > div:nth-child(3) > div > a > img")
     WebElement click;

     public void setClick(){
         HomePageHandlepopup();
         click.click();
     }

     @FindBy(css = "#primary > div.fragrance-list.fr-category > ul > li:nth-child(2) > a > img")
     WebElement Exotic;

     public void setExotic(){
         setClick();
         Exotic.click();
     }

     public void navigateTofragrance(){
         setExotic();
         driver.navigate().back();
     }

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



    public void selectBodycare() {
        WebElement Bodycare = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        Bodycare = driver.findElement(By.cssSelector("#body-care-dropdown > a"));
        Bodycare.click();
    }

    public void gotobodycare() {
        WebElement NewBodyCare = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        NewBodyCare = driver.findElement(By.xpath("//*[@id=\"secondary\"]/div[2]/div[2]/div[2]/ul[1]/li[1]/a"));
        NewBodyCare.click();

    }

    public void product() {
        WebElement SelectProduct = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        SelectProduct = driver.findElement(By.cssSelector("#\\32 6ee6803b54d53d08711ab72ea > div.product-outline-block > a > div.product-image > div > div > div > img"));
        wait.until(ExpectedConditions.visibilityOf(SelectProduct));
        SelectProduct.click();
        driver.navigate().back();
    }

    public static void type() {
        WebElement product = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        product = driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType > h3 > i"));
        product.click();
    }

    public void title() {
        WebElement goSearch = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        goSearch = driver.findElement(By.cssSelector("#q"));
        goSearch.sendKeys("PINK PASSIONFRUIT & BANANA FLOWER", Keys.ENTER);
        driver.findElement(By.cssSelector("#wrapper > div.breadcrumb > span")).click();


    }

    public void Productcream() {
        WebElement Cream = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        Cream = driver.findElement(By.cssSelector("#\\32 dda07ee14757ccad658ace668 > div.product-outline-block > a > div.product-cont > div.product-name"));
        Cream.click();
    }

    public void cart() {
        WebElement getCart = null;
        getCart = driver.findElement(By.cssSelector("#add-to-cart"));
        getCart.click();

    }

    public void checkout() {
        WebElement cartCheck = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        cartCheck = driver.findElement(By.cssSelector("body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.ui-dialog-buttons > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div.ui-dialog-buttonset > button:nth-child(2) > span"));
        wait.until(ExpectedConditions.visibilityOf(cartCheck));
        cartCheck.click();

    }

    public void MethodtogobackHome() {
        WebElement gotoHome = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        gotoHome = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.primary-logo > a > img"));
        gotoHome.click();
        driver.navigate().refresh();
    }

    public  void shopto() {
        driver.navigate().back();
        WebElement gotoShop = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        gotoShop = driver.findElement(By.cssSelector("body"));
        gotoShop.click();
    }

    public  void gettitlehome() {

        WebElement gettitle = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        gettitle = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.primary-logo > a > img"));
        gettitle.click();

    }

    public void clickonshop() {
        WebElement clicksoap = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        clicksoap = driver.findElement(By.cssSelector("#hand-soaps-dropdown > a"));
        clicksoap.click();
    }

    public void clickhandsoaps() {
        WebElement allhandsoaps = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        allhandsoaps = driver.findElement(By.cssSelector("#secondary > div.filter-overflow > div.filter-content > div.active-sub-category > ul:nth-child(4) > li:nth-child(1) > a"));
        allhandsoaps.click();
    }

    public void handsoapproductdropdown() {
        WebElement handproduct = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        handproduct = driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType > h3 > i"));
        handproduct.click();
    }

    public void clickcandleholder() {
        WebElement candle = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        candle = driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType.open > h3"));
        candle.click();
    }

    public void clickfragrancename() {
        WebElement fragrance = null;
        WebElement category = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        fragrance = driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.fragranceName.custom-filter > h3"));
        fragrance.click();
        category = driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.fragranceCategory > h3 > i"));
        category.click();

    }

    public void clickfragrancecategory() {
        WebElement category = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        category = driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.fragranceCategory > h3 > i"));
        category.click();

    }

    public void clickfoamingsoap() {
        WebElement foamingsoap = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        foamingsoap = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(2) > a"));
        foamingsoap.click();

    }

    public void clickexfoliatingsoap() {
        WebElement exfoliatingsoap = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        exfoliatingsoap = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(3) > a"));
        exfoliatingsoap.click();
    }

    public void clicknourishingsoap() {
        WebElement nourishingsoap = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        nourishingsoap = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(4) > a"));
        nourishingsoap.click();
        driver.navigate().refresh();

    }

    public void clicksoapholder() {
        WebElement soapholder = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        soapholder = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(5) > a"));
        soapholder.click();
        driver.navigate().refresh();

    }

    public void clicktulipnotworkingfromhere() {
        WebElement tulip = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        tulip = driver.findElement(By.cssSelector("#\\30 ea9d39d5fb6ada4351384ca10 > div.product-outline-block > a > div.product-cont > div.product-name"));
        tulip.click();
        driver.navigate().refresh();
        driver.navigate().back();

    }

    public void clickhandsantizer() {
        WebElement sanitizer = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        sanitizer = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(6) > li:nth-child(1) > a"));
        sanitizer.click();
    }

    public void clickpocketbac() {
        WebElement pocketBac = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        pocketBac = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(6) > li:nth-child(3) > a"));
        pocketBac.click();
    }

    public void clickproductdog() {
        WebElement dogBarks = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        dogBarks = driver.findElement(By.cssSelector("#b43ebd2a7a9be55d555cc526c2 > div.product-outline-block > a > div.product-cont > div.product-name"));
        dogBarks.click();
        driver.navigate().back();
    }

    public void gosignout() {
        WebElement checkout = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        checkout = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg"));
        checkout.click();
        WebElement clicksignout = null;
       // clicksignout = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > div > div > a.header-logout"));
        clicksignout.click();
        driver.navigate().refresh();
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
    }

}
