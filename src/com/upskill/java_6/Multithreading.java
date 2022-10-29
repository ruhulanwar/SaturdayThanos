package com.upskill.java_6;

public class Multithreading {

	//Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	//threads can be created by suing two mechanism:
	//1. Extending the Thread class
	//2. Implementing the runnable interface
	
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++){
			MultithreadingDemo multithreadingDemoObj = new MultithreadingDemo();
			multithreadingDemoObj.start();
			
			Thread multithreadingDemo2Obj = new Thread (new MultithreadingDemo2());
			multithreadingDemo2Obj.start();
			
		}

	}

}

class MultithreadingDemo extends Thread {
	public void run(){
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class MultithreadingDemo2 implements Runnable {
	public void run(){
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
