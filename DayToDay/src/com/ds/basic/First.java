package com.ds.basic;

//find the fibonacci series of given number

public class First {
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		int num = 5;
		
		System.out.print(n1+" "+n2);
		for(int i=0;i<num;i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
