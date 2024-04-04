package com.day4;

public class ScopeTest {

	public static void main(String[] args) {
		//변수의 범위(scope)
		int a=10; //main() 메서드내에서 사용 
		System.out.println(a);
		
		for (int i=0; i<3 ; i++ ) {   //for(int a=0; a<3; a++) 사용 불가 
			System.out.print("hello!  "); 
			System.out.println(a);
		}//for
		
		for(int i=0; i<3; i++){
			int n=20;
			System.out.println("i=" + i + ", n=" + n); 
		}//for
		
		// System.out.println(i);  //에러 
		// System.out.println(n);  //에러
		
		/*
		 # 변수의 범위(Scope)
		 - 지역변수는 해당 블록을 벗어나면 소멸함
		 - 메소드에서 선언된 변수는 해당 메소드가 종료되면 소멸
		 - if나 for문 안에서 선언된 지역변수는 해당 if나 for문을 벗어나면 소멸
		 */
	}

}
