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
	
	private static void printArrayElement(int[] array, int index) throws Exception {
		if(index < 0 || index >= array.length) {
			throw new Exception("Incorrect argument");
		}
		System.out.println(array[index]);
	}
}


