package com.bankingapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bankingapplication.dto.TransactionDTO;
import com.bankingapplication.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Override
	public List<TransactionDTO> getAllTransactionsByUserId(Long userId) {
		return null;
	}

	@Override
	public TransactionDTO addTransaction(TransactionDTO transactionDTO) {
		return null;
	}
}
