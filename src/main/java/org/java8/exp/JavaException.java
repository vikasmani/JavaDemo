package com.java8.exp;

class JavaException {
	 public static void main(String args[]) {
		 
	String str = null;
	  try {
		 
	   int d = 0;
	   int n = 20;
	   int fraction = n / d;
	   
	   int g[] = {
	    1
	   };
	   g[20] = 100;
	  }
	 /* catch(Exception e){
	  	System.out.println("In the catch clock due to Exception = "+e);
	  }*/
	  catch (ArithmeticException e) {
		  	System.out.println("In the catch clock due to Exception = " + e);
	  } catch (ArrayIndexOutOfBoundsException e) {
		  	System.out.println("In the catch clock due to Exception = " + e);
	  }finally{
			System.out.println("Inside the finally block");
	  }
	  System.out.println("End Of Main");
	 }
	
	/*public static void main(String[] args) {
        String str1 = null;
        String str2 = "";

        if(isNullOrEmpty(str1))
            System.out.println("First string is null or empty.");
        else
            System.out.println("First string is not null or empty.");

        if(isNullOrEmpty(str2))
            System.out.println("Second string is null or empty.");
        else
            System.out.println("Second string is not null or empty.");
    }

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }*/
	}