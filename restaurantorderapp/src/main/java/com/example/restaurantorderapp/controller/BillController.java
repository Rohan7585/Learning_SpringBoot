package com.example.restaurantorderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.restaurantorderapp.DTO.BillDTO;
import com.example.restaurantorderapp.entity.OrdersEntity;
//import com.example.restaurantorderapp.repository.OrdersRepository;
import com.example.restaurantorderapp.service.OrdersService;


@RestController
@RequestMapping("/api/bills")
@CrossOrigin
public class BillController {
	
	@Autowired
    private OrdersService ordersService;
	
	@GetMapping
	public List<BillDTO> getAllDTO(){
		return ordersService.getAllBill();
	}
}
