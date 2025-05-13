package com.example.restaurantorderapp.repository;

import com.example.restaurantorderapp.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, Long>{
		
}
