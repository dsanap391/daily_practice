package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fourth {
	public static void main(String[] args) {
		
		List<List<String>> fruits = Arrays.asList(Arrays.asList("Apple","Banana","Mango"), Arrays.asList("Apple","Banana","Mango"), Arrays.asList("Apple","Banana","Mango"));
		List<String> listFruit = fruits.stream().flatMap(List::stream).filter(name -> name.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(listFruit);
		
	}
}
