package com.day16.fifteen;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalTest {
	public static void main(String[] args) {
		// Optional 객체를 사용하면 예상치 못한
		// NullPointerException 예외를 제공하는 메소드로 간단히 회피할 수 있음
		
		Optional<String> opt = Optional.ofNullable("optional객체");
		System.out.println(opt.get());
		if(opt.isPresent()) {
			System.out.println(opt.get());
		} 
		
		Optional<String> opt2 = Optional.ofNullable(null);
		if(opt2.isPresent()) {
			System.out.println(opt2.get());
		} else {
			System.out.println("null");
		}
		
		Optional<String> opt3 = Optional.empty();
		System.out.println(opt3.orElse("빈 Optional객체"));
		System.out.println(opt3.orElseGet(() -> "java"));
		
		IntStream stream = IntStream.of(4,2,1,3);
		OptionalInt result = stream.findFirst();
		System.out.println(result.getAsInt());
		
		
	}

}
