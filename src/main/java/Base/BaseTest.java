package Base;

import Pages.MainPage;
import Pages.SpecialistListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    public static WebDriver driver;

    public static final String MAIN_URL = "https://profi.ru";

    public final MainPage MAIN_PAGE = new MainPage();
    public final SpecialistListPage SPECIALIST_LIST_PAGE = new SpecialistListPage();

    public static SoftAssert softAssert = new SoftAssert();

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
