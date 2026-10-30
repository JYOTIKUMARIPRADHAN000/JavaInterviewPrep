package com.practice.string;

public class Driver2 {
	public static void main(String[] args) {
		
		String str1="Java";//scp
		String str2=new String("Java");//copy at scp ... real at heap
		
		String str3=str2.intern();// point to scp 
		String str4="Java";//scp .. same obj ref of str1
		
		String str5=new String("Javascript").intern();// at scp javascript.. real heap ... intern .. final scp
		
		System.out.println(str1==str2);//false
		System.out.println(str3==str4);//true
		System.out.println(str5=="Javascript");//true
		
		
	}
}

