package TestHomePage;

import HomePage.AmazonHomePageSignin;
import Reporting.ApplicationLog;
import Reporting.TestLogger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonHomePageSignin extends AmazonHomePageSignin {

    AmazonHomePageSignin amazonHomePageSignin;
    String Url = "https://www.amazon.com";

    @BeforeMethod
    public void initialize(){
        driver.navigate().to(Url);
        amazonHomePageSignin = PageFactory.initElements(driver,AmazonHomePageSignin.class);
    }

    @Test
    public void setopenlogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.openlogin();
    }

    @Test
    public void setOpenPageLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.openpageLogin();
    }

    @Test
    public void CreateAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setCreateaccount();
    }

    @Test
    public void Name(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setYourname();
    }

    @Test
    public void email(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.giveemail();
    }

    @Test
    public void AmazonPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.setpassword();
    }

    @Test
    public void ReEnterPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.ReEnter();
    }

    @Test
    public void Account(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.ReEnter();
    }

    @Test
    public void EmailVerification(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonHomePageSignin.ReEnter();
    }

    @Test
    public void Signout(){
        amazonHomePageSignin.signout();
    }
}
