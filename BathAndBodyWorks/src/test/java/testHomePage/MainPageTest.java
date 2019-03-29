package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends MainPage {

    MainPage mainPage;
    String Homepageurl = "https://www.bathandbodyworks.com/";

    @BeforeMethod
    public void initialize(){
        driver.get(Homepageurl);
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void BrowserHomepageTitle(){
        mainPage.getTitle();
        String title = driver.getTitle();
    }

    @Test
    public void handlePopUp(){
        mainPage.HomePageHandlepopup();
    }

    @Test
    public void Login(){
        mainPage.clickOnLogin();
    }

    @Test
    public void clickSignIn(){
        mainPage.getlogin();
    }

    @Test
    public void getClickSignin(){
        mainPage.setClickSignin();
    }

    @Test
    public void getSigninpage(){
        mainPage.setSigninpage();
    }

    @Test
    public void getUsername(){
        mainPage.setUsername();
    }

    @Test
    public void getPassword(){
        mainPage.setPassword();
    }

    @Test
    public void ClickLogin(){
        mainPage.setClicklogin();
    }

    @Test
    public void MyInfo(){
        mainPage.setMyinfo();
    }

    @Test
    public void clickBodycare(){
        mainPage.setDropdownBodycare();
    }

    @Test
    public void getProductBodyCare(){
        mainPage.setBodycare();
    }

    @Test
    public void productCocoshea(){
        mainPage.getproductCocoshea();
    }

    @Test
    public void getTravelSize(){
        mainPage.setTravelSize();
    }

    @Test
    public void searchBar(){
        mainPage.Setsearch();
    }

    @Test
    public void citrusFragrance(){
        mainPage.Setsearch();
    }

    @Test
    public void ShopByFragrance(){
        mainPage.setClick();
    }

    @Test
    public void getExotic(){
        mainPage.setExotic();
    }

    @Test
    public void navigate(){
        mainPage.navigateTofragrance();
    }


}

