package testDashboard;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import setUp.setUps;

public class DashboardTests extends setUps {


    @Test
    public void testDashboard() throws InterruptedException
    {
        loginPage.enterUsername("ajidetest");
        loginPage.enterPassword("Mailinat0r");

        DashboardPage dashboardPage = loginPage.clickLoginButton();
        Thread.sleep(5000);
        dashboardPage.clickAvatar();

        LoginPage loginPage = dashboardPage.clickLogout();

        //Confirm that user is in dashboard using URL
        //String dashboardUrl = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login";
        //Assert.assertEquals(dashboardPage.getDashboardURL(), dashboardUrl, "You are on user dashboard");
        Thread.sleep(10000);
    }


}
