package testNYPpages;

import Reporting.TestLogger;
import nypPages.patientNVisitorPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testPatientNVisitorPage extends patientNVisitorPage {

    patientNVisitorPage patientnvisitorspage;
    String homePageUrl = "https://www.nyp.org/patients-and-visitors";

    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.navigate().to(homePageUrl);
        patientnvisitorspage = PageFactory.initElements(driver, patientNVisitorPage.class);
    }

    @Test
    public void Visitors(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        patientnvisitorspage.Visitors();
    }

    @Test
    public void MedicalRecords(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        patientnvisitorspage.MedicalRecords();
    }

    @Test
    public void VisitingHours(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        patientnvisitorspage.VisitingHours();
    }

    @Test
    public void Accommodations(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        patientnvisitorspage.Accommodations();
        driver.navigate().back();
    }

    @Test
    public void GiftShop(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        patientnvisitorspage.GiftShop();
    }


}
