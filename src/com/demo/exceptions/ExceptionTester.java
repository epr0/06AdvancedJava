package com.demo.exceptions;

public class ExceptionTester {
	
	public static void main(String[] args) {
		System.out.println("Program started...");
		try {
			System.out.println("Doing some calculations...");
			int x = 5/0;
		} catch (Exception e) {
			System.out.println("<Exception is caught and handled.>");
		}
		
		System.out.println("Moving further...");

	}

}
