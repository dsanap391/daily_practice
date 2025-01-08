package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eight {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,6,2,3,42,52,6,7);
		
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctList);
	}
}
