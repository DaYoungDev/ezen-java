package com.day14.thirteen;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(3);
		
		// 데이터 저장
		list.add(new Integer(10)); // jdk 5.0 이전
		// => 컬렉션에 값을 저장할 때 객체로 저장해야 하므로, Wrapper클래스사용
		list.add(new Integer(157));
		list.add(30); // jdk 5.0 - autoboxing
		// => 기본자료형 값이 컴파일러에 의해서 자동으로 참조형으로 변환되어 저장
		
		/*
		 Boxing - 기본자료형 데이터를 참조형으로 변환하는 것
		 Unboxing - 참조형 데이터를 기본자료형으로 변환하는 것
		 */
		System.out.println("ArrayList의 크기 : " + list.size());
		
		// 데이터 참조 - 읽어오기
		for(int i = 0; i < list.size(); i++ ) {
			Object obj = list.get(i);
			Integer n = (Integer)obj;
			int num = n.intValue();
			System.out.println(num);
		}
		
		// 다른 자료형 저장
		list.add(new Double(3.1415));
		list.add("java");
		
		Object obj = list.get(3);
		Double d = (Double)obj;
		double d2 = d.doubleValue();
		System.out.println(d2);
	}

}
