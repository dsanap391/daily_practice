package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eleventh {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,21,2,4,1,4,6,7,43,67,72,1,3,5,6,7,3);
		
		List<Integer> unique =list.stream().distinct().sorted((a,b) -> b-a).collect(Collectors.toList());
		
		System.out.println(unique);
	}
}
