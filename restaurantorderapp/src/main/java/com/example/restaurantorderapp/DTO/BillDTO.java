package com.example.restaurantorderapp.DTO;

public class BillDTO {
	private String customerName;
	private String foodIntem;
	private double amount;
	
	public BillDTO() {
		super();
	}
	
	public BillDTO(String customerName, String foodIntem, double d) {
		super();
		this.customerName = customerName;
		this.foodIntem = foodIntem;
		this.amount = d;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getFoodIntem() {
		return foodIntem;
	}
	public void setFoodIntem(String foodIntem) {
		this.foodIntem = foodIntem;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
