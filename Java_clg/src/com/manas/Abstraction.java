package com.manas;

abstract class ATM{
	abstract void checkBalance();
	abstract void withdrawCash(double amount);
	abstract void depositCash(double amount);
}

class BankATM extends ATM{
	private double balance = 1000.0;
	
	public void checkBalance() {
		System.out.println("Your current balance is : "+ balance );
	}
	public void withdrawCash(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance
			System.out.println("");
		}
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		ATM obj = new BankATM();
		obj.checkBalance();
		obj.withdrawCash(500);
		obj.depositCash(200);
		obj.checkBalance();
	}
}
