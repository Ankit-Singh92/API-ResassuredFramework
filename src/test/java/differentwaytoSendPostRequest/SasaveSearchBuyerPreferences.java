package differentwaytoSendPostRequest;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SasaveSearchBuyerPreferences {

	//@Test
	public void SasaveSearchBuyerPreferences_Responsevalidation() {
		String token = "YnVKaTVTa2VzQUtFZHZlUjhCUjkwM2FQUlRXY0NacUZGVm5tdmdDQlFCSHVjdEFMKzkwbzZ4anl0RWxIYVdHbVBidUxBaHFtbk5YVlhRcnJ5QnRjbDBCTWREa21PV081eENTMWNlNENFbkE9";

	Response res=	given().contentType("application/json")
				// .pathParam("userid", 1733)
				// .pathParam("offset", 0)
				// .pathParam("limit", 10)
				.auth().oauth2(token)

				.when().get("https://buyer.bizvibe.com/bhapi/services/saveSearchBuyerPreferences/1733/0/10");
			   String responsebody=res.getBody().asString();
		
		  JSONObject jsonresponse=new JSONObject(responsebody);
		  JSONArray dataArray=jsonresponse.getJSONArray("data"); 
		  JSONObject dataobject=dataArray.getJSONObject(0);
		  JSONObject sourceobj=dataobject.getJSONObject("_source");
		  String revnue=sourceobj.getJSONObject("basics").get("revenue_range").toString();
		  Assert.assertEquals(revnue, "1billion +");
		 
	}
	
	@Test
	public void dataValidation() {
	String token = "YnVKaTVTa2VzQUtFZHZlUjhCUjkwM2FQUlRXY0NacUZGVm5tdmdDQlFCSHVjdEFMKzkwbzZ4anl0RWxIYVdHbVBidUxBaHFtbk5YVlhRcnJ5QnRjbDBCTWREa21PV081eENTMWNlNENFbkE9";

	Response res=	given().contentType("application/json")
				// .pathParam("userid", 1733)
				// .pathParam("offset", 0)
				// .pathParam("limit", 10)
				.auth().oauth2(token)

				.when().get("https://buyer.bizvibe.com/bhapi/services/saveSearchBuyerPreferences/1733/0/10");
	String responsebody=res.getBody().asString();
	JSONObject jsonresponse=new JSONObject(responsebody);
	   JSONArray dataarray=jsonresponse.getJSONArray("data");
			   
	   for(int i=0;i<dataarray.length();i++) {
		        
		   JSONObject firstjsonobject =dataarray.getJSONObject(i);
		   JSONObject sourceobject=  firstjsonobject.getJSONObject("_source");
		     JSONObject baseobject=sourceobject.getJSONObject("basics");
		  String headquarter= baseobject.getString("headquarters");
		 System.out.println(headquarter);
		 if(headquarter.equals("India")) {
			Assert.assertTrue(true," headquarter ids not found");
			 break;
		 }
		      
		   
	   }
	}
}


