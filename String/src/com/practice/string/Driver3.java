package com.practice.string;

public class Driver3 {

	public static void main(String[] args) {
		
		Account acc1 = new Account(666,"yogt");
		System.out.println(acc1.getAccountNumber());
		
		System.out.println(acc1.getName());
		
		Account acc2 = new Account(777,"virat");
		System.out.println(acc1.getAccountNumber());
		
		System.out.println(acc1.getName());
		
	}

}

// output 
//666
//yogt
//666
//yogt

