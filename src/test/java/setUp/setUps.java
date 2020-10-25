package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import java.util.concurrent.TimeUnit;

public class setUps {
    //POM Pages
    //public static LoginPage loginPage;
    //public static DashboardPage dashboardPage;

    //WebDriver
    //protected WebDriver driver;

    private WebDriver driver;
    protected LoginPage loginPage;



    @BeforeTest
    public void setUp()
    {
        //Importation of chromedriver
        System.setProperty ("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Instantiate chromedriver object
        driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Launch Test URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        //Instantiate login page after launching the browser
        loginPage = new LoginPage(driver);
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quitBrowser()
    {
        //Close
        driver.quit();
    }

}
