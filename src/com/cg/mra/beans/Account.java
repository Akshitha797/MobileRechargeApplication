package com.cg.mra.beans;

public class Account {
	
	private String AccountType;
	private String CustomerName;
	private double AccountBalance;
	
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}
	
	public Account(String AccountType,String CustomerName,double AccountBalance) {
		this.AccountType=AccountType;
		this.CustomerName=CustomerName;
		this.AccountBalance=AccountBalance;
	}
}
