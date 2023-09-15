 package com.java8.exp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String args[]){
		
		HashMap<String, Integer> map = new HashMap<String, Integer> ();
		
		map.put("B",2);
		map.put("A", 3);
		map.put("Z", 6);
		map.put("G", 8);
		map.put("R", 1);
		
		//1. Map Entries
		Consumer<Map.Entry<String, Integer>> action = entry ->{
			System.out.print("key : "+entry.getKey());
			System.out.print("   ");
			System.out.println("value : "+entry.getValue());
		};
		map.entrySet().forEach(action);
		System.out.println("--------------------");

		//2. Map Keys
		Consumer<String> actionOnKeys = System.out::println;
		map.keySet().forEach(actionOnKeys);
		System.out.println("--------keyset------------");

		//3. Map Values
		Consumer<Integer> actionOnValues = System.out::println;
		map.values().forEach(actionOnValues);
		System.out.println("--------values------------");
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		
		System.out.println("Sorted Map :----"+sortedMap);
		
		
	}

}
