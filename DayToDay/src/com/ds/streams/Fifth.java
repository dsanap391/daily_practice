package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fifth {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,6,2,3,42,52,6,7);
		
		//Ascending order
		List<Integer> ascList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order: "+ascList);

		//Descending order
		List<Integer> descList = list.stream().sorted((a,b) -> (b - a)).collect(Collectors.toList());
		
		System.out.println("\nDescending order "+descList);
	}
}
