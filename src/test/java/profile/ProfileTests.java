package profile;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProfileTests extends BaseTests {
    private WebDriver driver;

    @BeforeMethod
    public void testSuccessfulLogIn(){
        var loginPage=homePage.clickLogIn();
        loginPage.setUsername("user@phptravels.com");
        loginPage.setPassword("demouser");

        var dashboardPage=loginPage.clickLoginButton();
        assertEquals(dashboardPage.getAlertText(),"Hi, Demo Welcome Back","Alert text is incorrect");

    }

    @Test
    public void testProfileUpdate(){
        var dashboard= homePage.goToDashBoard();
        var profilepage= dashboard.clickMyProfile();
        profilepage.setFirstName("Hansani");
        profilepage.setLastName("Kariyawasam");
        profilepage.setPhone("0768528978");
        profilepage.setEmail("hkariyawasam@phptravels.com");
        profilepage.clickUpdateProfile();
    }
}
