package api.Tests;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.Adjustments;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AdjustmentsTest {
	Adjustments adjustmentpayload;
	@BeforeClass
	public void setUpData() {
		adjustmentpayload=new Adjustments();
		
		Adjustments.Data datapayload=new Adjustments.Data();
		datapayload.setType("adjustments");
		Adjustments.Attributes 	attributespayload=new Adjustments.Attributes();
		
		attributespayload.setName("Clothpayment");
		attributespayload.setCurrency_code("CL568");
		attributespayload.setAmount_cents("599$");
		
		datapayload.setAttributes(attributespayload);
		adjustmentpayload.setData(datapayload);	
	}
	@Test
	public void createAdjustmentTC() {
		
		Response response= given()
         .contentType(ContentType.JSON)
         .body(adjustmentpayload)
         .log().body()
     .when()
         .post("https://reqres.in/api/users")
     .then()
         .log().headers()
         .extract().response();
		String responsedata=response.getBody().asString();
//Validate Status Code 
		Assert.assertEquals(response.getStatusCode(), 201);
		
		Assert.assertEquals(response.getContentType(), "application/json; charset=utf-8");
		Assert.assertEquals(response.jsonPath().get("data.attributes.name"),adjustmentpayload.getData().getAttributes().getName());
	}

}
