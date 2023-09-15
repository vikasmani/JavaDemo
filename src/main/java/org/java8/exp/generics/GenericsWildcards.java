package com.java8.exp.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {
	
	//upper bounded
	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	//lower bounded
	static void addIntegers(List<? super Integer> list){
		list.add(new Integer(50));
	}

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);
	}
}
