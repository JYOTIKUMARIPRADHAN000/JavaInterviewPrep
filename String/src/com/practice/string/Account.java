package com.practice.string;

//class must be final to make it immutable. 
//all instance variables will be private final
//make constructor
// no setter method // only getter 
public final class Account {
	private final int accountNumber;
	private final String name;

	public Account(int accNum, String name) {
		this.accountNumber = accNum;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

}
