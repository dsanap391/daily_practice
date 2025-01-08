package com.ds.array;

//find the given number in array

public class Tenth {
	public static void main(String[] args) {
		 int arr[] ={1,2,3,4,5,6,7,8,9};
	        int target = 9;
	        for(int i=0;i<arr.length;i++){
	            if(target == arr[i]){
	                System.out.println(target+" is found "+i+"th location");
	                break;
	            }
	            else if(target != arr[i]) {
	            	System.out.println("Given number is not found");
	            	break;
	            }
	        }	
	}
}
