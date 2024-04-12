package com.day9;

/*
 자바에서는 중복상속(다중상속)을 허용하지 않음 => 부모가 여러개 불가
 인터페이스는 중복상속이 가능함
 
 Object 클래스 - 모든 클래스의 조상
 자바의 모든 클래스들은 Object클래스의 멤버들을 사용할 수 있다
 */

public class ParameterTest {
	public static void change(int x) { // 기본형 매개변수
		// call by value
		// 매개변수로 값이 넘어옴. 메소드에서 매개변수의 값을 변경해도
		// 호출한 곳(main)에서 영향받지 않음
		
		x = 1000;
		System.out.println("change(), x  = " + x);
	}
	
	public static void change(Data d) { // 참조형 매개변수
		// call by reference
		// => 매개변수로 주소가 넘어오기 때문에
		// 메소드에서 매개변수의 값을 변경하면 호출한 곳(main)에서도 변경의 영향을 받는다.
		
		d.x = 2000;
		System.out.println("참조형 change(), x = " + d.x);
	}
	
	public static void change(int[] arr) {
		arr[0] = 3000;
		System.out.println("배열 change(), arr[0] = " + arr[0]);
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // 기본형 매개변수, 매개변수에 10(값)을 넘김
		// 메소드 호출 후에도 원래값이 유지됨. 변경되지 않음
		System.out.println("change() 호출 후 main(), x = " + d.x);
		
		d.x = 30;
		System.out.println("\n=============참조형 매개변수==========");
		System.out.println("main() : x = " + d.x);
		
		change(d);// 참조형 매개변수, 매개변수에 클래스의 인스턴스주소가 넘어감
		// 메소드 호출 후, 메소드에서 매개변수 값을 변경하면 메인에서도
		// 변셩의 영향을 받음
		System.out.println("change() 호출 후 main(), x = " + d.x);
		
		int[] arr = {7, 8, 9};
		System.out.println("\n=========배열의 매개변수인 경우========");
		System.out.println("main(), arr[0] = " + arr[0]);
		
		change(arr); // 참조형 매개변수 : 클래스나 배열이 매개변수인 경우
		System.out.println("change() 호출 후 main(), arr[0] = " + arr[0]); // 3000
	}

}
