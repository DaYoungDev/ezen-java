package com.day13.eleven;

import java.util.Scanner;

interface Car{
	public void drive();

	public void stop();
}

class FireEngine implements Car{
	public void water() {
		System.out.println("water!!");
	}

	public void drive() {
		System.out.println("소방차를 운전합니다.");
	}
	
	public void stop() {
		System.out.println("소방차를 멈춥니다.");
	}
}

class Ambulance implements Car{
	public void siren() {
		System.out.println("siren~");
	}

	public void drive() {
		System.out.println("앰뷸런스를 운전합니다.");
	}
	
	public void stop() {
		System.out.println("앰뷸런스를 멈춥니다.");
	}
}


public class CarTest {
	public static void main(String[] args) {
//		다형성 이용
//		[1] 인터페이스 이용
//		[2] 1.소방차 2.앰뷸런스 선택 받고, 오버라이딩 메서드 호출 - 다형성 이용 
//		[3] Car 배열에 요소 3개 넣고, 모든 차의 오버라이딩 메서드호출-for/확장 for 이용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요 (1.소방차 2.앰뷸런스)");
		int type = sc.nextInt();
		Car c = null;
		if(type == 1){
			c = new FireEngine();
		} else if(type == 2) {
			c = new Ambulance();
		}
		c.drive();
		c.stop();
		
		// 배열에 넣고 호출하기
		Car[] cArr = new Car[3];
		cArr[0] = new Ambulance();
		cArr[1] = new FireEngine();
		cArr[2] = new Ambulance();
		
		
		System.out.println("\n=====for========");
		for(int i = 0; i < cArr.length; i++) {
			cArr[i].drive();
			cArr[i].stop();
		}
		
		System.out.println("\n=====확장 for======");
		for(Car c1 : cArr) {
			c1.drive();
			c1.stop();
		}
	}

}
