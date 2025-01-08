package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eight {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Aniket","Aradhya","Aniket","Sumit","Devansh","Devansh");
		
		List<String> distinctList = list.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctList);
	}
}
