/* Problem4. Write a for loop upto 500 which will increase the value double every time.*/

package com.upskill.assignment_2;

public class ProblemFour {

	public static void main(String[] args) {
		
		myMethod();
	}
	public static void myMethod(){
		
			for (int i = 1; i <= 500; i = i * 2) {
				System.out.println("Double values:" + i);
			}
	}
}
