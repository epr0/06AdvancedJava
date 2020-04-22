package com.demo.exceptions;

public class ExceptionTester3 {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		try {
			int x = intArray[11] / 5;
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("Arithmethic exception caught.");
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Array Index Out of Bounds exception caught.");
		} catch (Exception e) {
			System.out.println("Another exception caught.");
		}
	}

}
