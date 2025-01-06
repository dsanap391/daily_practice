package com.ds.array;

public class Eighth {

	public static void main(String[] args) {
		int arr[]= {3,4,5,1,6,8,5,8,9};
		int target=2;
		boolean contains =false;
		
		for(int num : arr) {
			if(num == target) {
				contains = true;
			}
		}
		
		if(contains) {
			System.out.println("The given number "+target+ " is present in the array");
		}else {
			System.out.println("The given number "+target+ " is not present in the array");
		}
	}
}
