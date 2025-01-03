package com.ds.array;

import java.util.Arrays;

//Sorting an array element

public class Third {

	public static void main(String[] args) {
		int[] num= {40, 10, 50, 30, 20};
		
		//original array
		System.out.println("Original Array");
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("\nSorted Array");
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
	}
}
