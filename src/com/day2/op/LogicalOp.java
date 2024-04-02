package com.day2.op;

public class LogicalOp {

	public static void main(String[] args) {
		// 논리연산자
		/*
		 && : and 연산자
		 	동시에 만족해야 true
		 	피연산자가 모두 true일 때만 true
		 	
		 || : or 연산자
		 	피연산자 중 하나라도 true이면 true
		 */
		int x = 10,  y = -20;
		boolean a = x > 0; // true
		boolean b = y > 0; // false
		
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a && b : " + (a && b));
		System.out.println("a || b : " + (x > 0 || y > 0));
		System.out.println("!a : " + (!(x > 0)));
		
		/*
		 p : 42
		 q : 2
		 
		 p : 42
		 q : 1
		 */
		
		int p=0, q=1;
		if( (p++==0) | (q++==2 ) ) {
			System.out.println("p="+p+", q="+q); 
			p=42;
		}
		System.out.println("p="+p+", q="+q+"\n"); 
		
		p=0; q=1;
		if( (p++==0) || (q++==2 ) ) {
		p=42;
		System.out.println("p="+p+", q="+q); 
		}
		System.out.println("p="+p+", q="+q); 
	}

}
