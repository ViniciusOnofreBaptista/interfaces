package com.br.knowledge.service;

public class BlackTagService implements OnlinePaymentService {

	private static final double PAYMENT_FEES = 0.01;
	private static final double PAYMENT_RATE = 0.02;
	
	@Override
	public double interest(double amount, int month) {
		return amount * month * PAYMENT_FEES;
	}
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_RATE;
	}
	
	


}
