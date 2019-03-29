package homePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonKeywordDriven  {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBar;

    @FindBy(css = "#nav-orders > span.nav-line-2")
    WebElement Orders;


    public void setSearchBar(){
        searchBar.sendKeys("Books");
    }

    public void setOrders() throws InterruptedException {
        Thread.sleep(1000);
        Orders.click();
    }
}
