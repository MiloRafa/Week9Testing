package TestingShopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Index {

    @FindBy(id = "search_query_top")
    private WebElement searchBar;

    @FindBy(name = "submit_search")
    private  WebElement submitSearch;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")

    private  WebElement dressResult;

    public void search(String dress) {
        searchBar.sendKeys(dress);
        submitSearch.click();
    }

    public boolean checkIfSearchComplete()
    {
        if(!dressResult.getText().contains("0")){
            return  true;
        }
        return false;
    }
}
