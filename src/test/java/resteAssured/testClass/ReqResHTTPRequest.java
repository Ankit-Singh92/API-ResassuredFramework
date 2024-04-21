package resteAssured.testClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class ReqResHTTPRequest {
String idAsString;
	@Test(enabled =false)
	 void getUserList() {

		given()
		
		.when()
		      .get("https://reqres.in/api/users?page=2")
		.then()
		     .statusCode(200)
		     .body("page", equalTo(2))
		     .log().all();
		
		
	}
	@Test
	public void createUserList() {
		
		HashMap data=new HashMap();
		data.put("name", "morpheus");
		data.put( "job", "leader");
		
	String idAsString=	given()
		    .contentType("application/json")
		    .body(data)
		    
		.when()
		      .post("https://reqres.in/api/users")
		      
		      
		.then()
		     .statusCode(201).log().all()
		     .extract().path("id");
	int id = Integer.parseInt(idAsString);
	System.out.println(id);
	}

}
