package com.ds.array;

//Java program to find largest number from given array

public class Second {
	public static void main(String[] args) {
		
		int[] arr = {1000, 2000, 4000};
		
		int large = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > large) {
				large = arr[i];
			}
		}
		
		System.out.println("largest element: "+large);
	}
}
