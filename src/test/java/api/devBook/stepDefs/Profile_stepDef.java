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

    @When("The user sends a POST request with {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void the_user_sends_a_post_request_with_and_and_and_and_and_and_and_and_and_and(String company,String website,String location,
                                                                                           String status, String skills,String githubusername,
                                                                                           String youtube, String  twitter, String facebook,String linkedin,
                                                                                           String instagram) {
        response=postSaveProfile(company, website, location, status, skills, githubusername, youtube, twitter, facebook, linkedin, instagram);
    }

    @Then("The user verifies that name as {string} and email as {string}")
    public void the_user_verifies_that_name_as_and_email_as(String expectedName, String expectedEmail) {
        assertEquals(expectedName,response.path("user.name"));
        assertEquals(expectedEmail,response.path("user.email"));

    }
}
