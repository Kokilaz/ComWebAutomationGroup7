package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


}

