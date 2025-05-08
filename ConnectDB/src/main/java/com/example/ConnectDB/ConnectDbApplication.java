package com.example.ConnectDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = { 
//	    org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class,
//	    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
//	})
@SpringBootApplication
public class ConnectDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectDbApplication.class, args);
	}

}
