package com.ds.array;

//find the duplicate elements from given array.

public class Eleventh {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,1,3,4,6,7,45,9,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
