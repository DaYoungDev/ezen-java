package com.day11;

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

		Animal[] aniArr = new Animal[3];

		aniArr[0]=new Cat();
		aniArr[1]=new Cow();
		aniArr[2]=new Dog();
		
		if(type==1 || type==2 || type==3) {
			aniArr[type-1].bark();
		}else {
			System.out.println("잘못 입력했습니다.");

		}

	}
}
