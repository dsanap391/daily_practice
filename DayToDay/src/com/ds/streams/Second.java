package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Second {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5,1,4,6,7);
		List<Integer> multiNum = list.stream().map(num -> num*2).collect(Collectors.toList());

		
		System.out.println(multiNum);
	}
}
