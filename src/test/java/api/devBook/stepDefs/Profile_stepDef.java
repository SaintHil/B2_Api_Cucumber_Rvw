package api.devBook.stepDefs;

import api.devBook.requests.DevBookRequest;
import api.devBook.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static api.devBook.requests.DevBookRequest.*;
import static org.junit.Assert.*;

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
    public void the_user_verifies_that_status_code(int expectedStatusCode) {
        assertEquals(expectedStatusCode,response.statusCode());
    }
    @When("The user sends a GET request with id {int}")
    public void the_user_sends_a_get_request_with_id(int userID) {
        response=getOneUserWithPathParam(userID);
    }
    @Then("The user verifies that user's info name is {string} and company is {string} and location is {string}")
    public void the_user_verifies_that_user_s_info_name_is_and_company_is_and_location_is(String expectedName,
                                                                String expectedCompany, String expectedLocation) {
        String actualName=response.path("user.name");
        String actualCompany=response.path("company");
        String actualLocation=response.path("location");
        assertEquals(expectedName,actualName);
        assertEquals(expectedCompany,actualCompany);
        assertEquals(expectedLocation,actualLocation);
    }
}
