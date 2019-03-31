package nypPages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findADoctorPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[1]/a")
    WebElement findDoctor;

    public void findDoctor(){
        findDoctor.click();
    }

    public void SearchDoctorBox() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"exp1\"]"));
        Lastname.sendKeys("Aaronson");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[4]/div[2]/div/div/a")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 1,5000);
        driver.navigate().back();
    }

    public void SearchDoctorBox1() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Expertise = driver.findElement(By.xpath("//*[@id=\"exp1\"]"));
        Expertise.sendKeys("Oncology");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[4]/div/div/div/a")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 1,5000);
    }

}

