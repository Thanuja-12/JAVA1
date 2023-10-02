package com.tnsif.DayEight.interfacesdemo;

public interface Bank {
	final static float MINBAL = 5000;
	final static float DEPOSIT_LIMIT = 25000;

	public void deposit(float amount);

	public void withdraw(float amount);

}