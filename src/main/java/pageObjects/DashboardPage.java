package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private WebDriver driver;
    //Using by locator
    private By avatar = By.className("topbar__avatar-name");
    private By logoutButton = By.xpath("//p[text()='Log Out']");

    public void clickAvatar(){
        driver.findElement(avatar).click();
    }

    //Confirm Dashboard URL
    public String getDashboardURL ()
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait until URL displays
        wait.until(ExpectedConditions.urlToBe("https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/feed"));
        return driver.getCurrentUrl();
    }

    public LoginPage clickLogout()
    {
        //Thread.sleep(3000);
        //Find logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
