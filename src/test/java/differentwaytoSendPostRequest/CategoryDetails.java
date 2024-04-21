package differentwaytoSendPostRequest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POJO.CategorydetailsPayload;

import io.restassured.response.Response;

public class CategoryDetails {

	@Test
	public void testGategoryDetails() {
		CategorydetailsPayload reqpayload = new CategorydetailsPayload();
		String token = "YnVKaTVTa2VzQUtFZHZlUjhCUjkwM2FQUlRXY0NacUZGVm5tdmdDQlFCSHVjdEFMKzkwbzZ4anl0RWxIYVdHbVBidUxBaHFtbk5YVlhRcnJ5QnRjbDBCTWREa21PV081eENTMWNlNENFbkE9";
		reqpayload.setUser_id(1733);
		reqpayload.setSort_by("suppliers");
		reqpayload.setSort_order("DESC");
		reqpayload.setSearch_keyword("");

		Response res = given().contentType("application/json").auth().oauth2(token).body(reqpayload)

				.when().post("https://buyer.bizvibe.com/bhapi/services/getCategoriesList");

		String resposedata = res.getBody().asString(); //
		System.out.println("Response data: " + resposedata);
		JSONObject dataobject = new JSONObject(resposedata);
		JSONArray dataarray = dataobject.getJSONArray("data");

		for (int i = 0; i < dataarray.length(); i++) {
			String categoryname = dataarray.getJSONObject(i).getString("category_name");
			System.out.println(categoryname);
			if (categoryname.equals("new Cat")) {
				Assert.assertTrue(true, "categoryname is not in the List");
				break;
			}

		}
	}

}
