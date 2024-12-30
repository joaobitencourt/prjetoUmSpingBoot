package com.joaobitencourt.projetoUm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaobitencourt.projetoUm.entities.Order;

@Service
public class OrderService {
	
	@Autowired
    private ShippingService shippingService;
	
	public double total(Order order) {
		
		double basic = order.getBasic();
		double discount = order.getDiscount();
		
		double porcentegemDiscount = ((discount * 100)/basic);
		double totalWithPercent = basic - porcentegemDiscount;
		
		double frete = shippingService.shipment(order);
		
		double total = totalWithPercent + frete;
		
		
		return total;
	}

}
