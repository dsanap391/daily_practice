package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seventh {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5,6,6,2,3,42,52,6,7);
		
		//skip first three number 
		
		List<Integer> ascList = list.stream().skip(3).collect(Collectors.toList());
		System.out.println("Skipping first three number "+ascList);
		
		//filter even number and skip first 2 number
		
		List<Integer> evenList = list.stream().filter(n -> n%2 ==0).skip(2).collect(Collectors.toList());
		System.out.println("\nEven number list skiping first 2 number : "+evenList);
	}
}
