package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By welcomeText = By.cssSelector(".section-heading h2");
    private By myProfileLink = By.xpath(".//a[@href='https://www.phptravels.net/account/profile'][@class=' waves-effect']");

    public DashboardPage(WebDriver driver){
        this.driver=driver;
    }

    public String getAlertText(){
        return driver.findElement(welcomeText).getText();
    }

    public ProfilePage clickMyProfile(){
        driver.findElement(myProfileLink).click();
        return new ProfilePage(driver);
    }
}
