package com.upskill.java_5;

public class ChildOfAbstractClass extends AbstractClass {

	@Override
	public void iDoor() {
		int door = 4;
		System.out.println(door);
	}

	@Override
	public void iSeat() {
		int seat = 4;
		System.out.println(seat);

	}

	@Override
	public void iWheel() {
		int wheel = 4;
		System.out.println(wheel);
	}

	@Override
	public void iRadio() {
		int radio = 1;
		System.out.println(radio);
		
	}
	
	public static void main(String[] args) {
		
		ChildOfAbstractClass obj = new ChildOfAbstractClass();
		obj.iDoor();
		obj.iSeat();
		obj.iWheel();
		obj.iRadio();
	}
}
