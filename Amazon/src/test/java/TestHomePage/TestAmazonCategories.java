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
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setCategories();

    }

    @Test
    public void getBabyFashion(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setBabyFashion();
    }

    @Test
    public void getfineart(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setfineart();
    }

    @Test
    public void getComputers(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setComputers();
    }

    @Test
    public void getDigitalMusic(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setDigitalMusic();
    }

    @Test
    public void getGarden(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setGarden();
    }

    @Test
    public void getElectronics(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setElectronics();
    }

    @Test
    public void getGiftCard(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setGiftCard();
    }

    @Test
    public void getCredit(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setCredit();
    }

    @Test
    public void getCourses(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setCourses();
    }

    @Test
    public void getGrocery(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setGrocery();
    }

    @Test
    public void getHealth(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHealth();
    }

    @Test
    public void getKindle(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setKindle();
    }

    @Test
    public void getMovies(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMovies();
    }

    @Test
    public void getClothingShoes(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setClothingShoes();
    }

    @Test
    public void getWarehouseDeals(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setWarehouseDeals();
    }

    @Test
    public void getitemsofWomen(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofWomen();
    }

    @Test
    public void getitemsofGirls(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofGirls();
    }

    @Test
    public void getitemsofMen(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofMen();
    }

    @Test
    public void getitemsofBoys(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setitemsofBoys();
    }

    @Test
    public void getHandmade(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHandmade();
    }

    @Test
    public void getHouseholdandCare(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHouseholdandCare();
    }

    @Test
    public void getBusinessServices(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setBusinessServices();
    }

    @Test
    public void getHomeAndKitchen(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setHomeAndKitchen();
    }

    @Test
    public void getIndustrialAndScientific(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setIndustrialAndScientific();
    }

    @Test
    public void getKindleStore(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setKindleStore();
    }

    @Test
    public void getLuggageAndTravel(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setLuggageAndTravel();
    }

    @Test
    public void getLuxuryBeauty(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setLuxuryBeauty();
    }

    @Test
    public void getMagazineSubscriptions(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMagazineSubscriptions();
    }

    @Test
    public void getMoviesAndTv(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMoviesAndTv();
    }

    @Test
    public void getMusicalInstruments(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setMusicalInstruments();
    }

    @Test
    public void getOfficeProducts(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setOfficeProducts();
    }

    @Test
    public void getPetSupplies(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPetSupplies();
    }

    @Test
    public void getPrimeExclusiveSavings(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPrimeExclusiveSavings();
    }

    @Test
    public void getPrimePantry(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPrimePantry();
    }

    @Test
    public void getPrimeVideo(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setPrimeVideo();
    }

    @Test
    public void getSoftware(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setSoftware();
    }

    @Test
    public void getSportsAndOutdoors(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setSportsAndOutdoors();
    }

    @Test
    public void getToolsHomeImprovements(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setToolsHomeImprovements();
    }

    @Test
    public void getToysAndGames(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setToysAndGames();
    }

    @Test
    public void getVehicles(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setVehicles();
    }

    @Test
    public void getVideoGames(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonCategories.setVideoGames();
    }


}
