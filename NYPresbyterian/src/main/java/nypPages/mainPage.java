package nypPages;


import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class mainPage extends CommonAPI {

    @FindBy(id = "logoImgId")
    WebElement Logo;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[1]/a")
    WebElement FindADoctor;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[2]/a")
    WebElement OurServices;

    @FindBy(xpath ="//*[@id=\"primrow\"]/div/div[1]/ul/li[3]/a" )
    WebElement PaymyBill;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[4]/a")
    WebElement Locations;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[5]/a")
    WebElement Visitors;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[1]/a")
    WebElement AboutUs;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[2]/a")
    WebElement ClinicalTrials;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[3]/a")
    WebElement HealthLibrary;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[4]/a")
    WebElement GiveToNYP;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[5]/a")
    WebElement ContactUs;

    @FindBy(xpath = "/html/body/globalheader/div/div[1]/div/div[2]/ul/li[1]/a/img")
    WebElement FacebookIcon;

    @FindBy(xpath = "/html/body/globalheader/div/div[1]/div/div[2]/ul/li[2]/a/img")
    WebElement TwitterIcon;

    @FindBy(xpath = "/html/body/globalheader/div/div[1]/div/div[2]/ul/li[3]/a/img")
    WebElement InstagramIcon;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/a/img")
    WebElement UrgentCareButton;

   // @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/a/div/div/p[2]")
   // WebElement HealthMattersVideoButton;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[2]/a")
    WebElement NewsRoom;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[4]/a")
    WebElement GlobalServices;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[5]/a")
    WebElement ForProfessionals;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[6]/a")
    WebElement Employees;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[7]/a")
    WebElement ForVendors;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[8]/a")
    WebElement Careers;


    // ****************  NYP Methods  ****************************
    public void CheckLogo(){
        Logo.click();
    }

    public void FindADoctor(){
        FindADoctor.click();
    }

    public void OurServices(){
        OurServices.click();
    }
    public void PayMyBill(){
        PaymyBill.click();
    }

    public void Locations(){
        Locations.click();
    }

    public void Visitors(){
        Visitors.click();
    }

    public void AboutUs(){
        AboutUs.click();
    }

    public void ClinicalTrials(){
        ClinicalTrials.click();
    }

    public void HealthLibrary(){
        HealthLibrary.click();
    }

    public void GiveToNYP(){
        GiveToNYP.click();
    }

    public void ContactUs(){
        ContactUs.click();
    }

    public void FacebookIcon(){
        FacebookIcon.click();
    }

    public void TwitterIcon(){
        TwitterIcon.click();
    }

    public void InstagramIcon(){
        InstagramIcon.click();
    }

    public void UrgentCare(){
        UrgentCareButton.click();
    }

    public void NewsRoom(){
        NewsRoom.click();
    }

    public void GlobalServices(){
        GlobalServices.click();
    }

    public void ForProfessionals(){
        ForProfessionals.click();
    }

    public void Employees(){
        Employees.click();
    }

    public void ForVendors(){
        ForVendors.click();
    }

    public void Careers(){
        Careers.click();
    }

}

