package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_HashTable {

	public static void main(String[] args) {
		
		//array stores multiple data using index
		
		
		int age = 30;													//variable
		int[] ageThanos = new int[]{30, 35, 27, 22, 40, 32};			//array
				//array index		[0] [1] [2] [3] [4] [5] 

		System.out.println(ageThanos[0]);
		System.out.println(ageThanos.length); 							// how many input we have in this index/total members	
	
	
		String[] nameThanos = new String[]{"Ava", "Rupa", "Saima", "Sami", "Fahim"};
		
		System.out.println(nameThanos[1]);
		System.out.println(nameThanos.length);

		int[][] ageThanos2D	= {{30, 35, 27, 22, 40, 32},
								{30, 35, 27, 22, 40, 32}};				//Multi-dimensional array
		
			//indexing 	[0][0]   [0][1]   [0][2]   [0][3]   [0][4]   [0][5]
			//			[1][0]   [1][1]   [1][2]   [1][3]   [1][4]   [1][5]
		
		System.out.println(ageThanos2D[1][1]);
		
		// HashMap stores multiple data using key-value pair, Implementation of Map Interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Ava", 23);
		Student.put("Fahim", 35);
		Student.put("Pranto", 24);
		
		System.out.println(Student.get("Ava"));
		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put("Bangladesh", "Sylhet");
		Capital.put("UK", "London");
		Capital.put("USA", "NYC");
		
		System.out.println(Capital.get("USA"));
		
		//HashSet stores unordered collection containing unique value, IMplementation of set iny=terface
		
		HashSet<String> car = new HashSet<String>();		//add
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println(car);
		
		
		HashSet<Integer> age2 = new HashSet<Integer>();		//add
		age2.add(20);
		age2.add(21);
		age2.add(22);
		
		System.out.println(age2);
		
		
		//HashTable stores multiple data using key-value pair, but is synchronized (only one thread can be modified)
		
				Hashtable<String, String> Region = new Hashtable<String, String>();		//add
				Region.put("BD", "Asia");
				Region.put("USA", "North America");
				Region.put("UK", "Europe");
				
				
				System.out.println(Region.get("BD"));
		
		
		
		}
		
		
	}

	

