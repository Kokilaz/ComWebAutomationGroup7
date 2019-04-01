package testHomePage;

import homePage.AmazonMain;
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
    public void browsergettitle(){
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
    public void navigation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.searchNavigation();
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

    @Test
    public void gethoverOverList() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.hoveroverList();
    }

    @Test
    public void videoSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setVideoSearch();
    }

    @Test
    public void goTocart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setGoToCart();
    }

    @Test
    public void continueToCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setContinuetoCart();
    }

    @Test
    public void screenshots(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setScreenshots();
    }

    @Test
    public void getclick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setclick();
    }

    @Test
    public void supportArtisans(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setsupport();

    }

    @Test
    public void karmalit(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.getkarmalit();
    }

    @Test
    public void yourAmazon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setYourAmazon();
    }

    @Test
    public void dealsToday(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setTodaysDeals();
    }

    @Test
    public void giftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setGiftcards();
    }

    @Test
    public void wholeFoods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setWholeFoods();
    }

    @Test
    public void sell(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setsell();
    }

    @Test
    public void setWholeFoods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setWholeFoods();
    }

    @Test
    public void getHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setsell();
    }

    @Test
    public void getAmazonDrive(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setAmazonDrive();
    }

    @Test
    public void sixPmDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setSixpmDeals();
    }

    @Test
    public void getAbeBooks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setabeBooks();
    }

    @Test
    public void getsetAcx(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setAcx();
    }

    @Test
    public void setBoxofficemojo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setboxofficemojo();
    }

    @Test
    public void getComixology(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setcomixology();
    }

    @Test
    public void getAmazonGlobal(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonGlobal();
    }

    @Test
    public void getHomeService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.sethomeService();
    }

    @Test
    public void getAmazonInspire(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonInspire();
    }

    @Test
    public void getAmazonRapids(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonRapids();
    }

    @Test
    public void getAmazonRestaurants(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonRestaurants();
    }

    @Test
    public void getBookDepository() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setbookDepository();
    }
}
