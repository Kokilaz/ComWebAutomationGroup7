package pages;
import Base.CommonAPI;
import Databases.ConnectToSqlDB;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EtsyDB extends CommonAPI {
    ConnectToSqlDB database = new ConnectToSqlDB();

    @FindBy(css = "#search-query")
    WebElement searchInput;

    public void setSearchInput(String items)throws Exception{
        searchInput.sendKeys(items, Keys.ENTER);
        Thread.sleep(1000);
    }

    public void clearInput(){
        searchInput.clear();
    }

    public void searchItems()throws Exception{
        List<String> list = database.readDataBase("Etsy","items");
        for ( int i =0; i < list.size(); i++){
            setSearchInput(list.get(i));
            clearInput();
        }
    }
}

