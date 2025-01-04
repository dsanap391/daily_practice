package com.ds.array;

//calculate the sum and average of array element

public class Fourth {
	public static void main(String[] args) {
		int[] arr= {3,4,5,7,9};
		int sum =0;
		double avg=0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		avg = sum/5;
		
		System.out.println("Sum :"+sum);
		System.out.println("Avg :"+avg);
	}
}
