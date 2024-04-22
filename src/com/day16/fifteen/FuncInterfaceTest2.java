package com.day16.fifteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncInterfaceTest2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		// List<String> Arrays.asList(String... a)
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
				// int compareTo(String anotherString)
			}
		});
		
		// void Collections.sort(List<String> list, Comparator<? super String> c)
		
		for(String s : list) {
			System.out.println(s);
		}
		
		List<String> list2 = Arrays.asList("abc","aaa","bbb","ddd","aaa");
		
		Collections.sort(list2, (s1, s2) -> s1.compareTo(s2));
		System.out.println("\n======람다식 이용=====");
		for(String s : list2) {
			System.out.println(s);
		}
	}

}
