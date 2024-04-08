package com.day7;

import com.day6.BBB;

/*
 접근 제한자
 - 멤버나 클래스에 사용되어, 해당하는 멤버나 클래스를 외부에서 접근하지 못하도록 
 	제한하는 역할
 	
 접근 제한자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메소드, 생성자
 1) private - 같은 클래스내에서만 접근 가능
 2) default - 같은 패키지 안에 있는 클래스들끼리만 접근 가능
 3) protected - 같은 패키지는 물론 다른 패키지일지라도 상속관계가 있으면
 				접근 가능
 4) public - 어디서나 접근 가능
 
 private < default < protected < public
 
 클래스에서는 public, default만 사용가능
 메소드, 멤버변수는 모두 사용가능
 지역변수는 사용 불가
 */
class AAA{
	private int x;
	int y;
	protected int z;
	public int n;
	
	public void showInfo() {
		System.out.println("private x = " + x);
		System.out.println("defulat y = " + y);
		System.out.println("protected z = " + z);
		System.out.println("public n = " + n + "\n");
		
	}
}

public class PrivateTest1 {
	
	public static void main(String[] args) {
		AAA obj = new AAA();
		obj.showInfo();
		
		//obj.x = 10; // error : The field AAA.x is not visible
		// => private는 같은 클래스에서만 접근 가능하므로
		obj.y = 20;
		obj.z = 30;
		obj.n = 40;
		
		obj.showInfo();
		
		BBB b = new BBB();
		// b.x = 7; // error
		// b.y = 8; // error : The field BBB.y is not visible
		// 다른 패키지이므로 접근 불가
		// b.z = 9; // error
		b.n = 5;
		
		b.showInfo();
	}

}
