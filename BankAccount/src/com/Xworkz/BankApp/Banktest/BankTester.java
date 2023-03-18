package com.Xworkz.BankApp.Banktest;

import com.Xworkz.BankApp.Bank;

public class BankTester {
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.deposite(1000);
		b.withDraw(300);
		Bank friendsAccount=new Bank();
		friendsAccount.deposite(2000);
		b.transfer(500,friendsAccount);
		
	}
	

}
