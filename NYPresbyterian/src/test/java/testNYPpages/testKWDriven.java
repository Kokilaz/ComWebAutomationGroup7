package testNYPpages;

import Base.CommonAPI;
import Reporting.TestLogger;
import Utility.DataReader;
import nypPages.KWDriven;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testKWDriven extends CommonAPI {

    KWDriven kwdriven;
    DataReader excelData = new DataReader();
    String Path = "../NYPresbyterian/src/test/resources/teststeps.xls";

    @BeforeMethod

    public void initialize() {
        kwdriven = PageFactory.initElements(driver, KWDriven.class);}
    @Test
    public void testSearchBox() {
       kwdriven.SearchBox();
        System.out.println(driver.getTitle());
    }
    @Test
    public void testContactUs() {
     kwdriven.contactUs();
        System.out.println(driver.getTitle());
    }
    @Test
    public void SelectSteps() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String[] testOptions = excelData.getExcelData(Path, 0);
        for (String str : testOptions) {
            switch (str) {
                case "Search":
                    testSearchBox();
                    break;
                case "Navigate":
                    testContactUs();
                    break;
                default:
                    throw new InvalidArgumentException("Invalid Options");
            }
        }
    }

}
