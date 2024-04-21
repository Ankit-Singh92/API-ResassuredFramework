package api.Tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.UpdateAddress;
import com.POJO.UpdateAddress.Attributes;

import io.restassured.http.ContentType;

public class UpdateAddressTests {
	UpdateAddress updateaddresspayload;
	@BeforeClass
	public void setUp() {
		
		updateaddresspayload=new UpdateAddress();
		//creating object of the inner class Attribute 
		UpdateAddress.Data data=new UpdateAddress.Data();	
		data.setType("addresses");
		data.setId("BTMPO098Y");
		UpdateAddress.Attributes attribute=new UpdateAddress.Attributes();
		attribute.setBusiness("Ecommerce");
		attribute.setCity("India");
        attribute.setBilling_info("Shiiping details");
        data.setAttributes(attribute);
        
        UpdateAddress.Relationships relationships=new UpdateAddress.Relationships();
      
        UpdateAddress.Geocoder geo=new UpdateAddress.Geocoder();
        
        UpdateAddress.Data1 data1=new UpdateAddress.Data1();
        data1.setId(345);
        data1.setType("Jio");
        geo.setData(data1);
       
        relationships.setGeocoder(geo);
        data.setRelationships(relationships);
        updateaddresspayload.setData(data);
    
	}
	@Test
	  public void testPostcreateuser() {
		  
		//  System.out.println(reqpayload.toString());
		   given()
		   .contentType(ContentType.JSON)
		     .body(updateaddresspayload).log().body()  
		   .when()
		      .post("https://reqres.in/api/users")
		     .then().log().status();
		  
	  }

}
