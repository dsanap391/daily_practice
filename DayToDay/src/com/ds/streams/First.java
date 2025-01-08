package com.ds.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filter names with length greater than 3

public class First {
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
				
		List<Employee> nameList =	empList.stream().filter(name -> name.getName().length() > 5).collect(Collectors.toList());
		
		System.out.println("Names "+ nameList);
		
		List<Employee> ageList = empList.stream().filter(age -> age.getAge() > 10).collect(Collectors.toList());
		
		System.out.println("Age "+ageList);
	}
}
