package com.day10.nine;

import java.util.Scanner;

class Animal 
{
	public void bark(){
		System.out.println("울다"); 
	}
	public void parent(){
		System.out.println("난  부모-동물"); 
	}
}

class Cat extends Animal 
{
	public void bark() 
	{
		System.out.println("야옹야옹"); 
	}
	public void child() 
	{
		System.out.println("난  자식-고양이"); 
	}
}
class Cow extends Animal 
{
	public void bark() 
	{
		System.out.println("음메음메"); 
	}
}
class Dog extends Animal 
{
	public void bark() 
	{
		System.out.println("멍멍"); 
	}
}


public class AnimalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("동물을 선택하세요 (1.고양이, 2.소, 3.강아지)");
		int type = sc.nextInt();
		
		if(type == 1) {
			Cat c = new Cat();
			c.bark();
		} else if(type == 2) {
			Cow co = new Cow();
			co.bark();
		} else if(type == 3) {
			Dog d = new Dog();
			d.bark();
		} else {
			System.out.println("잘못선택하였습니다.");
		}
		
		
		
		System.out.println("=======다형성 이용=========");
		Animal a = null;
		if(type == 1) {
			a = new Cat();
		} else if(type == 2) {
			a = new Cow();
		} else if(type == 3) {
			a = new Dog();
		} else {
			System.out.println("잘못선택하였습니다.");
			return;
		}
		
		a.bark();
	}

}
