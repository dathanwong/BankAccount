package com.dathanwong.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount joe = new BankAccount();
		System.out.println(joe.getAccountNumber());
		joe.deposit("checking", 4000.00);
		joe.withdraw("savings", 300.00);
	}

}
