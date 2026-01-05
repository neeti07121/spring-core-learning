package com;

public class MainApp {
	public static void main(String ars[]) {
		//private PaymentService paymentService = new RazorPaymentService();
		// We cant use private here so we abstract one more layer.
		OrderService o = new OrderService();
		o.placeOrder();
	}

}
