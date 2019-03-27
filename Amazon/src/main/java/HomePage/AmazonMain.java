package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AmazonMain extends CommonAPI {

    @FindBy(css = "#twotabsearchtextbox")
    WebElement Searchbar;

    @FindBy(css = "#twotabsearchtextbox")
    WebElement SearchItem;

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

    //public void setcategoryDropdown() {
    //    categoryDropdown.click();//}

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

    public void setShopByCategory()throws Exception{
        ShopByCategory.click();
        Thread.sleep(5000);
    }

    public void hoveroverprimevideo()throws Exception{
        setShopByCategory();
        mouseHoverByCSS("body");
    }
}
