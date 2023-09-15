package org.java8.exp.predicateexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployeePredicates {

	public static void main(String args[]){
		
		
		 Employe e1 = new Employe(1,23,"M","Rick","Beethovan");
		 Employe e2 = new Employe(2,13,"F","Martina","Hengis");
		 Employe e3 = new Employe(3,43,"M","Ricky","Martin");
	     Employe e4 = new Employe(4,26,"M","Jon","Lowman");
	     Employe e5 = new Employe(5,19,"F","Cristine","Maria");
	     Employe e6 = new Employe(6,15,"M","David","Feezor");
	     Employe e7 = new Employe(7,68,"F","Melissa","Roy");
	     Employe e8 = new Employe(8,79,"M","Alex","Gussin");
	     Employe e9 = new Employe(9,15,"F","Neetu","Singh");
	     Employe e10 = new Employe(10,45,"M","Naveen","Jain");
	        
	     List<Employe> employes = new ArrayList<Employe>();
	     employes.addAll(Arrays.asList(new Employe[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
	     
	     System.out.println(EmployeePredicates.filterEmployee(employes, EmployeePredicates.isAdultMale()));
	     
	     System.out.println(EmployeePredicates.filterEmployee(employes, EmployeePredicates.isAdultFemale()));
	     
	     System.out.println(EmployeePredicates.filterEmployee(employes, EmployeePredicates.isMoreThan(30)));
		
	}
	
}
