package nypPages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class patientNVisitorPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[5]/a")
    WebElement Visitors;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div/ul/li[3]/a")
    WebElement MedicalRecords;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div/ul/li[4]/a")
    WebElement VisitingHours;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div/ul/li[7]/a")
    WebElement Accommodations;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div/ul/li[8]/a")
    WebElement GiftShop;

    public void Visitors(){
        Visitors.click();
    }

    public void MedicalRecords(){
        MedicalRecords.click();
    }

    public void VisitingHours(){
        VisitingHours.click();
    }

    public void Accommodations(){
        Accommodations.click();
    }

    public void GiftShop(){
        GiftShop.click();
    }
}
