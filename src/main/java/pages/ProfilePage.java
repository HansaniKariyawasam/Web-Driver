package pages;

import executor.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    private WebDriver driver;
    private By firstName = By.xpath(".//input[@name='firstname']");
    private By lastName = By.xpath(".//input[@name='lastname']");
    private By phone = By.xpath(".//input[@name='phone']");
    private By  email = By.xpath(".//input[@name='email']");
    private By updateProfileBtn = By.xpath(".//button[text()='Update Profile']");
    private By alertText = By.xpath(".//div[@class='alert alert-success']");

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String firstName){
        driver.findElement(this.firstName).clear();
        driver.findElement(this.firstName).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(this.lastName).clear();
        driver.findElement(this.lastName).sendKeys(lastName);
    }

    public void setPhone(String phone){
        driver.findElement(this.phone).clear();
        driver.findElement(this.phone).sendKeys(phone);
    }

    public void setEmail(String email){
        driver.findElement(this.email).clear();
        driver.findElement(this.email).sendKeys(email);
    }

    public void clickUpdateProfile(){
        WebElement element =driver.findElement(updateProfileBtn);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()",element);

        System.out.println(driver.findElement(alertText));
    }
}
