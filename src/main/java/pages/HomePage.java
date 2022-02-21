package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By logInButton = By.xpath(".//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickLogIn(){
        driver.findElement(logInButton).click();
        return new LoginPage(driver);
    }

    public DashboardPage goToDashBoard(){
        return new DashboardPage(driver);
    }
}
