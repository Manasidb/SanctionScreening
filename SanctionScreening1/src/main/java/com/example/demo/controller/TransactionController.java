package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService ts;
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String message() {
		return "welcome to REST";
	}
	
	@RequestMapping(value = "/addTransactions", method = RequestMethod.GET)
	public void addTransactions() {
		ts.addTransactions();
		System.out.println("Transactions added.");
	}
	
	@RequestMapping(value = "/displayAll", method = RequestMethod.GET)
	public List<Transaction> displayAll() {
		return ts.displayAllTransactionsFromDB();
	}
	
	@RequestMapping(value = "/displayStatus/{status}", method = RequestMethod.GET)
	public List<Transaction> displayStatus(@PathVariable(name = "status") String status) {
		return ts.displayStatus(status);
	}
	
	@RequestMapping(value = "/checkSanctionList", method = RequestMethod.GET)
	public List<Transaction> checkSanctionList() {
		return ts.screening();
	}
	
	@RequestMapping(value = "/exit", method = RequestMethod.GET)
	public void exitToHomepage() {
		ts.exit();
	}
	
	
	
}
