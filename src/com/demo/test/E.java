package com.demo.test;

public class E {
	static int i = 1;

	void didintiI() {
		i++;
	}

	int nuskaitytiI() {
		return i;
	}

	public static void main(String[] args) {
		E e1 = new E();
		E e2 = new E();
		e1.didintiI();
		e2.didintiI();
		System.out.println(e1.nuskaitytiI());
		//another comment
		//added comment

	}
}