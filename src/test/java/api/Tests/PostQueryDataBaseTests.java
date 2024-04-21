package api.Tests;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.PostQueryDataBase;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostQueryDataBaseTests {
	PostQueryDataBase postQueryDataBasepayload;
	PostQueryDataBase.Select select;

	@BeforeClass
	public void setUp() {
		postQueryDataBasepayload=new PostQueryDataBase();
		PostQueryDataBase.Filter filter = new PostQueryDataBase.Filter();
		filter.setProperty("Status");

		select = new PostQueryDataBase.Select();
		select.setEquals("Reading");
		filter.setSelect(select);
		postQueryDataBasepayload.setFilter(filter);
		List<PostQueryDataBase.Sorts> sortlist = new ArrayList<PostQueryDataBase.Sorts>();
		PostQueryDataBase.Sorts sorts1 = new PostQueryDataBase.Sorts();

		sorts1.setProperty("Ankit");
		sorts1.setDirection("Bangalore");

		sortlist.add(sorts1);
		postQueryDataBasepayload.setSorts(sortlist);
	}

	@Test
	public void testPostArray() {

	Response res=	given()
		       .contentType(ContentType.JSON)
		       .body(postQueryDataBasepayload).log().body()
		.when()
				.post("https://reqres.in/api/users");
	  System.out.println(res.getBody().asString());
	Assert.assertEquals(res.getStatusCode(), 201)   ;
	 String equals=  res.jsonPath().get("filter.select.equals").toString();
	 Assert.assertEquals(equals, select.getEquals()) ;

	}
}
