package com.ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Thirteen {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,1,3,4,6,7,45,9,6);
		
		System.out.println("Before removing duplicate :"+list);
		Set<Integer> unique = new HashSet<>();

		unique.addAll(list);
		System.out.println("Unique number :"+unique);
	}
}
