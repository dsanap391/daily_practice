package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filter names with length greater than 3

public class First {
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
				
		List<Employee> nameList =	empList.stream().filter(name -> name.getName().length() > 5).collect(Collectors.toList());
		
		System.out.println("Names "+ nameList);
		
		List<Employee> ageList = empList.stream().filter(age -> age.getAge() > 10).collect(Collectors.toList());
		
		System.out.println("Age "+ageList);
	}
}
