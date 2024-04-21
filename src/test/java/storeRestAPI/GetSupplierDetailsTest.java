package storeRestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POJO.GetSupplierDetails;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;
public class GetSupplierDetailsTest {
	
	String token="YnVKaTVTa2VzQUtFZHZlUjhCUjkwM2FQUlRXY0NacUZGVm5tdmdDQlFCSHVjdEFMKzkwbzZ4anl0RWxIYVdHbVBidUxBaHFtbk5YVlhRcnJ5QnRjbHpkVFdJVGdTSDNHa1VvRkVyMXp1Zjg9";
	GetSupplierDetails data=new GetSupplierDetails();
	@Test
	public void getSuppliersDetails() {
		
		data.setUser_id(1733);
		data.setLimit(4);
	  Response res=	given()
	  	      .contentType("application/json")
	  	      .auth().oauth2(token)
	  	      .body(data)
		.when()
		.post("https://buyer.bizvibe.com/bhapi/services/getMySuppliersV1");
	    String responsedata= res.getBody().asString();
	    
	    JSONObject responseobject=new JSONObject(responsedata);
	JSONArray dataarray=    responseobject.getJSONArray("data");
	for (int i = 0; i < dataarray.length(); i++) {
	    JSONObject sourceObject = dataarray.getJSONObject(i).getJSONObject("_source");
	    JSONArray keyExecutivesArray = sourceObject.getJSONArray("keyexecutives");
	    
	    for (int j = 0; j < keyExecutivesArray.length(); j++) {
	        String designation = keyExecutivesArray.getJSONObject(j).getString("designation");
	        System.out.println(designation);
	        
	        if (designation.equals("Deputy General Manager-Electricity Business Group")) {
	            Assert.assertTrue(true, "designation found");
	            break;
	        }
	    }
	}
	 
	}

}
