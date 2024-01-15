package com.bankingapplication.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long id;

	private String name;

	private String accountNumber;

	private String accountType;

	private List<Transaction> transactions = new ArrayList<>();

	public User() {
		super();
	}

	public User(Long id, String name, String accountNumber, String accountType, List<Transaction> transactions) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.transactions = transactions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", transactions=" + transactions + "]";
	}
}
