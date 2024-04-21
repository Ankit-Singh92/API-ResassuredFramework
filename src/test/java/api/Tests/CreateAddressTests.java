package api.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.POJO.CreateAddress;

import io.restassured.http.ContentType;

public class CreateAddressTests {
	CreateAddress addressrequestpayload;
	@BeforeClass
	public void setUp() {
		addressrequestpayload=new CreateAddress();
		//Creating Data inner class object
		CreateAddress.Data data=new CreateAddress.Data();
		data.setType("addresses");
		CreateAddress.Attributes attribute=new CreateAddress.Attributes();
		attribute.setCity("india");
		attribute.setCountry_code("ANBTM09");
		attribute.setLine_1("BTM 1st Sate");
		attribute.setPhone(980678900);
		attribute.setState_code("UPBTM098");
		data.setAttributes(attribute);
		addressrequestpayload.setData(data);
	
	}
	@Test
	public void testCreateAddress() {
		
		given()
		      .contentType(ContentType.JSON)
		      .body(addressrequestpayload).log().body()
		.when() 
		      .post("https://reqres.in/api/users")
	    .then().log().status();
	}
	

}
