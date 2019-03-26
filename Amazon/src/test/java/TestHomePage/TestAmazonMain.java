package TestHomePage;

import HomePage.AmazonMain;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonMain extends AmazonMain {

    AmazonMain amazonMain;
    String Url = "https://www.amazon.com";

    @BeforeMethod
    public void initialize(){
        driver.get(Url);
        amazonMain = PageFactory.initElements(driver, AmazonMain.class);
    }

    @Test
    public void getSearchbar(){
        amazonMain.setSearchbar();
    }


}
