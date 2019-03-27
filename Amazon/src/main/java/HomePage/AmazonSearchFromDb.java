package HomePage;

import Base.CommonAPI;
import Databases.ConnectToSqlDB;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utility.DataReader;
import java.sql.SQLException;
import java.util.List;

public class AmazonSearchFromDb extends CommonAPI {

    ConnectToSqlDB database = new ConnectToSqlDB();

    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchInput;


    public void setSearchInput(String items)throws Exception{
        searchInput.sendKeys(items, Keys.ENTER);
        Thread.sleep(1000);
    }

    public void clearInput(){
        searchInput.clear();
    }


    public void searchItems()throws Exception{
        List<String> list = database.readDataBase("Amazon","products");
        for ( int i =0; i < list.size(); i++){
            setSearchInput(list.get(i));
            clearInput();
        }
    }

}
