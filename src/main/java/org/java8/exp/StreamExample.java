package org.java8.exp;

import org.java8.exp.Employee;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String args[]){
		
		//ways to create stream
		//1. stream.of(val1,value2,.....);
		//Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		
		//2.Stream.of(array of elements)
		//Stream<String> stream = Stream.of(new String[]{"1","2","3","4","5","6" } );
		Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9,10} );
		
		List<String> countryList = new ArrayList<String>();
		countryList.add("NY");
		countryList.add("SA");
		countryList.add("NYZ");
		countryList.add("IND");

		List<String> cityList = Arrays.asList("New Delhi","Noida","Bangalore","Pune","Mumbai");
System.out.println("=============");
		//List<String> collect3 = cityList.stream().map(String::toUpperCase).collect(Collectors.toList());
		//System.out.println(collect3);

		Long collect3 = cityList.stream()
								.filter(x -> x.length() > 5)
								.map(x->x.length())
								.count();
		System.out.println("============="+collect3);
		//cityList.stream().forEach(System.out::println);

		//3. list.stream()
		//Stream<String> stream = countryList.stream();
		//stream.forEach(p -> System.out.println("Value :--"+p));
		
		//4. Stream.generate() or Stream.iterate()
		// generate -> return an infinite sequential unordered stream. 
		Stream<Date> dateStream = Stream.generate(() -> {return new Date();});
		//dateStream.forEach(System.out::println);
		
		Predicate<String> condition = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				
				if(t.equals("IND")){
					return true;
				}
				return false;
			}
		};
		
		Predicate<Integer> condition1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t%2==0){
					return true;
				}
				return false;
			}
		};
		
	
		
		//List<String> countryAsList = stream.map(String::toLowerCase).collect(Collectors.toList());
		//System.out.println("*** :--"+countryAsList);
		///stream.filter((s) -> s.startsWith("I")).map(String::toLowerCase).forEach(System.out::println);
		//stream.filter(condition).forEach(System.out::println);
		//stream.filter(n -> n.equals("SA")).forEach(System.out::println);
		
		List<Integer> evenNumbers = stream.filter(condition1).map(n->n*n).collect(Collectors.toList());
		//System.out.println("Even numbers :--"+evenNumbers);



		//ways to create a stream
		//1. Stream.of(val1, val2,....);
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		stream1.filter(i-> i/2==0).forEach(System.out::println);

		Stream<String> streamOfStrings = Stream.of("String1","String2","String3","String4");
		//2. Stream.of(array elements);
		Stream<Integer> intergerStream = Stream.of(new Integer[]{1,2,3,44,34,45,66});
		intergerStream.forEach(System.out::println);

		//3. list.stream();
		List<String> stringList = Arrays.asList("String1","String2","String3","String4");
		stringList.stream().forEach(System.out::println);

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(01,"Name01", "JobTitle001", 10000, null));
		empList.add(new Employee(1, "Name1", "JobTitle1",10000, null));
		empList.add(new Employee(2, "Name2", "JobTitle2", 11000, null));
		empList.add(new Employee(3, "Name3", "JobTitle3", 12000, null));
		empList.add(new Employee(4, "Name4", "JobTitle4", 14000, null));

		empList.stream().filter(e->e.getName().equals("Name2")).forEach(System.out::println);

		List<String> collect4 = empList.stream().filter(e -> e.getSalary() > 10000).map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(">>>>>>>>>>>>>>>>> "+collect4);
		String collect = empList.stream().map(x -> x.getName()).collect(Collectors.joining(", "));
		System.out.println(collect);


		List<Integer> integerList = Arrays.asList(1,2,6,5,6,8,6,9,8,7,5,3,5,8,9);
		List<Integer> collect1 = integerList.stream().map(x -> x * x).distinct().collect(Collectors.toList());
		System.out.println("squre of the distinct elements from list :"+ collect1);
		List<Integer> collect2 = integerList.stream().sorted().collect(Collectors.toList());
		System.out.println("list in reverse order:"+ collect2);


		String exampleString = "This is just a sample string";

		long totalCharacters = exampleString.chars().filter(ch -> ch != ' ').count();

		System.out.println("There are total " + totalCharacters + " characters in exampleString");

		List<String> list = Arrays.asList("3", "6", "8",
				"14", "15");

		// Using Stream mapToInt(ToIntFunction mapper)
		// and displaying the corresponding IntStream
		list.stream().mapToInt(num -> Integer.parseInt(num))
				.filter(num -> num % 3 == 0)
				.forEach(System.out::println);

	}

 }
