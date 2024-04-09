package com.day8.six;

class AAA {
	static int cv=1;  //명시적 초기화 => default 0 > 명시적 1 > static block 2
	int iv=1;  //명시적 초기화 => default 0 > 명시적 1 > 생성자 3
	
	static{  //클래스 초기화 블럭
		cv=2;
		System.out.println("static 초기화 블럭"); 
	}
	
	AAA(){  //생성자
		iv=3;
		System.out.println("생성자!!"); 
	}
}//class 

public class InitTest{
	public static void main(String[] args) { 
		System.out.println("AAA.cv="+AAA.cv); 
		AAA obj = new AAA();
		System.out.println("obj.iv="+obj.iv); 
	}
}