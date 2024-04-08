package com.day7;

class Man{
	// 멤버변수, 필드
	private int age;
	int height;
	
	// getter / setter
	public int getAge() { // getter - 멤버변수의 값 읽기
		return age;
	}
	
	public void setAge(int p_age) { // setter - 멤버변수에 값 할당
		if(p_age < 1) {
			age = 1;
		} else {
			age = p_age;
		}
	}
}

public class ManTest {

	public static void main(String[] args) {
		Man m = new Man();
		m.height = 175;
		m.setAge(20); // 멤버변수에 값 넣기
		
		System.out.println("키 : " + m.height);
		System.out.println("나이 : " + m.getAge()); // 멤버변수값 읽기
		
		m.setAge(-5);
		System.out.println("나이 : " + m.getAge()); // 멤버변수값 읽기
		
	}

}
