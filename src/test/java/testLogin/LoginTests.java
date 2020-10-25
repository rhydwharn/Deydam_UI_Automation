package testLogin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.setUps;

public class LoginTests extends setUps {
    @Test
    public void testSuccessfulLogin() throws InterruptedException
    {
        loginPage.enterUsername("ajidetest");
        loginPage.enterPassword("Malinat0r");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        //Check if the Pagetitle is correct
        

        Thread.sleep(5000);
    }


}
