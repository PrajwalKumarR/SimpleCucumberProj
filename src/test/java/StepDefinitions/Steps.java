package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Before
    public void setup(){
        System.out.println("===========================================================");
    }

    @After
    public void teardown(){
        System.out.println("===========================================================");
    }

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered valid credentials");
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("Clicked on submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Yeah I am logged in");
    }

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        System.out.println("Entered invalid credentials");
    }
    @Then("an invalid credentials error message should be displayed to the user")
    public void an_invalid_credentials_error_message_should_be_displayed_to_the_user() {
        System.out.println("error displayed::: Username or password invalid");
    }
    @Then("login should be unsuccessful")
    public void login_should_be_unsuccessful() {
        System.out.println("User was not logged in");
    }

    @Then("the Company logo should be present in the login form")
    public void the_company_logo_should_be_present_in_the_login_form() {
        System.out.println("The company logo is present in the login form");
    }
}