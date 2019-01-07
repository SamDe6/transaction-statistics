package com.n26.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n26.model.Statistics;

@RestController
public class TransactionsController {

	@RequestMapping(value = "/transactions", method = POST)
	public void postTransactions() {

	}

	@RequestMapping(value = "/statistics", method = GET)
	public Statistics getStats() {
		return null;
	}

	@RequestMapping(value = "/transactions", method = DELETE)
	public void deleteTransactions() {

	}
}
