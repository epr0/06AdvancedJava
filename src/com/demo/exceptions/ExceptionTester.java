package com.demo.exceptions;
/*
hen executing Java code, different errors can occur:
coding errors made by the programmer, errors due to wrong input,
 or other unforeseeable things.

When an error occurs, Java will normally stop and generate an
error message. The technical term for this is:
Java will throw an exception (throw an error).
 */
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
