package com.demo.setget;

public class SimpleGetterAndSetter {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number > 10) {
			throw new IllegalArgumentException();
		} else {
			this.number = number;
		}
		
	}
}
