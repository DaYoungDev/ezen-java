package com.day5;

public class FactorialTest {
	// 재귀호출 : 메소드의 내부에서 메소드 자기자신을 다시 호출하는 것
	// 반복적인 작업을 해야하는 경우 사용할 수 있다
	
	public static long factorial(int n) {
		// f(n) = n * f(n-1), 단 f(1)=1
		
		long result = 0;
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1); // 메소드 자신을 호출
			/*
			 	4 * f(3)
			 		3 * f(2)
			 			2 * f(1)
			 				1
			 */
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		long res = factorial(4); // 4! = 4 * 3 * 2 * 1
		System.out.println(res);
	}

}
