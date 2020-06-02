package com.dathanwong.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	private static int count = 0;
	private static Double totalBalance = 0.0;
	
	public BankAccount() {
		this.accountNumber = this.generateAccountNumber();
		count++;
	}
	
	public String generateAccountNumber() {
		String accountNum = "";
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			accountNum += String.valueOf(rand.nextInt(10));
		}
		return accountNum;
	}
	
	public void deposit(String account, Double amount) {
		if(account.equals("checking")) {
			this.checkingBalance += amount;
		}else if(account.equals("savings")) {
			this.savingsBalance += amount;
		}else {
			return;
		}
		totalBalance += amount;
		this.viewBalance();
	}
	
	public void withdraw(String account, Double amount) {
		if(account.equals("checking")) {
			if(this.checkingBalance < amount) {
				System.out.println("Insufficient Funds");
			}else {
				this.checkingBalance -= amount;
				totalBalance -= amount;
			}
		}else if(account.equals("savings")) {
			if(this.savingsBalance < amount) {
				System.out.println("Insufficient Funds");
			}else {
				this.savingsBalance -= amount;
				totalBalance -= amount;
			}
		}else {
			return;
		}
		this.viewBalance();
		return;
	}
	
	public void viewBalance() {
		System.out.println("Checking balance: " + this.checkingBalance + " Saving balance: " + this.savingsBalance);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}
	public static int getCount() {
		return count;
	}
	public static Double getTotalBalance() {
		return totalBalance;
	}
	
}
