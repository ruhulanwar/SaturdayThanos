package com.upskill.java_2;

public class IfElseStatement {

	
	static int age = 180;
	
	public static void main(String[] args) {
			age();

	}

	public static void age(){								//method
		if (age < 13){
			System.out.println("You are a child");
		} else if (age >13 && age < 18){
			System.out.println("You are a teenager");
		} else if (age >= 60 ){
		
			//nested if else
			
			if(age>100){
				System.out.println("You are DEAD!!!");
			} else{
				System.out.println("You are a senior citizen");
			}
			
			
		} else {
			System.out.println("You are an adult");
		}
	}
	
}
