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
			System.out.println("<--- Exception is caught and handled. --->");
			//the rule of thumb for throwing exceptions is pretty simple.
			// you do so when your code has entered into an UNRECOVERABLE INVALID state.
			// if data is compromised or you cannot wind back the processing that occurred up to the point
			// then you must terminate it.
			//throw new ArithmeticException("Cannot divide by zero");
		}
		
		System.out.println("Moving further...");

	}

}
