package com.ds.strings;

//how to swap two numbers without using third variable

public class Second {
	public static void main(String[] args) {
		int a=4,b=5;
		
		System.out.println("Before Swapping");
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		
		a = a - b;  //  4 - 5 = -1
		
		b = a + b;  //  -1 + 5 = 4
		
		a = b - a;  //  4 - 1 = 3 
		
		System.out.println("After Swapping");
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		
	}
}
