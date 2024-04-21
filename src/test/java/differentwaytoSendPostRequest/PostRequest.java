package differentwaytoSendPostRequest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class PostRequest {
	
	
	@Test
	public void saveSuppliersList() throws Exception {
		File data=new File(".\\Payload/body.json");
		//FileReader fr=new FileReader(fs);
	//	JSONTokener jt=new JSONTokener(fr);
		
	//	JSONObject data=new JSONObject(jt);
		
		given()
		       .contentType("application/json")
		       .body(data)
		.when()
		   .post("http://postman-echo.com/post")
		.then()
.statusCode(200)
.body("data.__type", equalTo("Aldis.Models.v4.Info.CameraStatusModel, Aldis.Models"))
.log().all();		    
		
	}
	
	
	
	

}
