package com.joaobitencourt.projetoUm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joaobitencourt.projetoUm.entities.Order;
import com.joaobitencourt.projetoUm.services.OrderService;

@SpringBootApplication
public class ProjetoUmApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderservice;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoUmApplication.class, args);
		
	}
	
	@Override
	public  void run (String... args) throws Exception{	
		Order order = new Order(01, 99.0, 10.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println( "Valor toal: R$" + orderservice.total(order));
		
	}

}
