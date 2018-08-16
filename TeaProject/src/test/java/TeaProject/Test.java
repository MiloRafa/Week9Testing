package TeaProject;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static TeaProject.Constant.url;
import static org.junit.Assert.assertTrue;

public class Test {

    private WebDriver driver;
    private static ExtentReports report;
    public ExtentTest test;
    public String MenuURL = "http://www.practiceselenium.com/menu.html";

    Index page;
    String item;
    String menu;

    @Before
    public void setUp() throws Exception{
        //properties of driver
        System.setProperty("webdriver.chrome.driver","C:\\Development\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        //maximise window
        driver.manage().window().maximize();

        page = PageFactory.initElements(driver, Index.class);

        driver.get(url);

    }


    @After
    public void tearDown() throws Exception{
        driver.quit();
        report.endTest(test);
        report.flush();
    }


    @Given("^the correct web address$")
    public void the_correct_web_address() throws Throwable {
        //get the url of the website we want to go to
        driver.get(url);

    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() throws Throwable {
        assertTrue(url.equals(driver.get(MenuURL));


    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() throws Throwable {
        test = report.startTest("Menu options should be displayed when menu is selected");



    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() throws Throwable {


    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page() throws Throwable {
        test = report.startTest("Checkout page should be displayed");


    }

}
