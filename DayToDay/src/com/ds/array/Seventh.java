package com.ds.array;

import java.util.Arrays;

//remove the specific element from the array

public class Seventh {
	public static void main(String[] args) {
		int[] arr= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int remove = 6;
		
		System.out.println("Original Array :"+Arrays.toString(arr));
		
		for(int i=remove; i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		System.out.println("After removing element :"+Arrays.toString(arr));
	}
}
