package com.bankingapplication.dto;

import java.time.LocalDateTime;

public class TransactionDTO {

	private Long id;

	private Double amount;

	private LocalDateTime transactionDate;

	private UserDTO userDTO;

	public TransactionDTO() {
		super();
	}

	public TransactionDTO(Long id, Double amount, LocalDateTime transactionDate, UserDTO userDTO) {
		super();
		this.id = id;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.userDTO = userDTO;
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

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	@Override
	public String toString() {
		return "TransactionDTO [id=" + id + ", amount=" + amount + ", transactionDate=" + transactionDate + ", userDTO="
				+ userDTO + "]";
	}
}
