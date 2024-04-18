package com.day14.thirteen;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>(3);
		list.add(3.14);
		list.add(5.87);
		list.add(2.476);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n====== 확장 for ======");
		for(double d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n====== String ======");
		ArrayList<String> list2 = new ArrayList<String>();
		
		for(int i = 1; i <= 5; i++) {
			list2.add(i + " : Hello Java");
		}
		
		for(String s : list2) {
			System.out.println(s);
		}
	}

}
