package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }


    //Using By Location
    private By username = By.id("username");
    private By password = By.id("password");
    private By logo = By.xpath("//img[@alt='logo']");
    private By loginButton = By.xpath("//button[text()='Sign In ']");



    public void enterUsername (String uName)
    {
        driver.findElement(username).sendKeys(uName);
    }

    public void enterPassword (String pwd)
    {
        //Enter password
        driver.findElement(password).sendKeys(pwd);
    }

    public DashboardPage clickLoginButton()
    {
        //Click Login button
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }



}
