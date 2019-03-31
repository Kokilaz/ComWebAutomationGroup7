package pages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class artsPage extends CommonAPI {

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[6]/a[1]")
    WebElement artNCollectibles;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/ul[1]/li[1]/div/div[1]/a")
    WebElement digitalPrints;



    //**************************    Methods   ************************************


    public void Hoveroverart() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(artNCollectibles).click().perform();
        CommonAPI.sleepFor(2);
    }

    public void checkDigitalPrints(){
        digitalPrints.click();
    }

}
