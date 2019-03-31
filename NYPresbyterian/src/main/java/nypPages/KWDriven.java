package nypPages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class KWDriven {

    @FindBy(id = "search-box")
    WebElement searchBox;

    @FindBy(xpath= "//*[@id=\"primrow\"]/div/div[2]/ul/li[5]/a")
    WebElement ContactUs;

    //*********************   Methods    *********************

    public void SearchBox() {
        searchBox.sendKeys("Cancer");
    }

    public void contactUs() {
        ContactUs.click();
    }
}
