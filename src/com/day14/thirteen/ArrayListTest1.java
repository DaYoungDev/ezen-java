package com.day14.thirteen;

import java.util.ArrayList;

/*
 컬렉션
 - 데이터의 저장을 위해 정의된 클래스
 
 컬렉션 프레임워크
 - 데이터 그룹을 저장하는 클래스들을 표준화한 설계
 
 컬렉션 - 배열과 달리, 메모리의 사이즈를 동적으로 확장할 수 있다
 
 컬렉션 프레임워크의 핵심 인터페이스
 - List, Set, Map
 
 [1] List
 	순서가 유지되고, 데이터의 중복을 허용함
 	구현클래스 - ArrayList, Stack, Vector
 	
 [2] Set
 	순서가 유지되지 않고, 데이터의 중복을 허용하지 않음
 	구현 클래스 - HashSet, TreeSet
 	
 [3] Map
 	키와 값(key, value)의 쌍으로 이루어진 데이터 집합
 	순서는 유지되지 않고, 키는 중복허용하지 않고, 값은 중복허용
 	구현 클래스 - HashMap, Hashtable, Properties
 	
 	상속계층도
 	Collection <- List
 				  Set
 	# 제네릭스 컬렉션
 	- 컬렉션에 저장할 객체의 타입을 지정
 	- 꺼낼대는 자동으로 형변환 해줌
 	
 	컬렉션 클래스<저장할 객체의 타입> 변수명 = new 컬렉션 클래스<저장할 객체의 타입>();
 	
 */
public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(2);
		
		// 1. 저장
		list.add(10);
		list.add(21);
		list.add(59);
		
		// 2. 참조 - 읽어오기
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i); // 자동형변환 해줌
			// => unboxing도 해줌, Integer -> int
			System.out.println(n);
		}
		
		System.out.println("ArrayList의 크기 : " + list.size());
		
		// 3. 데이터 삭제
		list.remove(0);
		System.out.println("\n=======삭제후========");
		for(int n : list) {
			System.out.println(n);
		}
	}

}
