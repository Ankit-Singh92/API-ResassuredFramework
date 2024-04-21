package com.POJO;

public class UpdateAddress {
	
	/*
	 {"data": {
    "type": "addresses",
    "id": "{{address_id}}",
    "attributes": {
      "business": "{{address_business}}",
      "city": "{{address_city}}",
      "billing_info": "{{address_billing_info}}"
    },
    "relationships": {
      "geocoder": {
        "data": {
          "type": "geocoders",
          "id": "{{address_rel_id}}"
        }
      }
    }
  }
}*/
	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	//Creating inner Class Data 
	public static class Data{
		private String type;
		private String id ;
		private Attributes attributes;
		private Relationships relationships;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Attributes getAttributes() {
			return attributes;
		}
		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}
		public Relationships getRelationships() {
			return relationships;
		}
		public void setRelationships(Relationships relationships) {
			this.relationships = relationships;
		}
		
		
	}
	//Inner Class of the Attributes
	public static class Attributes{
		private String business;
		private String city;
		private String billing_info;
		
		public String getBusiness() {
			return business;
		}
		public void setBusiness(String business) {
			this.business = business;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getBilling_info() {
			return billing_info;
		}
		public void setBilling_info(String billing_info) {
			this.billing_info = billing_info;
		}
}
	//Creating Inner class of the Relationships
	public static class Relationships{
		
		private Geocoder geocoder;

		public Geocoder getGeocoder() {
			return geocoder;
		}

		public void setGeocoder(Geocoder geocoder) {
			this.geocoder = geocoder;
		}
	}
   // creating inner class of Geocoder
	
	public static class Geocoder{
		private Data1 data;

		public Data1 getData() {
			return data;
		}

		public void setData(Data1 data) {
			this.data = data;
		}
	}
//	Creating inner class of data1
	public static class Data1{
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		private String type;
		private int id;
		
		
	}
}
