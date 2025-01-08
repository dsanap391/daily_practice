package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Third {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("Devansh",2),
				new Employee("Aniket",20),
				new Employee("Rushikesh",24),
				new Employee("Shantanu",14),
				new Employee("Praniti",15),
				new Employee("Aradhya",8),
				new Employee("Minal",19)
			);
		
		List<String> nameList = empList.stream().map(name -> name.getName()).collect(Collectors.toList());
		
		System.out.println(nameList);
	}
}
