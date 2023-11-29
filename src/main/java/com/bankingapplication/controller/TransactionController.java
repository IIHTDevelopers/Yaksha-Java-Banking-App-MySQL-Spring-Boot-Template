package com.bankingapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankingapplication.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

	private final TransactionService transactionService = null;
}
