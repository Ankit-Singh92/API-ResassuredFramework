package com.POJO;

/*
{
  "data": {
    "type": "addresses",
    "attributes": {
      "line_1": "{{address_line_1}}",
      "city": "{{address_city}}",
      "state_code": "{{address_state_code}}",
      "country_code": "{{address_country_code}}",
      "phone": "{{address_phone}}"
    }
  }
}
*/
public class CreateAddress {
	
 private Data data;

public Data getData() {
	return data;
}

public void setData(Data data) {
	this.data = data;
}
 //Creating inner class of the Data 
public static class Data {
	private String type;
	private  Attributes attributes;
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
//Creating Inner Class of the Attribute
  public static class Attributes{
	  private String city;
	  private String state_code;
	  private String country_code;
	  private int phone;
	  public String getLine_1() {
		return line_1;
	}
	public void setLine_1(String line_1) {
		this.line_1 = line_1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	private String line_1;

	  
	  
  }
}

