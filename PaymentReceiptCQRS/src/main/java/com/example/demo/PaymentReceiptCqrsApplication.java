package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.rabbitmq.client.Command;
@SpringBootApplication
public class PaymentReceiptCqrsApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentReceiptCqrsApplication.class);

	public static void main(String[] args) {
		try {		
			SpringApplication.run(PaymentReceiptCqrsApplication.class, args);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}