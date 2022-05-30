package com.br.knowledge.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.br.knowledge.model.Installment;
import com.br.knowledge.model.Order;

@Service
public class ServiceOrder {

	private OnlinePaymentService onlinePaymentService;

	public ServiceOrder() {
		super();
	}

	public ServiceOrder(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public Order createOrder(Order order, int installmentNumber) {
		double valueInstallment = 0.0;
		for (int i = 1; i <= installmentNumber; i++) {
			valueInstallment = order.getAmount() / installmentNumber;
			valueInstallment += onlinePaymentService.interest(valueInstallment, i);
			valueInstallment += onlinePaymentService.paymentFee(valueInstallment);
			order.getInstallment().add(new Installment(new Date(), valueInstallment));
		}
		return order;
	}

}
