package com.example.restaurantorderapp.service;


import com.example.restaurantorderapp.DTO.BillDTO;
import com.example.restaurantorderapp.DTO.OrdersDTO;
import com.example.restaurantorderapp.entity.OrdersEntity;
import com.example.restaurantorderapp.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	public OrdersEntity saveOrder (OrdersEntity order) {
		return ordersRepository.save(order);
	}
	
	public List<OrdersDTO> getAllOrder(){
		List<OrdersEntity> orders = ordersRepository.findAll();
		return orders.stream()
			.map(order -> new OrdersDTO(
					order.getCustomerName(),
					order.getFoodItem(),
					order.getQuantity()))
			.collect(Collectors.toList());
	}
	
	public List<BillDTO> getAllBill(){
		List<OrdersEntity> bills = ordersRepository.findAll();
		return bills.stream().map(order -> new BillDTO(
				order.getCustomerName(),
				order.getFoodItem(),
				(order.getPrice() + (0.18 * order.getPrice()))))
				.collect(Collectors.toList());
	}
}
