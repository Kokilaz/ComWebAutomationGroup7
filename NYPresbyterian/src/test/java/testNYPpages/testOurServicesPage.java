package testNYPpages;

import Reporting.TestLogger;
import nypPages.ourServicesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testOurServicesPage extends ourServicesPage {

    ourServicesPage ourservicespage;
    String homePageUrl = "https://www.nyp.org/clinical-services";

    @BeforeClass
    public void initialize() {
        driver.navigate().to(homePageUrl);
        ourservicespage = PageFactory.initElements(driver, ourServicesPage.class);
    }

    @Test
    public void TestOurServices() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourservicespage.ourservices();
    }

    @Test
    public void Allergy(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourservicespage.Allergy();
        driver.navigate().back();
    }

    @Test
    public void Alzheimers(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourservicespage.Alzheimers();
        driver.navigate().back();
    }

    @Test
    public void BrainTumors(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourservicespage.BrainTumors();
        driver.navigate().back();
    }

    @Test
    public void OpthalmolgicalSurgery(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourservicespage.OpthalmolgicalSurgery();
        driver.navigate().back();
    }

    @Test
    public void CancerSrvices(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourservicespage.CancerServices();
        driver.navigate().back();
    }

    @Test
    public void PainMedicine(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourservicespage.PainMedicine();
    }

}
