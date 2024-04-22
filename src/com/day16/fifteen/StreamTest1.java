package com.day16.fifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(7);
		
		// 컬렉션에서 스트림 생성
		// Stream<Integer> Collection.stream()
		Stream<Integer> stream = list.stream();
		
		// forEach() 메소드를 이용한 스트림요소의 순차접근
		// void Stream.forEach(Consumer<? super Integer> action)
		stream.forEach(n -> System.out.println(n));
		
		//stream.forEach(n -> System.out.println(n)); // 예외발생
		
		System.out.println("\n=========");
		stream = list.stream();
		stream.forEach(n -> System.out.println(n));
		
		// 배열
		String[] arr = {"자바", "오라클", "스프링", "html"};
		
		// 배열에 스트림 생성
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.forEach(s -> System.out.println(s));
		
		System.out.println("\n=========");
		// 배열 특정 부분만을 이용한 스트림 생성
		Stream<String> stream3 = Arrays.stream(arr, 1, 3);
		stream3.forEach(System.out::println);
	}

}
