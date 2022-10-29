/* Problem 04: A function returns 30, another function returns 50. 
Write a java program which will display subtraction value from bigger number to smaller.*/

package com.upskill.assignment_1;

public class ProblemFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod4(); 
		myMethod41();
		int a=myMethod4();
		int b=myMethod41();
		System.out.println(b-a);	
	}
	public static int myMethod4(){
		return 30;
	}
	public static int myMethod41(){
		return 50;
	}
}
