package com.practice.string;

public class Driver1 {

	public static void main(String[] args) {
		String s1 = "java";//scp
		String s2 ="hellow";//scp
		String s3 = s2.intern();//obj ref to scp
		
		String s4 = new String("Ravi");// scp .. heap
		String s5 = s4.intern();
				
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s2==s3);//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s2.equals(s3));//true
		
		System.out.println(s4.equals(s5));//true
		System.out.println(s4==s5);//false
	}

}
