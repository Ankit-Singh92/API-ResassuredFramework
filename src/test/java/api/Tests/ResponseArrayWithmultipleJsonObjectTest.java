package api.Tests;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.ResponseArrayWithmultipleJsonObject;

import io.restassured.http.ContentType;

public class ResponseArrayWithmultipleJsonObjectTest {
	ResponseArrayWithmultipleJsonObject  requestpayload;
	@BeforeClass
	public void setUp() {
		requestpayload=new ResponseArrayWithmultipleJsonObject();
		requestpayload.setMethod("get");
		requestpayload.setPath("/hello-incremental");
	 //Creating list object to store the request object
		
		List<ResponseArrayWithmultipleJsonObject.Response> requestobjectlist=new ArrayList<ResponseArrayWithmultipleJsonObject.Response>();
		//create the object pojo inner response class
		ResponseArrayWithmultipleJsonObject.Response reqobject=new ResponseArrayWithmultipleJsonObject.Response();
		reqobject.setStatus(200);
		reqobject.setContent("Hello Foo!");
		reqobject.setContent_type("text/plain");
		
		requestobjectlist.add(reqobject);
		
		ResponseArrayWithmultipleJsonObject.Response reqobject1=new ResponseArrayWithmultipleJsonObject.Response();
		reqobject1.setStatus(200);
		reqobject1.setContent("Hello Foo!");
		reqobject1.setContent_type("text/plain");
		requestobjectlist.add(reqobject1);
		
		ResponseArrayWithmultipleJsonObject.Response reqobject2=new ResponseArrayWithmultipleJsonObject.Response();
		reqobject2.setStatus(200);
		reqobject2.setContent("Hello Foo!");
		reqobject2.setContent_type("text/plain");
		requestobjectlist.add(reqobject2);
		
		requestpayload.setResponses(requestobjectlist);
	}
	
	@Test
	public void testMultipleJsonobject() {
		
		given()
		       .contentType(ContentType.JSON)
		       .body(requestpayload).log().body()
		.when()
		      .post("https://reqres.in/api/users")
		.then().log().status();
	}
	
}
