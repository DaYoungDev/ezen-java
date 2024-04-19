package com.day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		//return str1.length() - str2.length();
		// 문자열의 길이 순으로 정렬되도록
		
		if(str1.length() > str2.length()) {
			return 1;
		} else if(str1.length() < str2.length()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>(new StrLenComparator());
		// TreeSet<String>(Comparator<? super String> comparator)
		
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
