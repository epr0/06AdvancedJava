package com.demo.exceptions;

public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String s) {
		super("Custom WILD exception appeared!! Nice. Error message - " + s);
	}
}
