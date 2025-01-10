package com.ds.basic;

public class Third {

	public static void main(String[] args) {
		
		String str = "Devansh";
		
		if(isPalindrome(str)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Palindrome String");
		}
	}
	
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		return true;
	}
}
