package api.Tests;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.DataBase;
import com.POJO.DataBase.Sorts;

import io.restassured.http.ContentType;

public class DataBaseTests {
	DataBase databasepayload;
	@BeforeClass
	public void setUp() {
		databasepayload=new DataBase();
		//create array list to add array object 
		
		List<DataBase.Sorts> storslist=new ArrayList<DataBase.Sorts>();
		//create object of inner class 
		DataBase.Sorts sorts=new DataBase.Sorts();
		sorts.setProperty("ankit ");
		sorts.setDirection("Businness");
	
		storslist.add(sorts);
		databasepayload.setSorts(storslist);
		
	}

	@Test
	public void testDataBaseCreation() {
		given()
		   .contentType(ContentType.JSON)
		     .body(databasepayload).log().body()  
		   .when()
		      .post("https://reqres.in/api/users")
		     .then().log().status();
	}
	
}
