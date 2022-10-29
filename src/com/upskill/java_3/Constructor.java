package com.upskill.java_3;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String a;
	int b;
	String c;
	
	public Constructor(String name, int age){
		a = name;
		b = age;
	}
	
	public Constructor(String name, int age, String city){
		a = name;
		b = age;
		c = city;
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor("Fahim", 30);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		Constructor obj2 = new Constructor("Fahim", 30, "nyc");
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
	}

}
