package com.br.knowledge.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.knowledge.model.Order;
import com.br.knowledge.service.BlackTagService;
import com.br.knowledge.service.ServiceOrder;

@RestController
@RequestMapping("/order")
public class OrderController {

	@PostMapping
	public ResponseEntity<?> createOrder(@RequestBody Order order, @RequestParam int installment) {
		ServiceOrder orderService = new ServiceOrder(new BlackTagService());
		Order createdOrder = orderService.createOrder(order, installment);
		return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
	}

}
