package com.upskill.java_5;

public class Encapsulation {

	private String name = "Dipu";					// write and read access			write is setter and read is getter method
	private int ssn = 451236457;					// write access but not to see it	
	private String username = "dipu123";			// read access but not to change it
	
	
	//setter method									// set the data- write always VOID
	public void setName(String value){
		name = value;
	}
	
	//getter method									// get the data- read
	public String getName(){
		return name;
	}

	//setter method
	public void setSSN(int value){					// setter method- SSN
		ssn = value;
	}
	
	//getter method
	public String getUserName(){					// getter method- User Name
		return username;
	}
		
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Dipu1");
		System.out.println(obj.getName()); 
				
		obj.setSSN(1111111111);

		System.out.println(obj.getUserName());
	}

}
