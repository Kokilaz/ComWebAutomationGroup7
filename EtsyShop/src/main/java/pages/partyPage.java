package pages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class partyPage extends CommonAPI {

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement WNPTab;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[1]/a")
    WebElement invitePaper;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[3]/a")
    WebElement saveTheDate;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[2]/a")
    WebElement greetingCards;

    @FindBy(css = "#content > div > div.content.bg-white.col-md-12.pl-xs-1.pr-xs-0.pr-md-1.pl-lg-0.pr-lg-0.bb-xs-1 > div > div.mt-xs-2.text-gray.text-control > div.col-group.pl-xs-0.search-listings-group > div:nth-child(2) > ul.list-unstyled.block-grid-xl-4.show-xl.show-tv.hide-xs.hide-sm.hide-md.hide-lg > li:nth-child(1) > div > div > a > div.category-text.with-subtitle.pr-xs-2.pl-xs-2.pr-sm-3.pl-sm-3.display-block > h3")
    WebElement holidayCards;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div/a/div[2]/h3")
    WebElement blankCards;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[1]/a")
    WebElement partySupplies;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[1]/a")
    WebElement weddingAcc;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[2]/ul/li[1]/a")
    WebElement weddingBags;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[2]/ul/li[2]/a")
    WebElement weddingCorsages;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[2]/ul/li[3]/a")
    WebElement weddingScarves;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[2]/ul/li[1]/a")
    WebElement bakingSupplies;


    //*********************** Methods *********************************

    public void HoveroverweddingandParty() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(WNPTab).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void checkInvitePaper(){
        invitePaper.click();
    }

    public void checkSaveTheDate(){
        saveTheDate.click();
    }

    public void checkgreetingCards(){
        greetingCards.click();
    }

    public void checkHolidayCards(){
        holidayCards.click();
    }

    public void checkBlankCards(){ blankCards.click(); }

    public void checkpartySupples(){
        partySupplies.click();
    }

    public void checkweddingAcc(){
        weddingAcc.click();
    }

    public void checkweddingBags(){
        weddingBags.click();
    }

    public void checkweddingcorsages(){
        weddingCorsages.click();
    }

    public void checkweddingScarves(){
       weddingScarves.click();
    }

    public void checkbakingSupplies(){
        bakingSupplies.click();
    }
}
