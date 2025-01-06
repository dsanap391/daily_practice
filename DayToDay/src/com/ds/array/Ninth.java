package com.ds.array;

//Reverse an array elements 

public class Ninth {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int start =0;
		int end = arr.length-1;
		
		System.out.println("Original Array");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("\n\nReverse Array");
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
}
