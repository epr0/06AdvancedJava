package com.demo.exceptions;

public class ExceptionTester4 {
	public static void main(String[] args) {
		
		int arrayToTest[] = {3,5,2};
		try {
			printArrayElement(arrayToTest, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	The Java throws keyword is used to declare an exception.
	It gives an information to the programmer that there may occur an exception
	so it is better for the programmer to provide the exception handling
	code so that normal flow can be maintained. Exception Handling is
	mainly used to handle the checked exceptions.
	 */
	private static void printArrayElement(int[] array, int index) throws Exception {
		if(index < 0 || index >= array.length) {
			throw new Exception("Incorrect argument");
		}
		System.out.println(array[index]);
	}
}


