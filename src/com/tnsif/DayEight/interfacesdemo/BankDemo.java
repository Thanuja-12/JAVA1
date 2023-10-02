package com.tnsif.DayEight.interfacesdemo;

public class BankDemo {

	public static void main(String[] args) {
		SavingsAccount s1=new SavingsAccount("Indu", "Banglore", 100, 50000);
		
		System.out.println(s1);
		
		s1.deposit(20000);
		System.out.println(s1);
		
		s1.withdraw(40000);
		System.out.println(s1);
		

	}

}