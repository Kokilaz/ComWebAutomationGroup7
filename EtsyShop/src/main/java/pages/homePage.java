package pages;

import Base.CommonAPI;
import Databases.ConnectToSqlDB;
import Reporting.TestLogger;
import Utility.DataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class homePage extends CommonAPI {

    @FindBy(xpath = "/html[1]/body[1]/div[3]/header[1]/div[1]/div[1]/a[1]/span[2]/*")
    WebElement etsyLogo;

    @FindBy(xpath = "//*[@id=\"sell-on-etsy\"]")
    WebElement sellonetsy;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement JewelryAccessories;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[2]\n")
    WebElement Clothing;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement homeNLiving;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement weddingNParty;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement Toys;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[6]/a[1]")
    WebElement artNCollectibles;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[7]/a[1]" )
    WebElement craftSupplies;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[8]/a[1]")
    WebElement vintage;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[9]/a[1]")
    WebElement Gifts;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/header[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement SigninButton;

    @FindBy(css = "#join_neu_email_field")
    WebElement SigninBox;




    //**********************    Methods    ***************************

    public void checkLogo() {
        etsyLogo.click();
    }

    public void checkSelletsy() {
        sellonetsy.click();
    }

    public void HoveroverJandATab() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(JewelryAccessories).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void HoveroverClothingTab() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(Clothing).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void HoveroverHomeandLiving() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(homeNLiving).click().perform();
        CommonAPI.sleepFor(2);
    }
    public void HoveroverweddingandParty() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(weddingNParty).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void Hoverovertoys() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(Toys).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void Hoveroverart() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(artNCollectibles).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void HoverovercraftSupplies() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(craftSupplies).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void HoveroverVintage() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(vintage).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void Hoverovergifts() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(Gifts).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void checkSigninButton() {
        SigninButton.click();
    }

    public void SigninBox(){
        SigninButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement username = driver.findElement(By.cssSelector("#join_neu_email_field"));
        username.sendKeys("preethikokila1@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#join_neu_password_field"));
        password.sendKeys("1234abcd");
        driver.findElement(By.cssSelector("#join-neu-form > div:nth-child(7) > div > div:nth-child(6) > div > button")).click();
    }

    }



