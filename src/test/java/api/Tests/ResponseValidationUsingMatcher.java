package api.Tests;

import java.util.HashMap;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class ResponseValidationUsingMatcher {

	
	@Test(enabled =false)
	public void responseTest() {
		
		
		
		
		// List winnerIds = get("/lotto").jsonPath().getList("lotto.winners.winnerId");
		JsonPath jsonData= given()
	                   .contentType(ContentType.JSON)
	                   //.body(data).log().all()
	           .when()
	                  .get("https://reqres.in/api/users/1")
	          .then().extract().jsonPath().getJsonObject("data");
 System.out.println(jsonData);
	//	jsonData.get("first_name");       
	}

	
}
