package com.ds.array;


//find the location of given array element

public class Sixth {

	public static boolean contains(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		int[] arr= {5,6,2,6,8,3,8};
		
		boolean result = contains(arr, 9);
		if(result == true) {
			System.out.println("Number is present");
		}else {
			System.out.println("Number is not present");
		}
	}
}
