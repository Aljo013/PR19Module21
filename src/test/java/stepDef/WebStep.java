package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class WebStep {

    @Then("user is on homepage")
    public void userIsOnHomepage() {
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }


    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
    }

    @When("user click login button")
    public void userClickLoginButton() {

    }

    @And("user see error massage")
    public void userSeeErrorMassage() {
    }
}
