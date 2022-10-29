package com.upskill.java_5;

public interface Interface {
	// Interface can have only abstract methods, java 8 and forward they have static method too
	// Abstract method does not have any implementation
	
	public abstract void iDoor();
	
	public abstract void iSeat();
	
	public abstract void iWheel();
	
	public abstract void iRadio();

	
	
}

/*		(Parent)				(Keywords)				(Child)
 * 		Class					extends			to		Class
 * 		Abstract Class 			extends 		to		Class
 * 		Interface				implements 		to		Class
 * 		Interface				extends			to 		Interface			implements 			Class
 */
