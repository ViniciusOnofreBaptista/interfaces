package com.br.knowledge.model;

import java.util.Date;

public class Installment {

	private Date date;
	private Double value;

	public Installment(Date date, Double value) {
		super();
		this.date = date;
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
