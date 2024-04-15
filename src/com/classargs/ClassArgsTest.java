package com.classargs;

class Shape{
	public double findArea() {
		return 0;
	}
	
}

class Circle extends Shape{
	//멤버변수
	int radius; //반지름 10
	
	//생성자
	public Circle(int radius) {
		this.radius=radius;
	}
	
	//메소드
	public double findArea() { //넓이 구하는 메소드
		double area = radius*radius*3.14;
		return area;
	}
	
}

class Rectangle extends Shape{
	int width;
	int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public double findArea() {
		double area = width * height;
		return area;
	}
	
}


public class ClassArgsTest {
	public static double multiply(int a, double b) {
		return a*b;
	}
	
	//매개변수가 클래스인 경우
	public static void func1(Circle c) {
		//참조변수가 보이면 참조변수.
		//참조변수.멤버
		double area=c.findArea();
		System.out.println("원 면적:" + area);
	}
	
	//반환타입이 클래스인 경우
	public static Circle func2() {
		//반환타입이 Circle(클래스)이면 Circle객체(해당 클래스의 객체)가
		//리턴된다
		Circle c = new Circle(5);
		return c;
	}
	
	// 매개변수의 다형성
	public static void func3(Shape sh) {
		sh.findArea();
	}
	
	// 반환타입에 다형성 이용
	public static Shape func4(int type) { // 반환타입이 Shape(부모)면 자식객체가 리턴
		Shape sh = null;
		if(type == 1) {
			sh = new Circle(10);
		} else if(type == 2) {
			sh = new Rectangle(5,7);
		}
		return sh;
	}
	public static void main(String[] args) {
		double d=multiply(10, 3.5);
		System.out.println(d);
		
		int n1=20;
		double n2=2.7;
		d=multiply(n1, n2);
		
		// 1. 매개변수가 클래스인 경우
		/*
		 메소드의 매개변수가 int이면 main()에서 int 값을 넣어준다
		 				 String이면		  String값을 넣어준다
		 				 Circle이면		  Circle을 넣어준다
		 				 				  (new로 객체생성해서 넣는다)
		 				 Shape이면(부모이면) 자식객체를 넣어준다	
		*/
		Circle c = new Circle(10);
		func1(c);
		
		//또는
		func1(new Circle(20));
		
		// 2. 매개변수의 다형성
		func3(new Circle(10));
		
		// 또는
		Rectangle rec = new Rectangle(5, 9);
		func3(rec);
		
		// 3. 반환타입이 클래스인 경우
		Circle c2 =func2();
		double area=c2.findArea();
		System.out.println("원의 면적 : " + area);
		
		// 4. 반환타입에 다형성이 이용된 경우
		Shape sh = func4(1);
		sh.findArea();
	}

}
