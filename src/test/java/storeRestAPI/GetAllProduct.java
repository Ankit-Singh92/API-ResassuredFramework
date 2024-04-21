package storeRestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;
public class GetAllProduct {
	@Test(enabled=false)
	public void test_GetAllProductList() {	
	Response responsedata=	given()
		      .contentType("application/json")
	   .when()
	          .get("https://fakestoreapi.com/products");   
	String jsonresponse=responsedata.getBody().asString();
	   JSONArray jsonresponsearray=new JSONArray(jsonresponse);	   
	   for(int i=0;i<jsonresponsearray.length();i++) {		   
		      JSONObject responsejsonobject=jsonresponsearray.getJSONObject(i);		      
		  String title= responsejsonobject.getString("title");
		  System.out.println(title);
		  if(title.equals("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet")) {			  
			  Assert.assertTrue(true, "title is found in the response");		  
		  }else {
			  Assert.assertFalse(false);
		  }
	   } 
	}
	
	@Test
	public void getSupplierDetails() {
		given()
	      .contentType("application/json")
         .when()
        .get("https://fakestoreapi.com/products");  
		
	}
}
