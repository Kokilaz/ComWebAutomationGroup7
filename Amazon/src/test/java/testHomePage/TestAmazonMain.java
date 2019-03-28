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
    public void Navigation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.SearchNavigation();
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

    @Test
    public void HoverOverList() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.HoveroverList();
    }

    @Test
    public void VideoSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setVideoSearch();
    }

    @Test
    public void GoTocart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setGoToCart();
    }

    @Test
    public void ContinueToCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setContinuetoCart();
    }

    @Test
    public void Screenshots(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setScreenshots();
    }

    @Test
    public void getclick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setclick();
    }

    @Test
    public void SupportArtisans(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setsupport();

    }

    @Test
    public void Karmalit(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.getkarmalit();
    }

    @Test
    public void Youramazon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setYourAmazon();
    }

    @Test
    public void DealsToday(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setTodaysDeals();
    }

    @Test
    public void Giftcards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setGiftcards();
    }

    @Test
    public void WholeFoods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setWholeFoods();
    }

    @Test
    public void Sell(){
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
    public void Sixpmdeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setSixpmDeals();
    }

    @Test
    public void getabeBooks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setabeBooks();
    }

    @Test
    public void getsetAcx(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setAcx();
    }

    @Test
    public void setboxofficemojo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setboxofficemojo();
    }

    @Test
    public void getcomixology(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setcomixology();
    }

    @Test
    public void getamazonGlobal(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonGlobal();
    }

    @Test
    public void gethomeService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.sethomeService();
    }

    @Test
    public void getamazonInspire(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonInspire();
    }

    @Test
    public void getamazonRapids(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonRapids();
    }

    @Test
    public void getamazonRestaurants(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setamazonRestaurants();
    }

    @Test
    public void getbookDepository() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonMain.setbookDepository();
    }
}
