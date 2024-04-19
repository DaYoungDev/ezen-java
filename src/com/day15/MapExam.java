package com.day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MapExam {

	public static void main(String[] args) {
		// 영어사전 => map
		HashMap<String, String> english = new HashMap<String, String>();
		
		english.put("boy","소년");
		english.put("girl","소녀");
		english.put("school","학교");
		
		Iterator<String> iter = english.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = english.get(key);
			System.out.println(key + " => " + value);
		}
		
		// 알파벳 출력
		// ArrayList
		System.out.println("\n====ArrayList========");
		ArrayList<Character> cArrList = new ArrayList<Character>();
		for(int i = (int)'A'; i <= (int)'Z'; i++) {
			cArrList.add((char)i);
		}
		
		System.out.println("======for========");
		for(int i = 0; i < cArrList.size(); i++) {
			System.out.print(cArrList.get(i) + " ");
			
		}
		System.out.println("\n======확장 for========");
		for(Character c : cArrList) {
			System.out.print(c + " ");
			
		}
		
		// HashMap
		System.out.println("\n\n====HashMap========");
		HashMap<Integer,Character> cMap = new HashMap<Integer, Character>();
		for(int i = (int)'A'; i <= (int)'Z'; i++) {
			cMap.put(i, (char)i);
		}
		
		System.out.println("======Iterator========");
		Iterator<Integer> itr = cMap.keySet().iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.print(cMap.get(key) + " ");
		}
		
		System.out.println("\n======for========");
		for(int key : cMap.keySet()) {
			System.out.print(cMap.get(key) + " ");
		}
		
		
		// HashSet
		System.out.println("\n\n====HashSet========");
		HashSet<Character> cSet = new HashSet<Character>();
		for(int i = (int)'A'; i <= (int)'Z'; i++) {
			cSet.add((char)i);
		}
		
		System.out.println("======Iterator========");
		Iterator<Character> itt = cSet.iterator();
		while(itt.hasNext()) {
			System.out.print(itt.next() + " ");
		}
	}

}
