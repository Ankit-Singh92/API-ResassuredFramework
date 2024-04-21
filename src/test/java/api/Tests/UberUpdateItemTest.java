package api.Tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import com.POJO.UberUpdateItem;
import com.POJO.UberUpdateItem.Item;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class UberUpdateItemTest {
	UberUpdateItem updateitempayload;
	@BeforeClass
	public void setUp(){
		
		updateitempayload=new UberUpdateItem();
		UberUpdateItem.Data datapayload=new UberUpdateItem.Data();
		
		UberUpdateItem.Item itemPayload=new UberUpdateItem.Item();
		 List<Item> itempayloadlist=new ArrayList<Item>();
		 itemPayload.setSku(412343);
		 
		 itemPayload.setStore_id("MPLO98TG");
		 itemPayload.setAvailable(true);
		 itemPayload.setQty(2);
		 itemPayload.setPrice(2.45);
		 itempayloadlist.add(itemPayload);
	//2nd Array object 
		 UberUpdateItem.Item itemPayload1=new UberUpdateItem.Item();
		 itemPayload1.setSku(43);		 
		 itemPayload1.setStore_id("MPLO98");
		 itemPayload1.setAvailable(true);
		 itemPayload1.setQty(2);
		 itemPayload1.setPrice(2.45);
		 
		 itempayloadlist.add(itemPayload1);
		 
		 datapayload.setItem(itempayloadlist);
		 updateitempayload.setData(datapayload);
		 
	}

	@Test
	public void testUpdateUberitem() {
		
	Response response=	given()
		      .contentType(ContentType.JSON)
		      .body(updateitempayload)
		.when()
		.post("https://reqres.in/api/users");
	//	.then().log().body();
	Headers header=response.headers();
	response.header("");
	  for(Header hd:header) {
		  
		  System.out.println(hd.getName()+""+hd.getValue());
	  }
		
	}
	
}
