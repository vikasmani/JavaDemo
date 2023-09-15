package org.java8.exp.core.collection.list;

import org.java8.exp.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ComparatorExample {
	
	public static void main(String agrs[]) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1010, "Rajeev", "JobTitle001", 100000.00, LocalDate.of(2010, 7, 10)));
		empList.add(new Employee(1004, "Chris",  "JobTitle001",95000.50, LocalDate.of(2017, 3, 19)));
		empList.add(new Employee(1015, "David",  "JobTitle001",134000.00, LocalDate.of(2017, 9, 28)));
		empList.add(new Employee(1009, "Steve",  "JobTitle001",100000.00, LocalDate.of(2016, 5, 18)));
		
		System.out.println("empList :--"+empList);
		
		Collections.sort(empList, Comparator.comparing(Employee::getName).thenComparing(Employee::getId));
		 System.out.println("\nEmployees (Sorted by Name) : " + empList);
		 
		 Collections.sort(empList, Comparator.comparingDouble(Employee::getSalary));
		 //System.out.println("\nEmployees (Sorted by Salary) : " + empList);
		 
		 Collections.sort(empList, Comparator.comparing(Employee::getId));
		 //System.out.println("\nEmployees (Sorted by Id) : " + empList);
		
	}

}
