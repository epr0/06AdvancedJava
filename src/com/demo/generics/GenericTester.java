package com.demo.generics;

/*
 * There is a convention that the
	parametrized type name is a single uppercase letter .
	Also there is a convention specifying which letter should be used
	E, T element type
	K key type
	V value type
	T type
	N number type
	S, U, V if there are more parametrized types
 */

public class GenericTester {
	public static void main(String[] args) {
		Car car = new Car();
		GenericBox<Car> boxWithACarInside = new GenericBox<>(car);
		System.out.println();
	}

}

class GenericBox<T> {
	private T item;
	
	public GenericBox(T item) {
		this.item = item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
	
}

class Car {
	
}
