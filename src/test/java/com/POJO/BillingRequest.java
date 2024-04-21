package com.POJO;

public class BillingRequest {

private Billing_requests billing_requests;

public Billing_requests getBilling_requests() {
	return billing_requests;
}

public void setBilling_requests(Billing_requests billing_requests) {
	this.billing_requests = billing_requests;
}
public static class Billing_requests {
	private Paymentrequest payment_request;
	private Mandaterequest mandate_request;
	private Links links;
	private Metadata metadata;
	
	public Paymentrequest getPayment_request() {
		return payment_request;
	}
	public void setPayment_request(Paymentrequest payment_request) {
		this.payment_request = payment_request;
	}
	public Mandaterequest getMandate_request() {
		return mandate_request;
	}
	public void setMandate_request(Mandaterequest mandate_request) {
		this.mandate_request = mandate_request;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
 public static class Paymentrequest{
		private String description;
		 private String amount;
		 private String scheme;
		 private String currency;
		private Metadata1 metadata;
	 public Metadata1 getMetadata() {
			return metadata;
		}
		public void setMetadata(Metadata1 metadata) {
			this.metadata = metadata;
		}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	 
 }
  public static class Mandaterequest{
	  private String verify;
	  private String currency;
	  private String  scheme;
	  private Metadata1 metadata;
	  public Metadata1 getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata1 metadata) {
		this.metadata = metadata;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}
	  
  }
 public static class Links{
	 public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	private String customer;
 }
 public static class Metadata{
	 
	 private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
 }
 
 public static class Metadata1{
	 
	 public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	private String key;
 }
}
