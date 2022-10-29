package com.upskill.java;

public class Variables {
	
	String country = "USA";									//global
	
	static String name = "Dipu";							// static to class only
	
	// variables in java
	// Instance or global variables - variables declared in Class level, outside method
	// Static variables - variables belong to class and don't require creating object
	// Local variables - variables declared in method
	// Method parameter - variables used as method parameter

	public static void main(String[] args) {
		
		String city = "NYC";								//local
		myMethod2("Erie");
	}

	public static void myMethod(){
		
		
		
		String city = "Long Island";						//local
	}
	
	public static void myMethod2 ( String county ){			//method parameter
		String city = "Buffalo";							//local
		
		System.out.println( "Method Parameter: " + county);
		System.out.println();
		
		
	}

}

