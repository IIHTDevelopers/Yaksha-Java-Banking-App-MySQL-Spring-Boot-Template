package com.bankingapplication.entity;

import java.time.LocalDateTime;

public class Transaction {

	private Long id;

	private Double amount;

	private LocalDateTime transactionDate;

	private User user;

	public Transaction() {
		super();
	}

	public Transaction(Long id, Double amount, LocalDateTime transactionDate, User user) {
		super();
		this.id = id;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", transactionDate=" + transactionDate + ", user="
				+ user + "]";
	}
}
