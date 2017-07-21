package pageFactoryLogin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by rrt on 9/7/2016.
 */

//elements of the amazon webapp
public class SearchItems {

    //search input field
    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInput;

    //search submit field button
    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchSubmit ;


    //sending the item into the search field
    public void searchFor(String item){

        searchInput.sendKeys(item, Keys.ENTER);
    }

    //clearing the search field
    public void clearSearchInput(){

        searchInput.clear();
    }
}
