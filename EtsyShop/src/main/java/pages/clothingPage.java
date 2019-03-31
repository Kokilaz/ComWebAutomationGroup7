package pages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class clothingPage extends CommonAPI {

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[2]\n")
    WebElement Clothing;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[5]/div/a/div[2]/div/h2")
    WebElement SeventhBday;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[7]/div/a/div[2]/div/h2")
    WebElement Monogram;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[23]/div/a/div[2]/div/h2")
    WebElement LVCase;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[31]/div/a/div[2]/div/h2")
    WebElement PurpleDress;

    @FindBy(xpath = "//*[@id=\"reorderable-listing-results\"]/li[1]/div/a/div[2]/div/h2")
    WebElement BabyShoes;

    //***********************  Methods  ******************************

    public void HoveroverClothingTab() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(Clothing).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void checkSeventhBday(){
        SeventhBday.click();
    }

    public void checkMonogram(){
        Monogram.click();
    }

    public void checkLVcase(){
        LVCase.click();
    }

    public void checkPurpleDress(){
        PurpleDress.click();
    }

    public void checkBabyShoes(){
        BabyShoes.click();
    }
}

