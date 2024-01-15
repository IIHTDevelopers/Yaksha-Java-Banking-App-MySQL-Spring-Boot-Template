package com.bankingapplication.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bankingapplication.dto.TransactionDTO;
import com.bankingapplication.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Override
	public List<TransactionDTO> getAllTransactionsByUserIdInDateOrder(Long userId, Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public TransactionDTO addTransaction(TransactionDTO transactionDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<TransactionDTO> getTransactionsByAmountRange(BigDecimal minAmount, BigDecimal maxAmount) {
		// write your logic here
		return null;
	}

	@Override
	public List<TransactionDTO> getTransactionsByDateRange(Long userId, LocalDate startDate, LocalDate endDate) {
		// write your logic here
		return null;
	}
}
