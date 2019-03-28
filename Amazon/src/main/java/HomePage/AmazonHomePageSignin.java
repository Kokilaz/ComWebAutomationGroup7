package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageSignin extends CommonAPI {

    @FindBy(css = "#nav-link-accountList > span.nav-line-1")
    WebElement login;

    @FindBy(xpath = "//input[@id='ap_email']" )
    WebElement email;

    @FindBy(xpath = "//div[@class='a-section']//input[@id='continue']")
    WebElement beforepassword;

    @FindBy (xpath = "//input[@id='ap_password']")
    WebElement password;

    @FindBy (xpath = "//input[@id='signInSubmit']" )
    WebElement siginSubmit;

    @FindBy(css = "#createAccountSubmit")
    WebElement createaccount;

    @FindBy(css = "#ap_customer_name")
    WebElement yourname;

    @FindBy(css = "#ap_email")
    WebElement Email;

    @FindBy(css = "#ap_password")
    WebElement amazonpassword;

    @FindBy(css = "#ap_password_check")
    WebElement enterPassword;

    @FindBy(css = "#continue")
    WebElement cretaeAcccount;

    @FindBy(css = "#cvf-page-content > div > div > div:nth-child(1) > form > div:nth-child(1) > div.a-row.a-spacing-small > h1")
    WebElement verifyEmail;

    @FindBy(css = "#cvf-page-content > div > div > div:nth-child(1) > form > div:nth-child(2) > input")
    WebElement getcode;

    @FindBy(css = "#nav-link-accountList > span.nav-line-2")
    WebElement setSignout;


    public void openlogin(){
        login.click();
    }

    public void giveEmail(){
        email.sendKeys("lovely_jenny87@yahoo.com");
    }

    public void setbeforepassword(){
        email.click();
    }

    public void typePassword(){
        password.sendKeys("asdfghjkl1234567");
    }

    public void clickSigin(){
        siginSubmit.click();
    }

    public void openpageLogin(){
        openlogin();
        giveEmail();
        setbeforepassword();
        typePassword();
        clickSigin();
    }

    public void setCreateaccount(){
        openlogin();
        createaccount.click();
    }

    public void setYourname(){
        setCreateaccount();
        yourname.sendKeys("jke");
    }

    public void giveemail(){
        setYourname();
        Email.sendKeys("jke@gmail.com");
    }

    public void setpassword(){
        giveemail();
        amazonpassword.sendKeys("abc123");
    }

    public void ReEnter(){
        setpassword();
        enterPassword.sendKeys("abc123");
    }

    public void account(){
        ReEnter();
        cretaeAcccount.click();
    }

    public void setEmail(){
        account();
        verifyEmail.click();
        driver.navigate().refresh();
    }

    public void sendcode(){
        setEmail();
    }

    public void signout(){
        ReEnter();
    }

}
