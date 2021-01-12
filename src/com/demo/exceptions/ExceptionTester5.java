package com.demo.exceptions;

public class ExceptionTester5 {
	public static void main(String[] args) {
		
		int arrayToTest[] = {3,5,2};
		try {
			printArrayElement(arrayToTest, 5);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Sita vieta vykdoma visada!");
		}
	}
	
	private static void printArrayElement(int[] array, int index) throws CustomException {
		if(index >= array.length) {
			throw new CustomException("Per didelis indexas");
		}
		System.out.println(array[index]);
	}
}
