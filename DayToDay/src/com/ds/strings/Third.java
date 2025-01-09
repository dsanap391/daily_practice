package com.ds.strings;

// Return the count of vowels in given string

public class Third {
	public static void main(String[] args) {

		String str = "Wel come to the world of java program";
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count ++;
			}
		}
		
		System.out.println("Count of vowels :"+count);
	}
}
