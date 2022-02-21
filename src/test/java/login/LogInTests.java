package login;

import base.BaseTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogInTests extends BaseTests {

    @Test
    public void testSuccessfulLogIn(){
        var loginPage=homePage.clickLogIn();
        loginPage.setUsername("user@phptravels.com");
        loginPage.setPassword("demouser");

        var dashboardPage=loginPage.clickLoginButton();
        assertEquals(dashboardPage.getAlertText(),"Hi, Demo Welcome Back","Alert text is incorrect");

    }
}
