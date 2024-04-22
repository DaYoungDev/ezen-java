package com.day16.fifteen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComparator implements Comparator<String>{
	public int compare(String str1, String str2) {
		return str1.length() - str2.length();
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		//TreeSet<String>(Comparator<? super String> comparator)
		//TreeSet<String> tset = new TreeSet<String>(new StrLenComparator());
		// => 람다식으로 대체할 것
		// 1. 익명클래스로 만들기
		TreeSet<String> tset = new TreeSet<String>(new Comparator<String>() {
			public int compare(String str1, String str2) {
				return str1.length() - str2.length();
			}
		});

		// 2. 람다식으로 대체할 것
		TreeSet<String> tset2 = new TreeSet<String>((str1, str2) -> str1.length() - str2.length());

		tset.add("Orange");
		tset.add("Apple");
		tset.add("dog");
		tset.add("individual");

		Iterator<String> iter = tset.iterator(); 
		while(iter.hasNext()) {
			String s = iter.next(); 
			System.out.println(s);
		}
	}
}