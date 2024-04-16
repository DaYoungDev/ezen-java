package com.day12;


interface TV2{
	public void onTV();
}

interface Computer2{
	public void dataReceive();
}

// 상속과 구현을 동시에 할 수 있다
class IPTV2 implements TV2, Computer2{
	@Override
	public void onTV() {
		System.out.println("TV영상 출력 중");
	}
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void powerOn() {
		// 인터넷으로부터 방송데이터를 받아서 TV로 출력
		dataReceive();
		onTV();
	}
}

public class IPTvTest2 {
	public static void main(String[] args) {
		IPTV2 obj = new IPTV2();
		obj.powerOn();
	}

}
