package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ninth {
	public static void main(String[] args) {
		List<Fruits> fruits=Arrays.asList(
				new Fruits("Apple",10),
				new Fruits("Banana",13),
				new Fruits("Orang",16),
				new Fruits("Apple",39),
				new Fruits("Banana",50),
				new Fruits("Grapes",10),
				new Fruits("Pineapple",40));
		
		Map<String,Integer> fruitList =
		fruits.stream().collect(Collectors.groupingBy(x -> x.getName(),Collectors.summingInt(q-> q.getQuantity())));
		
		System.out.println(fruitList);
	}
}
