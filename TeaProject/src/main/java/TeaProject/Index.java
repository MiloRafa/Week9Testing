package TeaProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Index {

    @FindBy(xpath ="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
    private WebElement Menu;

    @FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")
    private WebElement checkOut;

    public void browseMenu(String menu){
        Menu.click();

    }

    public boolean checkIfMenuIsClicked(){


    }

}
