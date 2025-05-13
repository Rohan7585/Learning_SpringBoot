package com.example.restaurantorderapp.DTO;

public class OrdersDTO {

	private String customerName;
	private String foodItem;
	private int quantity;
	
	public OrdersDTO() {}

	public OrdersDTO(String customerName, String foodItem, int quanity) {
		super();
		this.customerName = customerName;
		this.foodItem = foodItem;
		this.quantity = quanity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public int getQuantity() {
		return quantity;
	}
}
