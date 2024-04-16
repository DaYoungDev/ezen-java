package com.day12;

/*
 직접적인 관계의 두 클래스(A-B)
 클래스 A와 B는 직접적인 관계에 있다.
 단점 : 한쪽(Provider)이 변경되면 이를 사용하는 다른 한쪽(User)도 변경되어야함
 
 A(User) -> B(Provider)
 */

class A{
	/*
	public void methodA(B b) {
		b.methodB();
	}
	*/
	public void methodA(C c) {
		c.methodB();
	}
}
/*
class B{
	public void methodB() {
		System.out.println("B클래스의 메소드");
	}
}
*/

class C{
	public void methodB() {
		System.out.println("C클래스의 메소드");
	}
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new C());
	}

}
