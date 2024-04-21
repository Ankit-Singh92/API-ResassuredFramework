package api.Tests;

//import static io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
public class SaveResponseinFile {

	
	
	@Test
	public void writeResponseJsonFile() throws IOException {
		
		
		
	Response response=	given()
		       .contentType(ContentType.JSON)
		       .baseUri("https://jsonplaceholder.typicode.com")
		       
		.when()
		        .get("/users/1");
	
	String responsebody=  response.getBody().asString();
	     
	
	  String filepath=System.getProperty("user.dir")+"//Response1.json" ; 
	  FileWriter filewriter=new FileWriter(filepath);
	  
	  filewriter.write(responsebody); filewriter.close();
	 
		
	}


}
