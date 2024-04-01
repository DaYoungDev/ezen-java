package com.day2.op;

public class IncrementOp1 {

	public static void main(String[] args) {
		/*
		 단항 연산자 - 증감연산자
		 ++a : 연산전에 1증가(a = a + 1), 전위형
		 a++ : 연산후에 1증가, 후위형
		 
		 --a : 연산전에 1감소(a = a - 1)
		 a-- : 연산후에 1감소
		 */
		// 단독으로 사용되는 경우 - 전위형과 후위형 결과는 같다
		int i = 5;
		i++; // i = i + 1
		System.out.println(i); // 6
		
		i = 5;
		++i;
		System.out.println(i); // 6
	}

}
