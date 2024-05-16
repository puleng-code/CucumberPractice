package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    public WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement product_xpath;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyUserIsLoggedIn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(product_xpath));
        product_xpath.isDisplayed();
        String productText = product_xpath.getText();
        Assert.assertEquals(productText,"Products");

    }

}
