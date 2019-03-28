import Base.CommonAPI;
import homePage.AmazonSearchFromDb;
import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonSearchFromDb extends CommonAPI {

    String Url = "https://www.amazon.com";;
    AmazonSearchFromDb amazonSearchFromDb;

    @BeforeMethod
    public void init(){
        driver.navigate().to(Url);
        amazonSearchFromDb = PageFactory.initElements(driver, AmazonSearchFromDb.class);
    }

    @Test
    public void testSearchDB()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonSearchFromDb.searchItems();
    }
}

