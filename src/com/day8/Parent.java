package com.day8;

public class Parent {
	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
	public void showInfo() {
		System.out.println("private int1 = " + num1);
		System.out.println("default int2 = " + num2);
		System.out.println("protected int3 = " + num3);
		System.out.println("public int4 = " + num4 + "\n");
	}
}
