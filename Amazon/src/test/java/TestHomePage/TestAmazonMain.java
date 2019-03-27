package TestHomePage;

import HomePage.AmazonMain;
import Reporting.ApplicationLog;
import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setSearchbar();
        String expectedurl="https://www.amazon.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedurl);
    }

    @Test
    public void Browsergettitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.getTitle();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @Test
    public void getSearchitems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setSearchItems();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.com/");
    }

    @Test
    public void getSearchitem(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setSearchItem();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.com/");
    }
    @Test
    public void getselectgridSelectPrime(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setselectgridSelectPrime();
    }

    @Test
    public void getDeliverto(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setDeliverto();
    }

    @Test
    public void getClicktryPrime(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setClicktryPrime();
    }

    @Test
    public void getshowAlexaSkills(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setshowAlexaSkills();
    }

    //@Test
    // public void getcategoryDropdown(){
    //  amazonMain.setcategoryDropdown();//}

    @Test
    public void getcategoryGames(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setcategoryGames();
    }

    @Test
    public void getcategoryAlexa(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setcategoryAlexa();
    }

    @Test
    public void getcategoryAppliances(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setcategoryAppliances();
    }

    @Test
    public void getcategoryArtCrafts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setcategoryArtCrafts();
    }

    @Test
    public void getCD(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setCD();
    }

    @Test
    public void getamazonFresh(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonFresh();
    }

    @Test
    public void getBooks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setBooks();
    }

    @Test
    public void getAutomotiveParts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setAutomotiveParts();
    }

    @Test
    public void getcategorieBaby(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setcategorieBaby();
    }

    @Test
    public void getArtsAutomotive(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setArtsAutomotive();
    }

    @Test
    public void getBeautyPersonal(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setBeautyPersonal();
    }

    @Test
    public void setKindle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.getKindle();
    }

    @Test
    public void setWarehouseDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.getWarehouseDeals();
    }

    @Test
    public void setCredit(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.getCredit();
    }

    @Test
    public void getShopByCategory() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setShopByCategory();
    }

    @Test
    public void sethoveroverprimevideo() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.hoveroverprimevideo();
    }


}
