package api.Tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.BillingRequest;

import io.restassured.http.ContentType;

public class BillingRequestTests {
	BillingRequest billingrequestpayload;
	@BeforeClass
	public void setUp() {
		billingrequestpayload=new BillingRequest();
		BillingRequest.Billing_requests brpayload=new BillingRequest.Billing_requests();
		
		BillingRequest.Paymentrequest paymentpayload=new BillingRequest.Paymentrequest();	
		paymentpayload.setDescription("Apple");
		paymentpayload.setAmount("300$");
		paymentpayload.setScheme("faster_payments");
		BillingRequest.Metadata1 metadatpaymentpayload=new BillingRequest.Metadata1();
		metadatpaymentpayload.setKey("value");
		
		paymentpayload.setMetadata(metadatpaymentpayload);
		brpayload.setPayment_request(paymentpayload);
		//
		BillingRequest.Mandaterequest mandatrequestpaylaod=new 	BillingRequest.Mandaterequest();
	
		mandatrequestpaylaod.setVerify("value");
		mandatrequestpaylaod.setCurrency("GBP");
		mandatrequestpaylaod.setScheme("bacs");
		BillingRequest.Metadata1 manbolpay=new BillingRequest.Metadata1();
		manbolpay.setKey("value");
		mandatrequestpaylaod.setMetadata(manbolpay);
		brpayload.setMandate_request(mandatrequestpaylaod);
		//
		BillingRequest.Links linkpayload=new BillingRequest.Links();
		linkpayload.setCustomer("Cust09TY");
		brpayload.setLinks(linkpayload);
		
		BillingRequest.Metadata metapayload=new BillingRequest.Metadata();
		
		metapayload.setTest("BR098");
		brpayload.setMetadata(metapayload);
		billingrequestpayload.setBilling_requests(brpayload);
	}
	@Test
    public void testCreateAddress() {
        given()
            .contentType(ContentType.JSON)
            .body(billingrequestpayload)
            .log().body()
        .when()
            .post("https://reqres.in/api/users")
        .then()
            .log().status();
    }
}
