package api.devBook.stepDefs;


import api.devBook.utilities.ConfigurationReader;
import api.devBook.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.reset;


public class Hooks {
    @Before
    public void setUp(){
        baseURI= ConfigurationReader.get("baseURL");
    }
    @After
    public void tearDown(){
        reset();
        Driver.closeDriver();
    }
}
