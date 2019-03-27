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

}
