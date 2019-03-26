package TestHomePage;

import HomePage.AmazonMain;
import org.openqa.selenium.support.PageFactory;
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
        amazonMain.setSearchbar();
    }

    @Test
    public void getSearchitems(){
        amazonMain.setSearchItems();
    }

    @Test
    public void getSearchitem(){
        amazonMain.setSearchItem();
    }
    @Test
    public void getselectgridSelectPrime(){
        amazonMain.setselectgridSelectPrime();
    }

    @Test
    public void getDeliverto(){
        amazonMain.setDeliverto();
    }

    @Test
    public void getClicktryPrime(){
        amazonMain.setClicktryPrime();
    }

    @Test
    public void getshowAlexaSkills(){
        amazonMain.setshowAlexaSkills();
    }

    //@Test
    // public void getcategoryDropdown(){
    //  amazonMain.setcategoryDropdown();//}

    @Test
    public void getcategoryGames(){
        amazonMain.setcategoryGames();
    }

    @Test
    public void getcategoryAlexa(){
        amazonMain.setcategoryAlexa();
    }

    @Test
    public void getcategoryAppliances(){
        amazonMain.setcategoryAppliances();
    }

    @Test
    public void getcategoryArtCrafts(){
        amazonMain.setcategoryArtCrafts();
    }

    @Test
    public void getCD(){
        amazonMain.setCD();
    }

    @Test
    public void getamazonFresh(){
        amazonMain.setamazonFresh();
    }

    @Test
    public void getBooks(){
        amazonMain.setBooks();
    }

    @Test
    public void getAutomotiveParts() {
        amazonMain.setAutomotiveParts();
    }

    @Test
    public void getcategorieBaby(){
        amazonMain.setcategorieBaby();
    }

    @Test
    public void getArtsAutomotive(){
        amazonMain.setArtsAutomotive();
    }

    @Test
    public void getBeautyPersonal(){
        amazonMain.setBeautyPersonal();
    }


}
