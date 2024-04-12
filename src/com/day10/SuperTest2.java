package com.day10;

class Father {
	private String name;
	Father(String name) {
		this.name = name;      
	}
	public void display() 
	{
		System.out.println("name : " +  name); 
	}
}
class Son extends Father {
	Son(String name){ 
		super(name);
	} 
}

public class SuperTest2 {

	public static void main(String[] args) {
		Son s = new Son("아들"); 
		s.display();
	}

}
