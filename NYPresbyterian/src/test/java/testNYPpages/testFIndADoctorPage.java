package testNYPpages;

import Reporting.TestLogger;
import Utility.DataReader;
import nypPages.findADoctorPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class testFIndADoctorPage extends findADoctorPage {

    findADoctorPage findadoctorpage;
    String homePageUrl = "https://doctors.nyp.org/";

    @BeforeMethod
    public void initialize() {
        driver.navigate().to(homePageUrl);
        findadoctorpage = PageFactory.initElements(driver, findADoctorPage.class);
    }

    @Test
    public void TestFindADoctor(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findadoctorpage.findDoctor();
    }

    @Test
    public void SearchDoctorBox(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findadoctorpage.SearchDoctorBox();
        driver.navigate().back();
    }

    @Test
    public void SearchDoctorBox1(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findadoctorpage.SearchDoctorBox1();
    }

}
