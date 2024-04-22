package com.day16.fifteen;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		// 가변매개변수에서 스트림생성
		// Stream<Double> Stream.of(Double... values)
		Stream<Double> stream = Stream.of(3.14, 5.6, 7.8, 9.2);
		stream.forEach(d -> System.out.println(d));
		System.out.println("\n===============");
		
		// 지정된 범위의 연속된 정수에서 스트림 생성
		IntStream stream2 = IntStream.range(1, 4);
		stream2.forEach(i -> System.out.print(i + " "));
		
		System.out.println("\n===============");
		IntStream stream3 = IntStream.rangeClosed(1, 4);
		stream3.forEach(i -> System.out.print(i + " "));
		
		// 빈 스트림 생성
		System.out.println("\n===============");
		Stream<Object> stream4 = Stream.empty();
		System.out.println("스트림요소의 총개수 : "+ stream4.count());
	}

}
