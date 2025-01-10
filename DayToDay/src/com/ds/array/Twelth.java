package com.ds.array;

public class Twelth {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,1,3,4,6,7,45,9,6};
		int[] arr2= {1,2,3,4,1,3,4,6,12,44,23,54};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] ==arr2[j]) {
					int common = arr1[i];
					System.out.print(" "+common);
					break;
				}
			}
		}
	}
}
