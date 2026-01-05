package com;

public class RazorPaymentService implements PaymentService {
	@Override
	public void pay() {
		System.out.println("This is Razor Pay payment...");
	}
}
