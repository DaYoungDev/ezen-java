package com.day2.op;

public class IncrementOp3 {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("a : " + a);
		System.out.println("a++ : " +  a++); //a가 사용되고 난 후에 1 증가
		System.out.println("++a : " +  ++a); //a가 1 증가된 값을 사용
		
		double b = 7;
		System.out.println("b : " +  b);
		System.out.println("b-- : " +  b--);
		System.out.println("--b : " +  --b);
		
		char c = 'A';
		System.out.println("c : " + c); 
		System.out.println("++c : " + ++c); 
		c = 'a';
		System.out.println("c : " +  c); 
		c++;
		System.out.println("c++ : " +  c);

		/*
		 0
		 0
		 2
		 
		 7.0 double이니까 .0붙여라
		 7.0
		 5.0
		 
		 A
		 B
		 a
		 a(오답), b(정답) ???? 왜 b... > 단독 증가여서 +1
		*/
	}

}
