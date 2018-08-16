import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


public class Test2Shoppingdress {

        private WebDriver driver;
        private static ExtentReports report = new ExtentReports("C:\\Users\\Admin\\Desktop\\AutomationReports\\BasicReport.html", true);
        public ExtentTest test;


    @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver","C:\\Development\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            test = report.startTest("Search for dress");
            driver.manage().window().maximize();
            test.log(LogStatus.PASS,"Maximise window");
            driver.get(Constant.url);
        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
            report.endTest(test);
        }

        @Test
        public void findDressTest() throws Exception {
            Index page = PageFactory.initElements(driver, Index.class);
            //page.search();
            assertTrue(page.checkIfSearchComplete());
            if(page.checkIfSearchComplete()){
                test.log(LogStatus.PASS,"Dress found");
            }
            else{
                test.log(LogStatus.FAIL,"Dress not found");
            }
        }

        @AfterClass
        public static void tearDownClass() {
            report.flush();
    }
}
