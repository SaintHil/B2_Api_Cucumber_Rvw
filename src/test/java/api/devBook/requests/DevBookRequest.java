package api.devBook.requests;

import static api.devBook.common.DataForApi.*;
import api.devBook.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DevBookRequest {

 public static Response response;

    public static Response getAllProfiles(){
        response= given().accept(ContentType.JSON)
                .when()
                .get(ConfigurationReader.get("getAllProfiles"));
        response.prettyPrint();
        return response;
    }

    public static Response getOneUserWithPathParam(int id){
        response=given().accept(ContentType.JSON)
                .pathParam("userID",id)
                .when()
                .get(ConfigurationReader.get("getOneUserWithPathParam"));
        response.prettyPrint();
        return response;
    }

    public static Response registerNewUser(String email, String password, String name,
                                           String google, String facebook, String github){
        response=given().accept(ContentType.JSON)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body(registerUserBody(email, password, name, google, facebook, github))
                .when()
                .post(ConfigurationReader.get("registerNewUser"));
        response.prettyPrint();
    return response;
    }


}
