package com.example.restaurantorderapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.restaurantorderapp.DTO.OrdersDTO;
import com.example.restaurantorderapp.entity.OrdersEntity;
//import com.example.restaurantorderapp.repository.OrdersRepository;
import com.example.restaurantorderapp.service.OrdersService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrdersController {

//	@Autowired
//	private OrdersRepository ordersRepository;
	
	@Autowired
    private OrdersService ordersService;
	
//	@PostMapping
//	public OrdersEntity createOrder(@RequestBody OrdersEntity order) {
//		return ordersRepository.save(order);
//	}
//	
//	@GetMapping
//	public List<OrdersEntity> getAllOrders(){
//		return ordersRepository.findAll();
//	}
//	
//	@GetMapping("/{id}")
//	public OrdersEntity getOrderById(@PathVariable Long id) {
//		return ordersRepository.findById(id).orElse(null);
//	}
//	
//	@PutMapping("/{id}")
//	public OrdersEntity updateOrder(@PathVariable Long id, @RequestBody OrdersEntity updateOrder){
//		return ordersRepository.findById(id)
//				.map(ordersEntity -> {
//					ordersEntity.setCustomerName(updateOrder.getCustomerName());
//					ordersEntity.setFoodItem(updateOrder.getFoodItem());
//					ordersEntity.setQuantity(updateOrder.getQuantity());
//					ordersEntity.setPrice(updateOrder.getPrice());
//					return ordersRepository.save(ordersEntity); 
//				})
//				.orElse(null);
//	}
//	
//	@DeleteMapping("/{id}")
//	public String deleteOrder(@PathVariable Long id) {
//		ordersRepository.deleteById(id);
//		return "Order with id " + id + "deleted";
//	}
	
	@PostMapping
    public OrdersEntity addOrder(@RequestBody OrdersEntity order) {
        return ordersService.saveOrder(order);
    }

    // 📤 GET: Fetch all orders as DTOs (only customerName, item, quantity)
    @GetMapping
    public List<OrdersDTO> getOrders() {
        return ordersService.getAllOrder();
    }
}
