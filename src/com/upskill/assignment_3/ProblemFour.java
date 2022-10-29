/* Problem 4.	Write a java program that explains runtime polymorphism. */

package com.upskill.assignment_3;

public class ProblemFour {

	public static void main(String[] args) {
	
		ProblemFour v1=new ProblemFour();
		v1.wheels();
		System.out.println("Run-Time PolyMorphism ->");
		ProblemFour v2=new Truck();
		v2.wheels();
		ProblemFour v3=new Car();
		v3.wheels();
		ProblemFour v4=new Bike();
		v4.wheels();
		ProblemFour v5=new BiCycle(); //BiCycle doesn't have wheel class so its upper class method is invoked!
		v5.wheels();
	}
	
	void wheels(){
		System.out.println("Every Vehicle have some wheels!");
	}
}

class Truck extends ProblemFour{
	void wheels(){
		System.out.println("Trucks have 6 wheels!");
	}
}

class Car extends ProblemFour{
	void wheels(){
		System.out.println("Cars have 4 wheels!");
	}
}

class Bike extends ProblemFour{
	void wheels(){
		System.out.println("Bikes have 2 wheels!");
	}
}

class BiCycle extends Bike{
	
}
