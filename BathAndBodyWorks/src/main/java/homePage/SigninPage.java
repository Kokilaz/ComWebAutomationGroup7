package homePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SigninPage extends CommonAPI {

    @FindBy(css = "body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.global-email-dialog.ui-draggable > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon-primary.ui-icon.ui-icon-closethick")
    WebElement HandlepopUp;

    @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg")
    WebElement OpenLogin;

    @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg")
    WebElement Siginorsignup;

    @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg" )
    WebElement clickSignin;

    @FindBy(css = "#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > div > div > a:nth-child(1)")
    WebElement signinpage;

    @FindBy(css = "#dwfrm_login_username")
    WebElement username;

    @FindBy(css = "#dwfrm_login_password")
    WebElement password;

    @FindBy(css = "#dwfrm_login > fieldset > div.form-row.form-row-button > button")
    WebElement clicklogin;

    @FindBy(css = "body")
    WebElement myinfo;

    public void HomePageHandlepopup() {
        HandlepopUp.click();
        String title = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), title);
    }

    public void clickOnLogin() {
        HomePageHandlepopup();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        OpenLogin.click();
    }

    public void getlogin() {
        clickOnLogin();
        Siginorsignup.click();
    }

    public void setClickSignin() {
        getlogin();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        clickSignin.click();
    }

    public void setSigninpage(){
        setClickSignin();
        signinpage.click();
    }

    public void setUsername(){
        setSigninpage();
        username.sendKeys("jenniferkasi234@gmail.com");
    }

    public void setPassword(){
        setUsername();
        password.sendKeys("123456Abc");
    }

    public void setClicklogin(){
        setPassword();
        clicklogin.click();
    }

    public void setMyinfo(){
        setClicklogin();
        myinfo.click();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        driver.navigate().back();
    }
}
