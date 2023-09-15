package org.java8.exp.predicateexample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	
	public static Predicate<Employe> isAdultMale(){

		return p -> p.getAge()>21 && p.getGender().equalsIgnoreCase("M");
	}
	
	public static Predicate<Employe> isAdultFemale(){
		return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	}
	
	public static Predicate<Employe> isMoreThan(Integer age){
		return p -> p.getAge() > age;
	}
	
	public static List<Employe> filterEmployee(List<Employe> employes, Predicate<Employe> predicate){
		return employes.stream()
						.filter(predicate)
						.collect(Collectors.toList());
	}
}
