package com.joaobitencourt.projetoUm.services;

import org.springframework.stereotype.Service;

import com.joaobitencourt.projetoUm.entities.Order;

@Service
public class ShippingService {
	
	public double shipment (Order order) {
		
		double frete;
		
		if(order.getBasic() < 100) {
			frete = 20;
		}else if (order.getBasic() >= 100 || order.getBasic() == 200){
			frete = 12;
		}else {
			frete = 0;
		}
		
		double shipment = frete;
		
		return shipment;
	}

}
