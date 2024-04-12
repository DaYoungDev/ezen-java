package com.day10;

class Parent { 
	int x=10;
	int y = 30;
}


class Child extends Parent { 
	void method() {
		int y = 40;
		
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x + "\n");
		
		System.out.println("y=" + y);
		System.out.println("this.y=" + this.y); // 40
		System.out.println("super.y="+ super.y + "\n"); // 30
		// super는 부모의 멤버변수여서 30
	}
}



public class SuperTest1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
