package com.upskill.java_3;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Types of Loops
		For Loop
		While Loop
		Do While Loop
		Infinite Loop
		*/
		
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();
	}

	public static void practiceForLoop(){									//for loop - upto upper limit - known how many times
		int i;																//initialize the variable
		for(i = 1; i<=100; i++){											//setting lower limit, upper limit, increment or decrement
			System.out.println("For Loops Number= " + i);					//statement
		}
	}
	
	public static void practiceWhileLoop(){									//while loop - loops until condition is met
		int i =1;															//variable
		while (i <=100){													// setting condition
			System.out.println("While Loops Number= " + i);					// statement
			i++;															//increment or decrement
		}
	}
	
	public static void practiceDoWhileLoop(){								//Do while loop - loops at least one
		int i =1;															//variable
		do {
			System.out.println("Do While Loops Number= " + i);				// statement
			i++;															//increment or decrement
		} while (i <=0);													// setting condition		
		
		}
	
	public static void practiceInfiniteLoop(){								//infinite loop - never ending
		int i;																//initialize the variable
		for(i = 1; ;i++){													//setting lower limit, upper limit, increment or decrement
			System.out.println("Infinite Loops Number= " + i);				//statement
						
		}
	}
	
	public static void practiceNestedForLoop(){								//nested loop
		int i;																//initialize the variable
		int j;																//variable j
		for(i = 1; i<=10; i++){											//loop for i - setting lower limit, upper limit, increment or decrement
			for (j = 1; j<=10; j++){										//loop for j
				int multiplicationTable = i* j;								//statement for second loop
				System.out.print(multiplicationTable + " ");
				}
			System.out.println("");											//statement for first loop
		}
	
	}
}
