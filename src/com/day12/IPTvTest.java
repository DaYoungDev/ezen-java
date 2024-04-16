package com.day12;

/*
 - 상속과 구현을 동시에 할 수도 있다
 	class Fighter extends Unit implements Fightable{}
 	
 - 인터페이스는 다중상속이 가능하다
  	interface Fightable extends Movable,Attackable{}
 - 인터페이스끼리는 extends 이용하여 상속함
 
 - 하나의 클래스가 여러 개의 인터페이스를 상속받아 구현할 수 있다
 	class IPTV implements TV, Computer{}
 */

class TV{
	public void onTV() {
		System.out.println("TV 영상 출력 중");
	}
}

interface Computer{
	public void dataReceive();
}

// 상속과 구현을 동시에 할 수 있다
class IPTV extends TV implements Computer{
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void powerOn() {
		// 인터넷으로부터 방송데이터를 받아서 TV로 출력
		dataReceive();
		onTV();
	}
}

public class IPTvTest {
	public static void main(String[] args) {
		IPTV obj = new IPTV();
		obj.powerOn();
	}

}
