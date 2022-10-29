/*Problem 02: A rectangle width and length are: 9 and 13 inches.
Write a method to display the perimeter of rectangle in console output. */

package com.upskill.assignment_1;

public class ProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProblemTwo myObject = new ProblemTwo ();
		myObject.myMethod2();
	}
	public void myMethod2() {
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
	System.out.println("The perimeter of the rectangle with arm 9 and 13 is "+c);
		
	}
}
