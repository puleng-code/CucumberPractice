package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinitions {
    @Given("I am on Login page")
    public void i_am_on_login_page(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.quit();
    }
    @And("^I enter the username <user_name>(.*)$")
    public void i_enter_the_username_user_name() {
    }
    @And("^I enter the password <pass>(.*)$")
    public void i_enter_th_password_pass() {
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
    }
    @Then("The homepage is displayed")
    public void the_homepage_is_displayed() {
    }
}
