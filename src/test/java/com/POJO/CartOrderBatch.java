package com.POJO;

import java.util.List;

public class CartOrderBatch {
/*
 * [
    {
        "cust_ref" : "TEST02",
        "ship_company" : "Will Town",
        "ship_address_1" : "351 Hitchcock Way",
        "ship_address_2" : "Suite B140",
        "ship_city" : "Santa Barbara",
        "ship_state" : "CA",
        "ship_zip" : "93105",
        "ship_country" : "USA",
        "ship_is_billing" : true,
        "items" : 
        [
            {
                "item" : "C100",
                "quantity" : 2
            },
            {
                "item" : "C300",
                "quantity" : 1
            }
        ]
    },
    {
        "cust_ref" : "TEST03",
        "ship_company" : "Will Town",
        "ship_address_1" : "351 Hitchcock Way",
        "ship_address_2" : "Suite B140",
        "ship_city" : "Santa Barbara",
        "ship_state" : "CA",
        "ship_zip" : "93105",
        "ship_country" : "USA",
        "ship_is_billing" : true,
        "items" : 
        [
            {
                "item" : "C100",
                "quantity" : 2
            },
            {
                "item" : "C300",
                "quantity" : 1
            }
        ]
    }
]
 */
	private String cust_ref;
	private String ship_company;
	private String ship_address_1;
	private String ship_address_2;
	private String ship_city;
	private String ship_state;
	private String ship_country;
	private boolean ship_is_billing;
	private List<Items> items;
	
	public String getCust_ref() {
		return cust_ref;
	}
	public void setCust_ref(String cust_ref) {
		this.cust_ref = cust_ref;
	}
	public String getShip_company() {
		return ship_company;
	}
	public void setShip_company(String ship_company) {
		this.ship_company = ship_company;
	}
	public String getShip_address_1() {
		return ship_address_1;
	}
	public void setShip_address_1(String ship_address_1) {
		this.ship_address_1 = ship_address_1;
	}
	public String getShip_address_2() {
		return ship_address_2;
	}
	public void setShip_address_2(String ship_address_2) {
		this.ship_address_2 = ship_address_2;
	}
	public String getShip_city() {
		return ship_city;
	}
	public void setShip_city(String ship_city) {
		this.ship_city = ship_city;
	}
	public String getShip_state() {
		return ship_state;
	}
	public void setShip_state(String ship_state) {
		this.ship_state = ship_state;
	}
	public String getShip_country() {
		return ship_country;
	}
	public void setShip_country(String ship_country) {
		this.ship_country = ship_country;
	}
	public boolean getShip_is_billing() {
		return ship_is_billing;
	}
	public void setShip_is_billing(boolean b) {
		this.ship_is_billing = b;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	//create inner class of the item
	public static class Items{
		private String item;
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		private int quantity;
	}
	
	}

