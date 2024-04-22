package com.day16.fifteen;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterMapTest {

	public static void main(String[] args) {
		// 필터링
		IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
		IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
		
		// 스트림에서 중복된 요소를 제거함
		stream1.distinct().forEach(i -> System.out.print(i + " "));
		System.out.println("\n===============");
		
		// 스트림에서 홀수만 골라냄
		stream2.filter(n -> n % 2 != 0).forEach(i -> System.out.print(i + " "));
		
		System.out.println("\n===============");
		// map 이용
		Stream<String> stream = Stream.of("java", "spring", "oracle", "html");
		stream.map(s -> s.length()).forEach(System.out::println);
		
		System.out.println("\n===============");
		// 여러 문자열이 저장된 배열을 각 문자열에 포함된 단어로 이루어진 스트림으로 변환
		String[] arr = {"I study hard", "You study java", "I am hungry"};
		Stream<String> stream3 = Arrays.stream(arr);
		stream3.flatMap(s -> Stream.of(s.split(" "))).forEach(s -> System.out.println(s));
	}

}
