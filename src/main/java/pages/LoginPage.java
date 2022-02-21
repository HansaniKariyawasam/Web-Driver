package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.xpath(".//input[@placeholder='Email']");
    private By passwordField = By.xpath(".//input[@name='password']");
    private By logInButton = By.xpath(".//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public DashboardPage clickLoginButton(){
        WebElement ele = driver.findElement(logInButton);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ele);
        return new DashboardPage(driver);
    }
}
