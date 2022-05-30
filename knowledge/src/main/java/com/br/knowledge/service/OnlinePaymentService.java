package com.br.knowledge.service;

public interface OnlinePaymentService {

	double interest(double amount, int months);
	double paymentFee(double amount);
	
}
