package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonCategories extends CommonAPI {

    @FindBy(xpath = "//option[@value='search-alias=fashion-baby']")
    WebElement BabyFashion;

    @FindBy(xpath = "//option[@value='search-alias=collectibles']")
    WebElement fineart;

    @FindBy(xpath = "//option[@value='search-alias=computers']")
    WebElement Computers;

    @FindBy(xpath = "//option[@value='search-alias=digital-music']" )
    WebElement DigitalMusic;

    @FindBy(xpath = "//option[@value='search-alias=lawngarden']")
    WebElement Garden;

    @FindBy(xpath = "//option[@value='search-alias=electronics']" )
    WebElement Electronics;

    @FindBy(xpath = "//option[@value='search-alias=gift-cards']" )
    WebElement GiftCard;

    @FindBy(xpath = "//option[@value='search-alias=financial']")
    WebElement Credit;

    @FindBy(xpath = "//option[@value='search-alias=courses']")
    WebElement Courses;

    @FindBy(xpath = "//option[@value='search-alias=grocery']")
    WebElement Grocery;

    @FindBy(xpath = "//option[@value='search-alias=hpc']")
    WebElement Health;

    @FindBy(xpath = "//option[@value='search-alias=digital-text']" )
    WebElement Kindle;

    @FindBy(xpath = "//option[@value='search-alias=movies-tv']" )
    WebElement Movies;

    @FindBy(xpath = "//option[@value='search-alias=fashion']")
    WebElement ClothingShoes;

    @FindBy(xpath = "//option[@value='search-alias=warehouse-deals']" )
    WebElement WarehouseDeals;

    @FindBy(css = "#searchDropdownBox" )
    WebElement itemsofWomen;

    @FindBy(xpath = "//option[@value='search-alias=fashion-girls']" )
    WebElement itemsofGirls;

    @FindBy(xpath = "//option[@value='search-alias=fashion-mens']")
    WebElement itemsofMen;

    @FindBy(css ="#searchDropdownBox")
    WebElement itemsofBoys;

    @FindBy(xpath = "//option[@value='search-alias=handmade']")
    WebElement Handmade;

    @FindBy(xpath = "//option[@value='search-alias=hpc']")
    WebElement HouseholdandCare;

    @FindBy(xpath = "//option[@value='search-alias=local-services']")
    WebElement BusinessServices;

    @FindBy(xpath = "//option[@value='search-alias=garden']")
    WebElement HomeAndKitchen;

    @FindBy(xpath = "//option[@value='search-alias=industrial']")
    WebElement IndustrialAndScientific;

    @FindBy(xpath = "//option[@value='search-alias=digital-text']" )
    WebElement KindleStore;

    @FindBy(xpath = "//option[@value='search-alias=fashion-luggage']")
    WebElement LuggageAndTravel;

    @FindBy(xpath = "//option[@value='search-alias=luxury-beauty']" )
    WebElement LuxuryBeauty;

    @FindBy(xpath = "//option[@value='search-alias=magazines']" )
    WebElement MagazineSubscriptions;

    @FindBy(xpath = "//option[@value='search-alias=movies-tv']")
    WebElement MoviesAndTv;

    @FindBy(xpath = "//option[@value='search-alias=mi']")
    WebElement MusicalInstruments;

    @FindBy(xpath = "//option[@value='search-alias=office-products']" )
    WebElement OfficeProducts;

    @FindBy(xpath = "//option[@value='search-alias=pets']" )
    WebElement PetSupplies;

    @FindBy(xpath = "//option[@value='search-alias=prime-exclusive']")
    WebElement PrimeExclusiveSavings;

    @FindBy(xpath = "//option[@value='search-alias=pantry']")
    WebElement PrimePantry;

    @FindBy(xpath = "//option[@value='search-alias=instant-video']" )
    WebElement PrimeVideo;

    @FindBy(xpath = "//option[@value='search-alias=software']")
    WebElement Software;

    @FindBy(xpath = "//option[@value='search-alias=sporting']" )
    WebElement SportsAndOutdoors;

    @FindBy(xpath = "//option[@value='search-alias=tools']")
    WebElement ToolsHomeImprovements;

    @FindBy(xpath = "//option[@value='search-alias=toys-and-games']")
    WebElement ToysAndGames;

    @FindBy(xpath = "//option[@value='search-alias=vehicles']" )
    WebElement Vehicles;

    @FindBy(xpath = "//option[@value='search-alias=videogames']")
    WebElement VideoGames;

    @FindBy(css = "#searchDropdownBox")
    WebElement Categories;


    public void setCategories() {
        List<WebElement> categories = driver.findElements(By.cssSelector("#searchDropdownBox"));
        for (WebElement search : categories) {
            System.out.println(search.getText());
        }
    }

    public void setBabyFashion(){
        BabyFashion.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Baby fashion", Keys.ENTER);
    }


    public void setfineart(){
        fineart.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Collectibles", Keys.ENTER);
    }


    public void setComputers() {
        Computers.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Computers", Keys.ENTER);
    }


    public void setDigitalMusic(){
        DigitalMusic.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Digital music", Keys.ENTER);
    }


    public void setGarden(){
        Garden.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Garden & Outdoor", Keys.ENTER);
    }


    public void setElectronics(){
        Electronics.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Electronics", Keys.ENTER);
    }


    public void setGiftCard(){
        GiftCard.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Gift cards", Keys.ENTER);
    }


    public void setCredit(){
        Credit.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Credit and Payment Cards", Keys.ENTER);
    }


    public void setCourses(){
        Courses.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Courses", Keys.ENTER);
    }


    public void setGrocery(){
        Grocery.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Grocery & Gourmet Food", Keys.ENTER);
    }


    public void setHealth(){
        Health.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Health, Household & Baby Care", Keys.ENTER);
    }


    public void setKindle(){
        Kindle.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Kindle Store", Keys.ENTER);
    }


    public void setMovies(){
        Movies.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Movies & TV", Keys.ENTER);
    }


    public void setClothingShoes(){
        ClothingShoes.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Clothing, Shoes & Jewelry", Keys.ENTER);
    }


    public void setWarehouseDeals(){
        WarehouseDeals.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Warehouse deals", Keys.ENTER);
    }


    public void setitemsofWomen(){
        itemsofWomen.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Womens", Keys.ENTER);
    }


    public void setitemsofGirls(){
        itemsofGirls.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Girls", Keys.ENTER);
    }


    public void setitemsofMen(){
        itemsofMen.click();
    }


    public void setitemsofBoys(){
        itemsofBoys.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Boys", Keys.ENTER);
    }


    public void setHandmade(){
        Handmade.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("handmade", Keys.ENTER);
    }


    public void setHouseholdandCare(){
        HouseholdandCare.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Health, Household & Baby Care", Keys.ENTER);

    }


    public void setBusinessServices(){
        BusinessServices.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Home & Business Services", Keys.ENTER);
    }


    public void setHomeAndKitchen(){
        HomeAndKitchen.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Home & Kitchen", Keys.ENTER);
    }

    public void setIndustrialAndScientific(){
        IndustrialAndScientific.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Industrial & Scientific", Keys.ENTER);
    }

    public void setKindleStore(){
        KindleStore.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Kindle Store", Keys.ENTER);

    }

    public void setLuggageAndTravel(){
        LuggageAndTravel.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Luggage & Travel Gear", Keys.ENTER);
    }

    public void setLuxuryBeauty(){
        LuxuryBeauty.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Luxury Beauty", Keys.ENTER);
    }

    public void setMagazineSubscriptions(){
        MagazineSubscriptions.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Magazine Subscriptions", Keys.ENTER);
    }


    public void setMoviesAndTv(){
        MoviesAndTv.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Movies & TV", Keys.ENTER);

    }


    public void setMusicalInstruments(){
        MusicalInstruments.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Musical Instruments", Keys.ENTER);
    }

    public void setOfficeProducts(){
        OfficeProducts.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Office Products", Keys.ENTER);

    }

    public void setPetSupplies(){
        PetSupplies.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Pet Supplies", Keys.ENTER);

    }

    public void setPrimeExclusiveSavings(){
        PrimeExclusiveSavings.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Prime Exclusive Savings", Keys.ENTER);

    }


    public void setPrimePantry(){
        PrimePantry.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Pantry", Keys.ENTER);
    }


    public void setPrimeVideo(){
        PrimeVideo.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Video", Keys.ENTER);
    }


    public void setSoftware(){
        Software.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("software", Keys.ENTER);

    }


    public void setSportsAndOutdoors(){
        SportsAndOutdoors.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Sports & Outdoors", Keys.ENTER);

    }


    public void setToolsHomeImprovements(){
        ToolsHomeImprovements.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Tools & Home Improvement", Keys.ENTER);
    }


    public void setToysAndGames(){
        ToysAndGames.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Toys & Games", Keys.ENTER);
    }


    public void setVehicles(){
        Vehicles.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Vehicles", Keys.ENTER);
    }


    public void setVideoGames(){
        VideoGames.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);

    }

}

