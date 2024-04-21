package api.Tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.Adjustments;

import io.restassured.http.ContentType;

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
		
		 given()
         .contentType(ContentType.JSON)
         .body(adjustmentpayload)
         .log().body()
     .when()
         .post("https://reqres.in/api/users")
     .then()
         .log().status();
		
		
	}

}
