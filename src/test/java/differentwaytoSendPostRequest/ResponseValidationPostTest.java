package differentwaytoSendPostRequest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResponseValidationPostTest {
	
	@Test(enabled =false)
	public void getEcho() {
		
	Response res=	given()
		       .contentType("application/json")
		       .queryParam("foo1", "bar1")
		       .queryParam("foo2", "bar2")
		.when()
		       .get("https://postman-echo.com/get");
		
	String responsedata=	res.getBody().asString();
	JSONObject data=new JSONObject(responsedata);
	  String s=data.getJSONObject("headers").get("x-forwarded-proto").toString();
	    System.out.println(s); 
	    Assert.assertEquals(s,"https");
	}
	
	@Test
	public void postResponseValidation() throws Exception {
		
		File f=new File("src/test/resources/postecho/Post.json");
		
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		
		JSONObject reqbody=new JSONObject(jt);
		
		given()
		      .contentType("application.json")
		      .body(reqbody.toString())
		.when()
		       .post("http://postman-echo.com/post")
		.then().log().all();
		
		 
	}
}
