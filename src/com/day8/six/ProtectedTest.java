package com.day8.six;

import com.day8.Parent;

class Child extends Parent{
	public void putData() {
		//num1 = 10; // private - 다른 클래스이므로 접근 불가
		//num2 = 20; // defualt - 다른 패키지이므로 접근 불가
		num3 = 30; // protected - 상속관계이므로 접근 가능
		num4 = 40; // public - 어디서든 접근 가능
	}
}

public class ProtectedTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.putData();
		ch.showInfo();
		
		// System.out.println("private int1 = " + ch.num1); // error
		// System.out.println("default int2 = " + ch.num2); // error
		// System.out.println("protected int3 = " + ch.num3); // error
		// 자식클래스의 디자인을 할때만 열리는 protected 타입이라 처리가 불가능하다
		System.out.println("public int4 = " + ch.num4 + "\n");
		// public이어서 출력가능
		
		// protected : 클래스 외부에서 보면 default로 보이고,
		// 상속의 관계에서 보면 public으로 보임
		
	}

}
