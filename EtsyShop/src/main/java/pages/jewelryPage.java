package pages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jewelryPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[1]/a")
    WebElement Accessories;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[1]/a")
    WebElement BeltsNSuspenders;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[2]/a")
    WebElement HairAcc;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[3]/a")
    WebElement Hats;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[4]/a")
    WebElement Keychains;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/a")
    WebElement ViewAllAcc;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[7]/div/a[1]/div[2]/div/h2")
    WebElement PineappleTassle;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[39]/div/a[1]/div[2]/div/h2")
    WebElement LuckyPenny;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[33]/div/a[1]/div[2]/div/h2")
    WebElement WeddingVeil;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[2]/ul/li[4]/a")
    WebElement DuffleBags;

    @FindBy(css = "#content > div > div.content.bg-white.col-md-12.pl-xs-1.pr-xs-0.pr-md-1.pl-lg-0.pr-lg-0.bb-xs-1 > div > div.mt-xs-2.text-gray.text-control > div.col-group.pl-xs-0.search-listings-group > div:nth-child(2) > div.mb-xs-5.mt-xs-3 > div > nav > ul > li:nth-child(3) > a")
    WebElement NextPage;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[1]/a")
    WebElement BodyJewelry;

    @FindBy(xpath = "//*[@id=\"search-filter-reset-form\"]/div[5]/fieldset/div/div/label[2]/a")
    WebElement HandMade;

    @FindBy(xpath = "//*[@id=\"search-filter-reset-form\"]/div[6]/fieldset/div/div/div/label[3]/a")
    WebElement PriceRange;

    @FindBy(xpath = "//*[@id=\"search-filter-reset-form\"]/div[7]/fieldset/div/label[1]/a")
    WebElement AcceptsGiftCard;

    //*************************    Methods     *****************************

    public void checkaccessories(){
        Accessories.click();
        driver.navigate().back();
    }

    public void checkbeltnsuspenders(){
        BeltsNSuspenders.click();
        driver.navigate().back();
    }

    public void checkhairacc(){
        HairAcc.click();
        driver.navigate().back();
    }

    public void checkhats(){
        Hats.click();
        driver.navigate().back();
    }

    public void checkKeychains(){
        Keychains.click();
        driver.navigate().back();
    }

    public void checkViewAllAcc(){
        ViewAllAcc.click();
    }

    public void checkPineappleTassle(){
        PineappleTassle.click();
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        driver.navigate().back();
    }

    public void checkLuckyPenny(){
        LuckyPenny.click();
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        driver.navigate().back();
    }

    public void checkWeddingVeil(){
        WeddingVeil.click();
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        driver.navigate().back();
    }

    public void checkduffleBags(){
        DuffleBags.click();
    }

    public void checkNextPage(){
        NextPage.click();
    }

    public void checkBodyJewelry(){
        BodyJewelry.click();
    }

    public void checkHandmade(){
        HandMade.click();
    }

    public void checkPriceRange(){
        PriceRange.click();
    }

    public void checkAcceptGiftCard(){
        AcceptsGiftCard.click();
    }
}
