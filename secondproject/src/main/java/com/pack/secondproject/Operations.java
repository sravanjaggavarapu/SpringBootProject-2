package com.pack.secondproject;

public class Operations {

	int num1;
	int num2;

	public Operations(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void add() {
		System.out.println("Addition of Numbers : " + (num1 + num2));
	}

	public void mul() {
		System.out.println("Multiplication of Numbers : " + (num1 * num2));
	}
}
