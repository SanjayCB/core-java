package com.Xworkz.BankApp;

public class Bank {
	public String name;
	public String ifsc;
	public String branch;
	public String acno;
	public double balance;
	public double withDraw(double balance)
	{
		System.out.println("The amount to be withdraw"+balance);
		this.balance=this.balance+balance;
		return balance;
	}
	public double deposite(double amount)
	{
		System.out.println("The amount to be deposite"+amount);
		this.balance=this.balance+amount;
		return amount;
	}
	public void transfer(double amount,Bank friendsAccount)
	{
		System.out.println("Transfer tom friends account");
		withDraw(amount);
		friendsAccount.deposite(amount);
		
		System.out.println("Transfer Done.........\n Transfer Sucessfull");
	}
	

}
