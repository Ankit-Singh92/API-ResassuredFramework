package differentwaytoSendPostRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import javax.swing.text.AbstractDocument.Content;

import com.POJO.UserModule;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class UserModuleTest {
	
	
	UserModule user =new UserModule();
	String token="YnVKaTVTa2VzQUtFZHZlUjhCUjkwM2FQUlRXY0NacUZGVm5tdmdDQlFCSHVjdEFMKzkwbzZ4anl0RWxIYVdHbVBidUxBaHFtbk5YVlhRcnJ5QnRjbDBCTWREa21PV081eENTMWNlNENFbkE9";
	
	@Test
	public void getListofUserModule() {
		user.setUser_id(1733);
		user.setPlan_id(1);
		user.setOrg_ref_id("4a32c5ab2ef00ab97cecef6396d5c9c6");
		user.setSub_user_id(1733);
		
	Response res=	given()
		      .contentType("application/json")
		      .auth().oauth2(token)
		      .body(user)
		.when()
		       .post("https://buyer.bizvibe.com/bhapi/services/userModulesLimitDetails");

	      System.out.println(res.getBody().asString());
	       int statuscode= res.getStatusCode();
	       Assert.assertEquals(statuscode, 200);//validating response code 
	          
		    int status=Integer.parseInt(res.jsonPath().get("status").toString());
		    Assert.assertEquals(status,1);
		 String assigned=     res.jsonPath().get("data.user_limit.tags_and_notes.assigned")
		      .toString();
		 Assert.assertEquals(assigned,"unlimited");
		
	}

}
