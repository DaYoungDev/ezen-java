package com.day13.eleven;

import java.util.Scanner;

class Animal{
    public void bark(){
		System.out.println("울다");
    }
    public void parent(){
		System.out.println("난 부모-동물");
    }
}

class Cat extends Animal{
	public void bark(){
		System.out.println("야옹야옹");
	}
	public void showCat()	{
		System.out.println("난 자식-고양이");
	}
}
class Cow extends Animal{
	public void bark(){
		System.out.println("음메음메");
	}
	public void showCow()	{
		System.out.println("난 자식-소");
	}
}
class Dog extends Animal{
	public void bark(){
		System.out.println("멍멍");
	}
	public void showDog()	{
		System.out.println("난 자식-강아지");
	}
}

public class Test {
	public static void callAnimal(Animal a) {
		if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.showCat();
		}else if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.showDog();
		}else if(a instanceof Cow) {
			Cow w = (Cow)a;
			w.showCow();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("1. 고양이, 2. 강아지, 3. 소 중에서 하나 선택!!");
		int type = sc.nextInt();
		Animal a = null;
		//(1) 다형성을 이용하여 해당 객체를 생성하고, 오버라이딩 메서드 호출
		//(2) 자식만의 메서드 호출
		if(type == 1) {
			a = new Cat();
			Cat c = (Cat)a;
			c.showCat();
		} else if(type == 2) {
			a = new Dog();
			Dog d = (Dog)a;
			d.showDog();
		} else if(type == 3) {
			a = new Cow();
			Cow w = (Cow)a;
			w.showCow();
		}
		a.bark();

		//(3) Animal 배열을 선언하고, 4개의 요소를 넣은 후 오버라이딩 메서드 호출
		Animal[] arr = new Animal[4];
		arr[0] = new Cat();
		arr[1] = new Dog();
		arr[2] = new Cow();
		arr[3] = new Cat();
		for(Animal a1 : arr) {
			a1.bark();
		}
		
		//(4) 모든 배열요소의 자식만의 메서드 호출
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Cat) {
				Cat c = (Cat)arr[i];
				c.showCat();
			}else if(arr[i] instanceof Dog) {
				Dog d = (Dog)arr[i];
				d.showDog();
			}else if(arr[i] instanceof Cow) {
				Cow w = (Cow)arr[i];
				w.showCow();
			}
		}
		
		//(5) 자식만의 메서드를 호출하는 부분을 메서드로 만들어서 처리
		for (int i=0; i<arr.length; i++)	{
			callAnimal(arr[i]);

		}//for	

	}

}
