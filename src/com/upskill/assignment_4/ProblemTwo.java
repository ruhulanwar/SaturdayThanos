package com.upskill.assignment_4;

//	Write a method which will reverse a string 
public class ProblemTwo {	

	public static void main(String[] args) {
        reverseString("Rasel");
    }

    public static void reverseString(String input){

        // getBytes() method to convert string
        // into bytes[].
        byte [] strAsByteArray = input.getBytes();

        byte [] result =  new byte [strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)

            result[i] = strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
    }

}