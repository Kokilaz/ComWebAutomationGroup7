package testHomePage;

import Reporting.TestLogger;
import homePage.MainPage;
import homePage.SigninPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigninPageTest extends SigninPage {

    SigninPageTest signinPageTest;
    String Homepageurl = "https://www.bathandbodyworks.com/";

    @BeforeMethod
    public void initialize(){
        driver.get(Homepageurl);
        signinPageTest = PageFactory.initElements(driver, SigninPageTest.class);
    }

    @Test
    public void handlePopUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.HomePageHandlepopup();
    }

    @Test
    public void Login(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.clickOnLogin();
    }

    @Test
    public void clickSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.getlogin();
    }

    @Test
    public void getClickSignin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.setClickSignin();
    }

    @Test
    public void getSigninpage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.setSigninpage();
    }

    @Test
    public void getUsername(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.setUsername();
    }

    @Test
    public void getPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.setPassword();
    }

    @Test
    public void ClickLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.setClicklogin();
    }

    @Test
    public void MyInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signinPageTest.setMyinfo();
    }
}
