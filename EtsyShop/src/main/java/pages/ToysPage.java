package pages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ToysPage extends CommonAPI {

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement Toys;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[3]/div/div[2]/ul/li[1]/a")
    WebElement Books;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[2]/ul/li[1]/a")
    WebElement BookMarks;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[1]/a")
    WebElement BlankBooks;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[2]/ul/li[1]/a")
    WebElement Journals;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[2]/div/div[2]/ul/li[2]/a")
    WebElement SketchBooks;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[1]/a")
    WebElement FictionBooks;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[2]/ul/li[1]/a")
    WebElement LiteraryFiction;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[3]/div/div[2]/ul/li[2]/a")
    WebElement SciFi;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[3]/div/div[1]/a")
    WebElement ToysTab;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[3]/div/div[2]/ul/li[1]/a")
    WebElement BabyToys;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[3]/div/div[2]/ul/li[2]/a" )
    WebElement DollsNAction;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[3]/div/div[2]/ul/li[3]/a")
    WebElement Games;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[2]/div/div[2]/ul/li[1]/a")
    WebElement VideoGames;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[3]/div/div[1]/a")
    WebElement Sports;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul/li[3]/div/div[2]/ul/li[2]/a")
    WebElement Archery;


    //********************  Methods   *******************************

    public void HoveroverToys() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(Toys).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void checkBooks(){ Books.click(); }
    public void checkBookMarks(){
        BookMarks.click();
    }
    public void checkBlankBooks(){
        BlankBooks.click();
    }
    public void checkJournals(){
        Journals.click();
    }
    public void checkSketchBooks(){
        SketchBooks.click();
    }
    public void checkFictionBooks(){
        FictionBooks.click();
    }
    public void checkLiteraryFiction(){
        LiteraryFiction.click();
    }
    public void checkSciFi(){
        SciFi.click();
    }
    public void checkToysTab(){
        ToysTab.click();
    }
    public void checkBabyToys(){
        BabyToys.click();
    }
    public void checkDollsNAction(){ DollsNAction.click();}
    public void checkGames(){ Games.click();}
    public void checkVideoGames(){ VideoGames.click();}
    public void checkSports(){ Sports.click();}
    public void checkArchery(){ Archery.click();}
}
