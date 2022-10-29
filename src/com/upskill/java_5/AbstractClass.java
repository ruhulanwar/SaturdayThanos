package com.upskill.java_5;

public abstract class AbstractClass {

		// Interface can have only abstract methods, java 8 and forward they have static method too
		// Abstract method does not have any implementation
		
		public abstract void iDoor();
		
		public abstract void iSeat();
		
		public abstract void iWheel();
		
		public abstract void iRadio();

		//non-abstract or regular method
		
		public void brand(){
			String brand = "Audi";
		}
		
		public void color(){
			String color = "Black";
		}
		
		public void engine(){
			int motor = 2;
		}

}
