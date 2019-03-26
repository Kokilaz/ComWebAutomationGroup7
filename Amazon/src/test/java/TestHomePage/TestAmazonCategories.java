package TestHomePage;

import HomePage.AmazonCategories;
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
    public void getBabyFashion(){
        amazonCategories.setBabyFashion();
    }

    @Test
    public void getfineart(){
        amazonCategories.setfineart();
    }

    @Test
    public void getComputers(){
        amazonCategories.setComputers();
    }

    @Test
    public void getDigitalMusic(){
        amazonCategories.setDigitalMusic();
    }

    @Test
    public void getGarden(){
        amazonCategories.setGarden();
    }

    @Test
    public void getElectronics(){
        amazonCategories.setElectronics();
    }

    @Test
    public void getGiftCard(){
        amazonCategories.setGiftCard();
    }

    @Test
    public void getCredit(){
        amazonCategories.setCredit();
    }

    @Test
    public void getCourses(){
        amazonCategories.setCourses();
    }

    @Test
    public void getGrocery(){
        amazonCategories.setGrocery();
    }

    @Test
    public void getHealth(){
        amazonCategories.setHealth();
    }

    @Test
    public void getKindle(){
        amazonCategories.setKindle();
    }

    @Test
    public void getMovies(){
        amazonCategories.setMovies();
    }

    @Test
    public void getClothingShoes(){
        amazonCategories.setClothingShoes();
    }

    @Test
    public void getWarehouseDeals(){
        amazonCategories.setWarehouseDeals();
    }

    @Test
    public void getitemsofWomen(){
        amazonCategories.setitemsofWomen();
    }

    @Test
    public void getitemsofGirls(){
        amazonCategories.setitemsofGirls();
    }

    @Test
    public void getitemsofMen(){
        amazonCategories.setitemsofMen();
    }

    @Test
    public void getitemsofBoys(){
        amazonCategories.setitemsofBoys();
    }

}
