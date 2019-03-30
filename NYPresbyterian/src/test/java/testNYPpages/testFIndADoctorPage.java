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
    DataReader excelData = new DataReader();
    String path = "../NYPresbyterian/src/test/resources/NYP Doctors.xls";

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

   // @Test
   //public void NYPDoctors() throws IOException {
      //  String[] nypdoctors = excelData.fileReader2(path,0);
               // for (String str : nypdoctors){
                   // switch (str){
                       // case ""
                    //}

}
