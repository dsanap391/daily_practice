package com.ds.array;

import java.util.Scanner;

//Check if a value is present in an Array in Java

public class First {

	public static void main(String[] args) {
		int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean present = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				present = true;
			}
		}
		
		System.out.println("Is "+num+" present in the array: "+present);
	}
}
