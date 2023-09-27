package api.devBook.stepDefs;

import api.devBook.utilities.ApiUtils;
import api.devBook.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Experience_stepDef {
    @Given("The user sends a POST request and login with {string} and {string}")
    public void the_user_sends_a_post_request_and_login_with_and(String email, String password) {
        ConfigurationReader.set("postLoginToken",ApiUtils.getAccessToken(email, password));
    }
    @When("The user send a POST request for adding an experience with {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void the_user_send_a_post_request_for_adding_an_experience_with_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {

    }
    @When("The compiler gets the experience ID")
    public void the_compiler_gets_the_experience_id() {

    }
    @When("The user sends a GET request to get experience with ID")
    public void the_user_sends_a_get_request_to_get_experience_with_id() {

    }
    @When("The user is on the Dashboard Page")
    public void the_user_is_on_the_dashboard_page() {

    }
    @Then("The user verifies that UI experience and API experience for the {string} should match")
    public void the_user_verifies_that_ui_experience_and_api_experience_for_the_should_match(String string) {

    }
}
