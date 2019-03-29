package testHomePage;

import Base.CommonAPI;
import Utility.DataReader;
import homePage.AmazonHomePageSignin;
import homePage.AmazonKeywordDriven;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonKeyWordDriven extends CommonAPI {

    AmazonKeywordDriven amazonKeywordDriven;
    AmazonHomePageSignin sigin= new AmazonHomePageSignin();
    DataReader exceldata = new DataReader();
    String path = "/Users/jenniferstephen/ComWebAutomationGroup7/Amazon/src/test/resources/options.xls";

    @BeforeMethod
    public void intialize(){
        amazonKeywordDriven= PageFactory.initElements(driver,AmazonKeywordDriven.class);
    }

    @Test
    public void testSearchbox(){
    amazonKeywordDriven.setSearchBar();
    System.out.println(driver.getTitle());
    }

    @Test
    public void testOrders() throws InterruptedException {
        amazonKeywordDriven.setOrders();
        System.out.println(driver.getTitle());
    }

    @Test
    public void selectOptions() throws InterruptedException {
        String[] testOptions = exceldata.getExcelData(path,0) ;
        for(String str : testOptions){
            switch (str) {
                case "Search":
                    testSearchbox();
                    break;
                case "Navigate":
                    testOrders();
                    break;
                default:
                    throw new InvalidArgumentException("Invalid Options");
            }
        }
    }
}
