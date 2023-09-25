package api.devBook.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static api.devBook.requests.DevBookRequest.*;
import static org.junit.Assert.*;

public class SignUp_stepDef {
    @When("The user sends a POST request with {string} and {string} and {string} and {string} and {string} and {string}")
    public void the_user_sends_a_post_request_with_and_and_and_and_and(String email, String password, String name,
                                                                       String google, String facebook, String github) {
        response = registerNewUser(email, password, name, google, facebook, github);
    }

    @Then("The user verifies that body contains {string}")
    public void the_user_verifies_that_body_contains(String content) {
        assertTrue(response.body().asString().contains(content));
    }

}
