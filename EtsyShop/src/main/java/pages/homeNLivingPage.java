package pages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class homeNLivingPage extends CommonAPI {

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement homeNLiving;

    @FindBy(css = "#content > div > div.content.bg-white.col-md-12.pl-xs-1.pr-xs-0.pr-md-1.pl-lg-0.pr-lg-0.bb-xs-1 > div > div.mt-xs-2.text-gray.text-control > div.col-group.pl-xs-0.search-listings-group > div:nth-child(2) > ul.list-unstyled.block-grid-xl-4.show-xl.show-tv.hide-xs.hide-sm.hide-md.hide-lg > li:nth-child(1) > div > div.parent-hover-underline > a")
    WebElement homeDecor;

    @FindBy(css = "#content > div > div.content.bg-white.col-md-12.pl-xs-1.pr-xs-0.pr-md-1.pl-lg-0.pr-lg-0.bb-xs-1 > div > div.mt-xs-2.text-gray.text-control > div.col-group.pl-xs-0.search-listings-group > div:nth-child(2) > ul.list-unstyled.block-grid-xl-4.show-xl.show-tv.hide-xs.hide-sm.hide-md.hide-lg > li:nth-child(1) > div > div.parent-hover-underline > a")
    WebElement wallDecor;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[1]/a")
    WebElement wallHangings;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[2]/a")
    WebElement wallDecals;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[4]/a")
    WebElement wallStencils;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[2]/ul/li[2]/a")
    WebElement christmasTrees;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[2]/ul/li[1]/a")
    WebElement ornaments;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[2]/ul/li[1]/a")
    WebElement candles;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[2]/ul/li[4]/a")
    WebElement incense;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[4]/div/div[2]/ul/li[1]/a")
    WebElement wreaths;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[15]/div/a/div[2]/div/h2")
    WebElement springWreath;

    //*************************    Methods    ******************************


    public void HoveroverHomeandLiving() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(homeNLiving).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void checkhomeDecor(){
        homeNLiving.click();
    }
    public void checkwallDecor(){
        homeNLiving.click();
    }

    public void checkwallHangings(){
        homeNLiving.click();
    }

    public void checkwallDecals(){
    homeNLiving.click();
    }

    public void checkwallPaper(){
        homeNLiving.click();
    }

    public void checkwallStencils(){
        homeNLiving.click();
    }

    public void checkchristmasTrees(){
        homeNLiving.click();
    }

    public void checkornaments(){
        homeNLiving.click();
    }

    public void checkcandles(){
        homeNLiving.click();
    }

    public void checkincense(){
        homeNLiving.click();
    }

    public void checkwreaths(){
        homeNLiving.click();
    }

    public void checkspringWreaths(){
        homeNLiving.click();
    }
}