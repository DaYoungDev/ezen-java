package com.day16.fifteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Exam {

	public static void main(String[] args) {
		// list, set, map에 짝수 5개 저장
		// list
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				arr.add(i);
			}
		}
		
		// set
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				hSet.add(i);
			}
		}
		
		// map
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				hMap.put(i, i);
			}
		}
		
		// 기본방식으로 출력 - for, iterator
		System.out.println("\n======list for 출력 =======");
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println("\n======set for 출력 =======");
		for(Integer i : hSet) {
			System.out.print(i + " ");
		}
		System.out.println("\n======set iter 출력 =======");
		Iterator<Integer> iter = hSet.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println("\n======map iter 출력 =======");
		Iterator<Integer> iter2 = hMap.keySet().iterator();
		while(iter2.hasNext()) {
			System.out.print(hMap.get(iter2.next()) + " ");
		}
		
		// forEach() - 람다식 이용
		System.out.println("\n======forEach 출력 =======");
		System.out.println("\n======list 출력 =======");
		arr.forEach(n -> System.out.print(n + " "));
		System.out.println("\n======set 출력 =======");
		hSet.forEach(n -> System.out.print(n + " "));
		System.out.println("\n======map 출력 =======");
		hMap.forEach((k, v) -> System.out.print(v + " "));
	}

}
