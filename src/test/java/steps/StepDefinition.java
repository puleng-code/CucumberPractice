package steps;

import io.cucumber.java.en.*;

public class StepDefinition extends Base{
        @Given("I am on Login page")
    public void i_am_on_login_page(){
    }

    @And("^I enter the username (.*)$")
    public void i_enter_the_username_user_name(String username) {
    }
    @And("^I enter the password (.*)$")
    public void i_enter_th_password_pass(String password) {
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
    }

    @Then("The homepage is displayed")
    public void the_homepage_is_displayed() {
    }

//    @Then("I quit the browser")
//    public void iQuitTheBrowser() {
//        driver.quit();
//    }
}
