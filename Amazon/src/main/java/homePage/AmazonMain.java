package homePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMain extends CommonAPI {

    @FindBy(css = "#twotabsearchtextbox")
    WebElement Searchbar;

    @FindBy(css = "#nav-hamburger-menu > i")
    WebElement selectgrid;

    @FindBy(css = "#twotabsearchtextbox")
    WebElement SearchItems;

    @FindBy(css = "#nav-hamburger-menu > i")
    WebElement selectgridSelectPrime;

    @FindBy(css = ".nav-a.nav-a-2.a-popover-trigger.a-declarative")
    WebElement Deliverto;

    @FindBy(css = "#nav-link-prime")
    WebElement ClicktryPrime;

    @FindBy(css = "#twotabsearchtextbox")
    WebElement SearchItem;

    @FindBy(css = "#twotabsearchtextbox")
    WebElement showAlexaSkills;

    @FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
    WebElement categoryDropdown;

    @FindBy(xpath = "//option[@value='search-alias=mobile-apps']")
    WebElement categoryGames;

    @FindBy(css = "#searchDropdownBox")
    WebElement categoryAlexa;

    @FindBy(xpath = "//option[@value='search-alias=appliances']")
    WebElement categoryAppliances;

    @FindBy(css = "#searchDropdownBox")
    WebElement categoryArtCrafts;

    @FindBy(xpath = "//option[@value='search-alias=popular']")
    WebElement CD;

    @FindBy(css = "#searchDropdownBox")
    WebElement amazonFresh;

    @FindBy(xpath = "//option[@value='search-alias=stripbooks']")
    WebElement Books;

    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    WebElement AutomotiveParts;

    @FindBy(xpath = "//option[@value='search-alias=baby-products']")
    WebElement categorieBaby;

    @FindBy(xpath = "//option[@value='search-alias=automotive']")
    WebElement ArtsAutomotive;

    @FindBy(xpath = "//option[@value='search-alias=beauty']")
    WebElement BeautyPersonal;

    @FindBy(xpath = "//option[@value='search-alias=digital-text']")
    WebElement Kindle;

    @FindBy(xpath = "//option[@value='search-alias=warehouse-deals']")
    WebElement WarehouseDeals;

    @FindBy(xpath = "//option[@value='search-alias=financial']")
    WebElement Credit;

    @FindBy(css = "#nav-hamburger-menu > i")
    WebElement ShopByCategory;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement MousehoverSigin;

    @FindBy(xpath = "/html[1]/body[1]")
    WebElement List;

    @FindBy(xpath = "//option[@value='search-alias=videogames']")
    WebElement VideoGamesearch;

    @FindBy(css = "#hlb-ptc-btn-native")
    WebElement continueTocart;

    @FindBy(xpath = "//option[@value='search-alias=videogames']")
    WebElement screenshots;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement goToCart;

    @FindBy(css = "body")
    WebElement click;

    @FindBy(css = "#navSwmHoliday > a > img")
    WebElement supportartisans;

    @FindBy(css = "#anonCarousel1 > ol > li:nth-child(1) > a > img")
    WebElement karmalit;

    @FindBy(id = "nav-your-amazon")
    WebElement yourAmazon;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[2]")
    WebElement todaysDeals;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[3]")
    WebElement giftCards;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[4]")
    WebElement wholeFoods;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[5]")
    WebElement sell;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[6]")
    WebElement registry;

    @FindBy(xpath = "//div[@id='nav-xshop']//a[7]")
    WebElement help;

    @FindBy(xpath = "//*[@class='navFooterMoreOnAmazon']/tbody//tr[1]/td[5]")
    WebElement amazonDrive;

    @FindBy(xpath = "//a[@href='http://www.6pm.com']")
    WebElement sixpmDeals;

    @FindBy(xpath = "//a[@href='https://www.abebooks.com']")
    WebElement abeBooks;

    @FindBy(xpath = "//a[@href='http://www.acx.com/']")
    WebElement acx;

    @FindBy(xpath = "//a[@href='http://www.boxofficemojo.com/?ref_=amzn_nav_ftr']")
    WebElement boxOfficeMojo;

    @FindBy(xpath = "//a[@href='http://www.comixology.com']")
    WebElement comixology;

    @FindBy(xpath = "//*[@class='navFooterMoreOnAmazon']/tbody//tr[3]/td[5]")
    WebElement amazonGlobal;

    @FindBy(xpath = "//*[@class='navFooterMoreOnAmazon']/tbody//tr[3]/td[7]")
    WebElement homeService;

    @FindBy(xpath = "//*[@class='navFooterMoreOnAmazon']/tbody//tr[3]/td[9]")
    WebElement amazonInspire;

    @FindBy(xpath = "//*[@class='navFooterMoreOnAmazon']/tbody//tr[3]/td[11]")
    WebElement amazonRapids;

    @FindBy(xpath = "//*[@class='navFooterMoreOnAmazon']/tbody//tr[3]/td[13]")
    WebElement amazonRestaurants;

    @FindBy(xpath = "//a[@href='http://www.bookdepository.com']")
    WebElement bookDepository;


    public void setSearchbar() {
        Searchbar.click();
    }

    public void getTitle() {
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
    }

    public void setSearchItems() {
        SearchItems.sendKeys("iphone xs");
    }

    public void searchNavigation() {
        Searchbar.sendKeys("ps4 games", Keys.ENTER);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    public void setSearchItem() {
        SearchItems.sendKeys(" Michael Kors Women's Jet Set Tote");
        driver.navigate().back();
        driver.navigate().forward();
    }

    public void setselectgrid() {
        selectgrid.click();
    }

    public void setselectgridSelectPrime() {
        selectgridSelectPrime.click();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        driver.findElement(By.cssSelector("Body")).click();
    }

    public void setDeliverto() {
        Deliverto.click();
    }

    public void setClicktryPrime() {
        ClicktryPrime.click();
    }

    public void setshowAlexaSkills() {
        showAlexaSkills.sendKeys("Alexa Skills");
        showAlexaSkills.click();
    }

    public void setcategoryGames() {
        categoryGames.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Apps and Games", Keys.ENTER);
    }

    public void setcategoryAlexa() {
        categoryAlexa.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Alexa", Keys.ENTER);
        categoryAlexa.sendKeys("Alexa", Keys.ENTER);
    }

    public void setcategoryAppliances() {
        categoryAppliances.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Appliances", Keys.ENTER);
    }

    public void setcategoryArtCrafts() {
        categoryArtCrafts.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Arts and Crafts", Keys.ENTER);
    }

    public void setCD() {
        CD.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("CDs & Vinyl", Keys.ENTER);
    }

    public void setamazonFresh() {
        amazonFresh.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Amazon fresh", Keys.ENTER);
    }

    public void setBooks() {
        Books.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
    }

    public void setAutomotiveParts() {
        AutomotiveParts.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Automotive parts", Keys.ENTER);
    }

    public void setcategorieBaby() {
        categorieBaby.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Baby", Keys.ENTER);
    }

    public void setArtsAutomotive() {
        ArtsAutomotive.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Automotive parts", Keys.ENTER);
    }

    public void setBeautyPersonal() {
        BeautyPersonal.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Beauty & Personal Care", Keys.ENTER);
    }

    public void getKindle() {
        Kindle.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Kindle Store", Keys.ENTER);
    }

    public void getWarehouseDeals() {
        WarehouseDeals.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Warehouse deals", Keys.ENTER);
    }

    public void getCredit() {
        Credit.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Credit and Payment Cards", Keys.ENTER);
    }

    public void setShopByCategory() throws Exception {
        ShopByCategory.click();
        Thread.sleep(5000);
    }

    public void hoveroverprimevideo() throws Exception {
        setShopByCategory();
        mouseHoverByCSS("body");
    }

    public void hoveroverList() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(List).click().perform();
        action.moveToElement(MousehoverSigin).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void setVideoSearch() {
        VideoGamesearch.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ps4 games", Keys.ENTER);
        driver.findElement(By.cssSelector("#search > div.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(4) > div.s-result-list.sg-row > div:nth-child(1) > div > div > div > div > div > div:nth-child(2) > div.sg-col-4-of-24.sg-col-4-of-12.sg-col-4-of-36.sg-col-4-of-28.sg-col-4-of-16.sg-col.sg-col-4-of-20.sg-col-4-of-32 > div > div > span > a > div > img")).click();
    }

    public void setGoToCart() {
        setVideoSearch();
        goToCart.click();
    }

    public void setContinuetoCart() {
        setGoToCart();
        continueTocart.click();
    }

    public void setScreenshots() {
        screenshots.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Assasins Creed", Keys.ENTER);
    }

    public void setclick() {
        click.click();
    }

    public void setsupport() {
        supportartisans.click();
    }

    public void getkarmalit() {
        setsupport();
        driver.navigate().back();
    }

    public void setYourAmazon() {
        yourAmazon.click();
    }

    public void setTodaysDeals() {
        todaysDeals.click();
    }

    public void setGiftcards() {
        giftCards.click();
    }

    public void setWholeFoods() {
        wholeFoods.click();
    }

    public void setsell() {
        sell.click();
    }

    public void getWholeFoods() {
        wholeFoods.click();
    }

    public void setAmazonDrive(){
        amazonDrive.click();
    }

    public void setSixpmDeals(){
       sixpmDeals.click();
    }

    public void setabeBooks(){
        abeBooks.click();
    }

    public void setAcx(){
        acx.click();
    }

    public void setboxofficemojo(){
        boxOfficeMojo.click();
    }

    public void setcomixology(){
        comixology.click();
    }

    public void setamazonGlobal(){
        amazonGlobal.click();
    }
    public void sethomeService(){
        homeService.click();
    }

    public void setamazonInspire(){
        amazonInspire.click();
    }

    public void setamazonRapids(){
        amazonRapids.click();
    }

    public void setamazonRestaurants(){
        amazonRestaurants.click();
    }

    public void setbookDepository() {
        bookDepository.click();
    }
}
