package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//grouping employee name by age

public class Tenth {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
					new Employee(12, "Aniket"),
					new Employee(13, "Devansh"),
					new Employee(12, "Aradhya"),
					new Employee(14, "Minal"),
					new Employee(13, "Rushikesh"),
					new Employee(11, "Shantanu"),
					new Employee(15, "Praniti"),
					new Employee(14, "Soham"),
					new Employee(16, "Vaishnavi"),
					new Employee(17, "Prem"),
					new Employee(11, "Krushna")
				);
		
		Map<Integer, List<Employee>> list = empList.stream().collect(Collectors.groupingBy(e -> e.getAge()));
		
		System.out.println(list);
		
		Map<String, Integer> map =empList.stream().collect(Collectors.toMap(e -> e.getName(), e -> e.getAge()));
		
		System.out.println(map);
	}
}
