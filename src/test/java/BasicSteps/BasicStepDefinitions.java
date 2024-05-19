//package steps;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BasiccStepDefinitions {
//    WebDriver driver;
//
//    @Given("I am on Login page")
//    public void i_am_on_login_page(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");
//    }
//
//    @And("^I enter the username (.*)$")
//    public void i_enter_the_username_user_name(String username) {
//        driver.findElement(By.id("user-name")).sendKeys(username);//doesn't have "...keysToSend"
//    }
//    @And("^I enter the password (.*)$")
//    public void i_enter_th_password_pass(String password) {
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
//
//    @When("I click on login button")
//    public void i_click_on_login_button() {
//        driver.findElement(By.id("login-button")).click();
//    }
//
//    @Then("The homepage is displayed")
//    public void the_homepage_is_displayed() {
////      String productText = driver.findElement(By.xpath("//span[contains(.,'Products')]")).getText();
////      Assert.assertEquals(productText,"Products");
//        driver.findElement(By.xpath("//span[contains(.,'Product')]")).isDisplayed();
//    }
//
//    @Then("I quit the browser")
//    public void iQuitTheBrowser() {
//        driver.quit();
//    }
//}