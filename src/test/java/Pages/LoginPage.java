package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username_xpath;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password_xpath;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton_xpath;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(username_xpath));
        username_xpath.sendKeys(username);
    }

    public void enterPassword(String password) {
        password_xpath.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton_xpath.click();
    }



}
