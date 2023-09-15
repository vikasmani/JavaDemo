package com.java8.exp.generics;

public class GenericsType<T> {
	
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		
		GenericsType<String> type = new GenericsType<String>();
		type.set("Hello");
		
		@SuppressWarnings("rawtypes")
		GenericsType type1 = new GenericsType();
		type1.set("Hello");
		type1.set(10);
	}
	
}
