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
    /*
            {
          "company": "string",
          "website": "string",
          "location": "string",
          "status": "string",
          "skills": "HTML,CSS,Javascript",
          "githubusername": "string",
          "youtube": "string",
          "twitter": "string",
          "facebook": "string",
          "linkedin": "string",
          "instagram": "string"
        }
     */
    public static Map<String,Object> saveProfileBody(String company,String website,String location,
                                                     String status, String skills,String githubusername,
                                                     String youtube, String  twitter, String facebook,String linkedin,
                                                     String instagram){
        Map<String,Object> profileBody=new HashMap<>();
        profileBody.put("company",company);
        profileBody.put("website",website);
        profileBody.put("location",location);
        profileBody.put("status",status);
        profileBody.put("skills",skills);
        profileBody.put("githubusername",githubusername);
        profileBody.put("youtube",youtube);
        profileBody.put("twitter",twitter);
        profileBody.put("facebook",facebook);
        profileBody.put("linkedin",linkedin);
        profileBody.put("instagram",instagram);
       return profileBody;
    }

    /*
            {
          "title": "string",
          "company": "string",
          "location": "string",
          "from": "YYYY-MM-DD",
          "to": "YYYY-MM-DD",
          "current": false,
          "description": "string"
        }
     */

    public static Map<String,Object> addExperienceBody(String title,String company,String location,
                                                     String from, String to,String current,
                                                     String description){
        Map<String,Object> experienceBody=new HashMap<>();
        experienceBody.put("title",title);
        experienceBody.put("company",company);
        experienceBody.put("location",location);
        experienceBody.put("from",from);
        experienceBody.put("to",to);
        experienceBody.put("current",current);
        experienceBody.put("description",description);

        return experienceBody;
    }


}
