package com;

public class OrderService {
	private PaymentService paymentService = new RazorPaymentService();
	
	public void placeOrder() {
		paymentService.pay();
	}
}
