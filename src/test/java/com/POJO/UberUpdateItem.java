package com.POJO;

import java.util.List;

public class UberUpdateItem {

	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Item> item;

		public List<Item> getItem() {
			return item;
		}

		public void setItem(List<Item> item) {
			this.item = item;
		}
	}

	public static class Item {
		private String store_id;
		private boolean available;
		private int qty;
		private double price;

		public int getSku() {
			return sku;
		}

		public void setSku(int sku) {
			this.sku = sku;
		}

		public String getStore_id() {
			return store_id;
		}

		public void setStore_id(String store_id) {
			this.store_id = store_id;
		}

		public boolean isAvailable() {
			return available;
		}

		public void setAvailable(boolean available) {
			this.available = available;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		private int sku;

	}
}
