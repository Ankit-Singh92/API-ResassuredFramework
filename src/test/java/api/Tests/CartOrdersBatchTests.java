package api.Tests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.CartOrderBatch;
import com.POJO.Cartrover;
import com.github.javafaker.Faker;

import io.restassured.http.ContentType;

public class CartOrdersBatchTests {
	private List<CartOrderBatch> cartOrderBatch;
	Faker faker;

	@BeforeClass
	public void setUp() {
		cartOrderBatch=new ArrayList<CartOrderBatch>();
		CartOrderBatch orderpayload=new CartOrderBatch();
		faker=new Faker();
		orderpayload.setCust_ref("TEST02");
		orderpayload.setShip_company(faker.company().name());
		orderpayload.setShip_address_1(faker.address().buildingNumber());
		orderpayload.setShip_address_2(faker.address().fullAddress());
		orderpayload.setShip_city(faker.address().cityName());
		orderpayload.setShip_state(faker.address().state());
		orderpayload.setShip_country(faker.address().country());
		orderpayload.setShip_is_billing(true);

		List<CartOrderBatch.Items> itemlist = new ArrayList<CartOrderBatch.Items>();
		CartOrderBatch.Items order1itempayload = new CartOrderBatch.Items();
		order1itempayload.setItem("CA01");
		order1itempayload.setQuantity(1);
		itemlist.add(order1itempayload);
		orderpayload.setItems(itemlist);
		cartOrderBatch.add(orderpayload);


		CartOrderBatch orderpayload2 = new CartOrderBatch();
		orderpayload2.setCust_ref("TEST03");
		orderpayload2.setShip_company(faker.company().name());
		orderpayload2.setShip_address_1(faker.address().buildingNumber());
		orderpayload2.setShip_address_2(faker.address().fullAddress());
		orderpayload2.setShip_city(faker.address().cityName());
		orderpayload2.setShip_state(faker.address().state());
		orderpayload2.setShip_country(faker.address().country());
		orderpayload2.setShip_is_billing(true);
		List<CartOrderBatch.Items> itemlistorder2list = new ArrayList<CartOrderBatch.Items>();
		CartOrderBatch.Items itemlistorder2payload = new CartOrderBatch.Items();
		itemlistorder2payload.setItem("CA02");
		itemlistorder2payload.setQuantity(3);
		itemlistorder2list.add(itemlistorder2payload);
		orderpayload2.setItems(itemlistorder2list);
		cartOrderBatch.add(orderpayload2);
	}

	@Test
	public void testCartOver() {
		given().contentType(ContentType.JSON)
		.body(cartOrderBatch).log().body()
		.when()
				.post("https://reqres.in/api/users")
				.then().log().status();

	}
}
