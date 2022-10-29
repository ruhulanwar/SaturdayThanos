/* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and address). */

package com.upskill.assignment_3;

public class ProblemTwo {
	static int count=1;
	ProblemTwo(String name,int age,int salary,String address){
		System.out.println("Employee Number: "+count);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Address: "+address);
		count++;
		System.out.println("");
	}

	public static void main(String[] args) {
		ProblemTwo[] obj=new ProblemTwo[5];
		obj[0]=new ProblemTwo("Shohid",37,190000,"Flushing");
		obj[1]=new ProblemTwo("Rasel",26,170000,"New Jersey");
		obj[2]=new ProblemTwo("Juel",33,100000,"Jamaica");
		obj[3]=new ProblemTwo("Jahangir",28,160000,"Jackson Heights");
		obj[4]=new ProblemTwo("Zain",5,150000,"Jamaica");
	}

}
