package com.example.restaurantorderapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class OrdersEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "food_item")
	private String foodItem;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private double price;
	
	public OrdersEntity() {}

	public OrdersEntity(String customerName, String foodItem, int quanity, double price) {
		super();
		this.customerName = customerName;
		this.foodItem = foodItem;
		this.quantity = quanity;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public void setQuantity(int quanity) {
		this.quantity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
