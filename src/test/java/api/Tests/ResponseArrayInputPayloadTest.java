package api.Tests;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.ResponseArrayInpayload;
import com.POJO.ResponseArrayInpayload.Responses;

import io.restassured.http.ContentType;
public class ResponseArrayInputPayloadTest {
	
	
	
	
	
	
	ResponseArrayInpayload reqpayload;
	@BeforeClass
	public void setUp() {
		
		reqpayload=new ResponseArrayInpayload();
		reqpayload.setMethod("get");
		reqpayload.setPath("/hello-world-delayed");
		//creating list to hold the response object
		 List<ResponseArrayInpayload.Responses> responsesList = new ArrayList<ResponseArrayInpayload.Responses>();
		ResponseArrayInpayload.Responses responsepayload=new ResponseArrayInpayload.Responses();
		responsepayload.setStatus(200);
		responsepayload.setContent("Hello world!");
		responsepayload.setContent_type("text/plain");
		responsepayload.setDelay(3000);
		responsesList.add(responsepayload);
		
		
		
		reqpayload.setResponses(responsesList);
	}
	
  @Test
  public void testPostcreateuser() {
	  
	//  System.out.println(reqpayload.toString());
	   given()
	   .contentType(ContentType.JSON)
	     .body(reqpayload).log().body()
	     
	   .when()
	      .post("https://reqres.in/api/users")
	     .then().log().status();
	  
  }
  
  
}
