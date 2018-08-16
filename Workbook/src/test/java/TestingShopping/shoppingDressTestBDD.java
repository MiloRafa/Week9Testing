package TestingShopping;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class shoppingDressTestBDD {

    private WebDriver driver;
    private static ExtentReports report;
    public ExtentTest test;

    //new index variable
    Index page;
    String dress;

    @Before
    public void setUp() throws Exception{
        report = new
                ExtentReports("C:\\Users\\Admin\\Desktop\\AutomationReports\\BDDReport.html");

        //set properties of driver
        System.setProperty("webdriver.chrome.driver","C:\\Development\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        //timeout driver if it waits for longer than 30 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //maximise window
        driver.manage().window().maximize();

        page = PageFactory.initElements(driver, Index.class);

        driver.get(Constant.url);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        report.endTest(test);
        report.flush();

    }

    @Given("^the correct text entered$")
    public void the_correct_text_entered() {

        dress = "";
    }

    @When("^I search for a blue dress$")
    public void i_search_for_a_blue_dress()  {

        dress = "blue";
        page.search(dress);
    }

    @Then("^all blue dresses should load$")
    public void all_blue_dresses_should_load() {

        test = report.startTest("Search for blue dresses");
        if(page.checkIfSearchComplete()){
            test.log(LogStatus.PASS,"Blue dress found");
        }
        else{
            test.log(LogStatus.FAIL,"Blue dress not found");
        }
        TestCase.assertTrue(page.checkIfSearchComplete());
    }

    @When("^I search for a yellow dress$")
    public void i_search_for_a_yellow_dress() {

        dress = "yellow";
        page.search(dress);
    }

    @Then("^all yellow dresses should load$")
    public void all_yellow_dresses_should_load() {

        test = report.startTest("Search for yellow dresses");
        if(page.checkIfSearchComplete()){
            test.log(LogStatus.PASS,"Yellow dress found");
        }
        else{
            test.log(LogStatus.FAIL,"Yellow dress not found");
        }
        TestCase.assertTrue(page.checkIfSearchComplete());
    }

    @When("^I search for a green dress$")
    public void i_search_for_a_green_dress(){
        dress = "green";
        page.search(dress);
    }

    @Then("^all green dresses should load$")
    public void all_green_dresses_should_load(){

        test = report.startTest("Search for green dresses");

        if(page.checkIfSearchComplete()){
            test.log(LogStatus.PASS,"Green dress found");
        }
        else{
            test.log(LogStatus.FAIL,"Green dress not found");
        }

        TestCase.assertTrue(page.checkIfSearchComplete());


    }

    @When("^I search for a white dress$")
    public void i_search_for_a_white_dress() {
        dress = "white";
        page.search(dress);
    }

    @Then("^all white dresses should load$")
    public void all_white_dresses_should_load() {

        test = report.startTest("Search for white dresses");
        if(page.checkIfSearchComplete()){
            test.log(LogStatus.PASS,"White dress found");
        }
        else{
            test.log(LogStatus.FAIL,"White dress not found");
        }
        TestCase.assertTrue("No dresses Found",page.checkIfSearchComplete());
    }

    @When("^I search for a dress$")
    public void i_search_for_a_dress(){
        dress = "dress";
        page.search(dress);
    }

    @Then("^all dresses should load$")
    public void all_dresses_should_load() {

        test = report.startTest("Search for all dresses");
        if(page.checkIfSearchComplete()){
            test.log(LogStatus.PASS,"All dresses found");
        }
        else{
            test.log(LogStatus.FAIL,"All dresses not found");
        }
        TestCase.assertTrue(page.checkIfSearchComplete());

    }

}
