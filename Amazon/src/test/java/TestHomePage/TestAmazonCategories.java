package TestHomePage;

import HomePage.AmazonCategories;
import Reporting.ApplicationLog;
import Reporting.TestLogger;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonCategories extends AmazonCategories {

    AmazonCategories amazonCategories;
    String Url = "https://www.amazon.com";


    @BeforeMethod
    public void initialize(){
        driver.get(Url);
        amazonCategories = PageFactory.initElements(driver, AmazonCategories.class);
    }

    @Test
    public void getCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setCategories();
    }

    @Test
    public void getBabyFashion() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setBabyFashion();
    }

    @Test
    public void getfineart()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setfineart();
    }

    @Test
    public void getComputers()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setComputers();
    }

    @Test
    public void getDigitalMusic()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setDigitalMusic();
    }

    @Test
    public void getGarden()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setGarden();
    }

    @Test
    public void getElectronics()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setElectronics();
    }

    @Test
    public void getGiftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setGiftCard();
    }

    @Test
    public void getCredit(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setCredit();
    }

    @Test
    public void getCourses(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setCourses();
    }

    @Test
    public void getGrocery(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setGrocery();
    }

    @Test
    public void getHealth(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHealth();
    }

    @Test
    public void getKindle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setKindle();
    }

    @Test
    public void getMovies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMovies();
    }

    @Test
    public void getClothingShoes(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setClothingShoes();
    }

    @Test
    public void getWarehouseDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setWarehouseDeals();
    }

    @Test
    public void getitemsofWomen(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofWomen();
    }

    @Test
    public void getitemsofGirls(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofGirls();
    }

    @Test
    public void getitemsofMen(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofMen();
    }

    @Test
    public void getitemsofBoys(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofBoys();
    }

    @Test
    public void getHandmade(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHandmade();
    }

    @Test
    public void getHouseholdandCare(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHouseholdandCare();
    }

    @Test
    public void getBusinessServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setBusinessServices();
    }

    @Test
    public void getHomeAndKitchen(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHomeAndKitchen();
    }

    @Test
    public void getIndustrialAndScientific(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setIndustrialAndScientific();
    }

    @Test
    public void getKindleStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setKindleStore();
    }

    @Test
    public void getLuggageAndTravel(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setLuggageAndTravel();
    }

    @Test
    public void getLuxuryBeauty(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setLuxuryBeauty();
    }

    @Test
    public void getMagazineSubscriptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMagazineSubscriptions();
    }

    @Test
    public void getMoviesAndTv(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMoviesAndTv();
    }

    @Test
    public void getMusicalInstruments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMusicalInstruments();
    }

    @Test
    public void getOfficeProducts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setOfficeProducts();
    }

    @Test
    public void getPetSupplies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPetSupplies();
    }

    @Test
    public void getPrimeExclusiveSavings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPrimeExclusiveSavings();
    }

    @Test
    public void getPrimePantry(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPrimePantry();
    }

    @Test
    public void getPrimeVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPrimeVideo();
    }

    @Test
    public void getSoftware(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setSoftware();
    }

    @Test
    public void getSportsAndOutdoors(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setSportsAndOutdoors();
    }

    @Test
    public void getToolsHomeImprovements(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setToolsHomeImprovements();
    }

    @Test
    public void getToysAndGames(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setToysAndGames();
    }

    @Test
    public void getVehicles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setVehicles();
    }

    @Test
    public void getVideoGames(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setVideoGames();
    }

    @Test
    public void getcategorieBaby(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setcategorieBaby();
    }

    @Test
    public void getArtsAutomotive(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setArtsAutomotive();
    }

    @Test
    public void getBeautyPersonal(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setBeautyPersonal();
    }

}