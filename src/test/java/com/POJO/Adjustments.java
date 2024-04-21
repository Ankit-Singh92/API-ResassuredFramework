package com.POJO;

public class Adjustments {
	
	private Data data ;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

 public static class Data{
		
		private String type;
		private Attributes attributes;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Attributes getAttributes() {
			return attributes;
		}
		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}
		
		}
 
 public static class Attributes{
	 private String name;
	 private String currency_code;
	 private String amount_cents;
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public String getAmount_cents() {
		return amount_cents;
	}
	public void setAmount_cents(String amount_cents) {
		this.amount_cents = amount_cents;
	}
	
 }
}


