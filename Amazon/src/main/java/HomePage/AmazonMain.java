package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMain extends CommonAPI {

    @FindBy(css ="#twotabsearchtextbox" )
    WebElement Searchbar;

    public void setSearchbar(){
        Searchbar.click();
    }

}
