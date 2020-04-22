package com.demo.test;

import java.awt.Color;

public class Main {
	
	public static void main(String[] args) {
		
		String registrationNumber = "123";
		String description = "desct";
		
		if (null != registrationNumber) {
			description = description.concat(" Reg. Nr. ".concat(registrationNumber));
		} 
		
		System.out.print(description);
	
	}

}
