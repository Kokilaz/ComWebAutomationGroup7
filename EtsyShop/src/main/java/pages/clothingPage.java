package pages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class clothingPage extends CommonAPI {

   /* @FindBy(xpath = "//*[@id=\"catnav-primary-link-10923\"]")
    WebElement clothing;*/

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[2]\n")
    WebElement Clothing;

    @FindBy(xpath = "//*[@id=\"side-nav-category-link-10924\"]")
    WebElement Womens;

    //***********************  Methods  ******************************

    /*public void checkClothing(){
        clothing.click();
    }*/

    public void HoveroverClothingTab() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(Clothing).click().perform();
        CommonAPI.sleepFor(2);
    }
    public void checkWomens(){
        Womens.click();
    }
}

