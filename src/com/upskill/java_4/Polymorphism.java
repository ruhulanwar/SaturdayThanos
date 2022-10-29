package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType {

	/*Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP 
	 * occurs when a parent class reference is used to refer to a child class object.
	 * 1. method overloading (Compile time Polymorphism/Static Binding)
	 * 2. method overriding (Runtime Polymorphism/Dynamic binding)
	 */
	
	public static void main(String[] args) {
		
		car(2, 4, "Red");
	}
		
	public static void WeeklyIncomeVoid(){										//inheritance
		int calculateWeeklyIncome = hourlyIncome *40 + 1000;					//method overriding
		System.out.println("My Weekly Income ::: " + calculateWeeklyIncome);
	}
	
	
	
		public static void car(){
			System.out.println("My car is Audi! ");
		}

		public static void car(int door){
			door = 2;
			System.out.println();
		}

		public static void car(int door, int seat){
			door = 2;
			seat = 4;
			
			System.out.println("My car is Audi!, it has door: " + door + " , it has Seat: " + seat);
			
		}

		public static void car(String color){
			
			System.out.println("My car is Audi!, it has color: " + color);
		
		}

		
		public static void car(int door, int seat, String color){
			System.out.println("My car is Audi, it has door : " + door + " , it has Seat : "+seat + " , it has color : " + color);
	
		}
		
}

	