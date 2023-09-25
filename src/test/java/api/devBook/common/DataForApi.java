package api.devBook.common;

import io.cucumber.java.it.Ma;

import java.util.HashMap;
import java.util.Map;

public class DataForApi {

    /*
            {
          "email": "string",
          "password": "string",
          "name": "string",
          "google": "string",
          "facebook": "string",
          "github": "string"
        }
     */

    public static Map<String, Object> registerUserBody(String email, String password, String name,
                                                       String google, String facebook, String github) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("email", email);
        requestMap.put("password", password);
        requestMap.put("name", name);
        requestMap.put("google", google);
        requestMap.put("facebook", facebook);
        requestMap.put("github", github);
        return requestMap;
    }
}
