package com.day12;

/*
 간접적인 관계의 두 클래스(AA-BB)
 - 클래스 AA가 클래스 BB를 직접 호출하지 않고
 interface를 매개체로 하는 경우
 - 클래스 AA는 interface I하고만 직접적인 관계에 있기 때문에
   클래스 BB의 변경에 영향 받지 않음
 */
interface I{
	void methodB();
}

class AA{
	public void methodA(I i) {
		i.methodB();
	}
}

class BB implements I{
	public void methodB() {
		System.out.println("B 클래스 메소드");
	}
}

class CC implements I{
	public void methodB() {
		System.out.println("C 클래스 메소드");
	}
}

public class InterfaceTest4 {
	public static void main(String[] args) {
		AA a = new AA();
		a.methodA(new BB());
		a.methodA(new CC());
	}

}
