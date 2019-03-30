package nypPages;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ourServicesPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[2]/a")
    WebElement ourservices;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[1]/a")
    WebElement Allergy;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[2]/a")
    WebElement Alzheimers;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[9]/a")
    WebElement BrainTumors;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[2]/ul/li[10]/a")
    WebElement OpthalmolgicalSurgery;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[12]/a")
    WebElement CancerServices;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[2]/ul/li[12]/a")
    WebElement PainMedicine;

//methods

    public  void ourservices(){
        ourservices.click();
    }

    public void Allergy(){ Allergy.click(); }

    public void Alzheimers(){
        Alzheimers.click();
    }

    public void BrainTumors(){
        BrainTumors.click();
    }

    public void OpthalmolgicalSurgery(){
        OpthalmolgicalSurgery.click();
    }

    public void CancerServices(){
        CancerServices.click();
    }

    public void PainMedicine(){
        PainMedicine.click();
    }
}

