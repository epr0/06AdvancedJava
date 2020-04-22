package com.demo.Vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(6);
		vector.add(5);

		//Increases capacity by double. For example 10,20,30
		System.out.println(vector.capacity());
		
		for(int i : vector) {
			System.out.println(vector);
		}
	}
}
