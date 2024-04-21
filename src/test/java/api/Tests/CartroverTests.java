package api.Tests;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.Cartrover;
import com.github.javafaker.Faker;

import io.restassured.http.ContentType;

public class CartroverTests {
	Cartrover cartroverpayload;
	Faker faker;
	@BeforeClass
	public void setUp() {
		cartroverpayload=new Cartrover();
		faker=new Faker();
		cartroverpayload.setCust_ref("TEST02");	
		cartroverpayload.setShip_company(faker.company().name());	
		cartroverpayload.setShip_address_1(faker.address().buildingNumber());
		cartroverpayload.setShip_address_2(faker.address().fullAddress());
		cartroverpayload.setShip_city(faker.address().cityName());
		cartroverpayload.setShip_state(faker.address().state());
		cartroverpayload.setShip_country(faker.address().country());
		cartroverpayload.setShip_is_billing(true);
		List<Cartrover.Items>itemlist=new ArrayList<Cartrover.Items>();
		Cartrover.Items itempayload=new Cartrover.Items();
		itempayload.setItem("CA09");
		itempayload.setQuantity(2);
		itemlist.add(itempayload);
		cartroverpayload.setItems(itemlist);
		//adding 2nd object
		Cartrover.Items itempayload1=new Cartrover.Items();
		itempayload1.setItem("CA10");
		itempayload1.setQuantity(3);
		itemlist.add(itempayload1);
		cartroverpayload.setItems(itemlist);
	}
@Test
public void testCartOver() {
	given()
	       .contentType(ContentType.JSON)
	       .body(cartroverpayload).log().body()
	.when()
	      .post("https://reqres.in/api/users")
	.then() .body("items", hasItem("CA09"));
	
}
	
	
}
