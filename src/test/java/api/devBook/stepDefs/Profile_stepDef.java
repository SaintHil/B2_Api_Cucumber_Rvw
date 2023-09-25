package api.devBook.stepDefs;

import api.devBook.requests.DevBookRequest;
import api.devBook.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static api.devBook.requests.DevBookRequest.*;

public class Profile_stepDef {
   // Response response;


    @When("The user sends a GET request and able to see all profiles")
    public void the_user_sends_a_get_request_and_able_to_see_all_profiles() {
        /*
        response= given().accept(ContentType.JSON)
                .when()
                .get(ConfigurationReader.get("retrieve_all_profile"));
        response.prettyPrint();
        */
        // response= DevBookRequest.getAllProfiles();
         response= getAllProfiles();
    }
    @Then("The user verifies that status code {int}")
    public void the_user_verifies_that_status_code(Integer int1) {

    }
}
