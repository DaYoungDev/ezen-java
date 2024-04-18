package com.day14.thirteen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExam {

	public static void main(String[] args) {
		
		System.out.println("=======ArrayList 이용 ======");
		ArrayList<Double> list = new ArrayList<Double>(4);
		for(int i = 1; i <= 4; i++) {
			list.add(i + 0.5);
		}
		for(double d : list) {
			System.out.println(d);
		}

		System.out.println("\n=====배열 이용=========");
		double[] dArr = new double[4];
		for(int i = 0; i < dArr.length; i++) {
			dArr[i] = i + 1 + 0.5;
		}
		for(double d2 : dArr) {
			System.out.println(d2);
		}
		
		System.out.println("\n====HashSet iterator<> 이용====");
		HashSet<Double> hSet = new HashSet<Double>(4);
		for(int i = 0 ; i < 4; i++) {
			hSet.add(i + 1 + 0.5);
		}
		Iterator<Double> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
