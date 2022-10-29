package com.upskill.java_3;

import com.upskill.java_2.MethodType;

public class Inheritance extends MethodType {
	
	/*
	 * The process of obtaining the data members and methods from one class to another class is known as inheritance
	 * single inheritance
	 * multiple inheritance (Java supports through Interface)
	 * multilevel inheritance
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance obj = new Inheritance();
		obj.annualIncomeVoid();					//calling from parent class MethodType
		obj.WeeklyIncomeVoid();				
	}

}
