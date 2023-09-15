package com.java8.exp.core;


//Static or early and Dynamic or late Binding
public class Binding {
	
	public static class Super{
		
		Super(){
			System.out.println("Inside Super");
		}
		
		/*
		 * void print() { System.out.println("Print in super."); }
		 */
	}
	public static class child extends Super {
		
		child(){
			System.out.println("Inside child");
		}
		
		/*
		 * void print() { System.out.println("Print in child."); } void print(int i) {
		 * System.out.println("Print in child." + i); }
		 */
	}
	
	public static class child1 extends child  {
		
		child1(){
			System.out.println("Inside child1");
		}
		
		/*
		 * void print() { System.out.println("Print in child."); } void print(int i) {
		 * System.out.println("Print in child." + i); }
		 */
	}
	
	public static class child2 extends child1{
		
	}
	
	/*
	 * static void util(Super superr) { superr.print(); }
	 */
	
	static void overloadedMethod(Super a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(child b)
    {
        System.out.println("TWO");
    }
     
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
	
	public static void main(String args[]) {
		
		child1 c = new child1();
	    overloadedMethod(c);
		
		/*
		 * Super ss = new Super(); Super ss1 = new child(); child ss2 = new child();
		 */
		
		//ss.print();
		//ss1.print();
		//ss2.print();
		//ss2.print(10);
		//util(ss);
		//util(ss1);
		//util(ss2);
	}

}

/* Static
 * Since the print method of superclass is static, compiler knows that it will
 * not be overridden in subclasses and hence compiler knows during compile time
 * which print method to call and hence no ambiguity.
 */

/* Dynamic
 * During compilation, the compiler has no idea as to which print has to be
 * called since compiler goes only by referencing variable not by type of object
 * and therefore the binding would be delayed to runtime and therefore the
 * corresponding version of print will be called based on type on object.
 * 
 */

//Static binding uses Type information for binding while Dynamic binding uses Objects to resolve binding.