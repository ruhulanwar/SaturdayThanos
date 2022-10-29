package com.upskill.java_6;

public class Exception_TryCatchFinally {
	
	/* Java Exceptions - Use "try - catch - finally"
	 * 
		A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
			 1. ArithmeticException - error has occurred in an arithmetic operation.
			 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
			 3. ClassNotFoundException - try to access a class whose definition is not found
			 4. FileNotFoundException - a file is not accessible or does not open.
			 5. IOException - input-output operation failed or interrupted
			 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
			 7. NoSuchFieldException - class does not contain the field or variable specified
			 8. NoSuchMethodException - accessing a method which is not found
			 9. NullPointerException - referring to the members of a null object
			 10. NumberFormatException  -  a method could not convert a string into a numeric format
			 11. RuntimeException - any exception which occurs during runtime.
			 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the 
			 size of the string
		
		B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
	*/

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException

			try {
				int[] ageGroup = new int[]{23, 25, 35, 30, 22};
				System.out.println("Student Age =" + ageGroup[8]); //its an index that does not exist
			} catch (Exception e){
				System.out.println("Array Index is not available!");
				e.printStackTrace();
			}
			System.out.println("Hi!");
	
			// Specific buil in exception Number Format Exception
			try{
				int num = Integer.parseInt("Test");
				System.out.println(num);
			}catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
				e.printStackTrace();
			}
			// User Defined Exceptions
			try{
				throw new MyException("Test");
			}catch(MyException e){
				System.out.println("User Defined Exceptions");
				e.printStackTrace();
			}
			
			finally{
				System.out.println("Test Execution Completed");
			}
	}

}
