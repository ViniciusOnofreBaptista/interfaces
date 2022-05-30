package com.br.knowledge.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private String name;
	private Double amount;
	private List<Installment> installment = new ArrayList<Installment>();

	public Order(String name, Double amount) {
		super();
		this.name = name;
		this.amount = amount;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public List<Installment> getInstallment() {
		return installment;
	}

}
