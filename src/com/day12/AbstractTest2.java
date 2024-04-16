package com.day12;

abstract class Player{
	boolean pause;  //일시 정지 상태  저장하기 위한 변수
	int currentPos;  //현재 play되고 있는 위치를 저장하기 위한 변수
	
	Player(){ //추상 클래스도 생성자가 있어야 한다 
		pause=false;
		currentPos=0; 
	}
	
	/** 지정된 위치 (pos)에서 재생을 시작하는 기능이 수행하도  작성되어야 한다*/ 
	abstract void play(int pos);
	
	/** 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다*/ 
	abstract void stop();
	
	void play(){
		play(currentPos);  //추상 메서드를 사용할 수 있다 
	}
	
	void pause(){
		if (pause){ //pause가 true일 때 (일시정지상태)에서 pause가 호출되면,
			pause=false; //pause의 상태를 false로 바꾸고, 
			play(currentPos); //현재의 위치에서 play를 한다
		}else{ //play 상태에서 호출되면
			pause=true;
			stop();//play()를 멈춘다
		} 
	}   
}//class

class CDPlayer extends Player{
	//부모 클래스의 추상 메서드를 구현한다 
	void play(int currentPos){
		// 구현
		System.out.println(currentPos + "위치에서 CD Player의 재생을 시작한다.");
	}
	void stop(){ 
		//구현
		System.out.println("CD Player의 재생을 즉시 멈춘다");
	}
	
	//CDPlayer 클래스에 추가로 정의된 멤버 
	int currentTrack; //현재 재생 중인 트랙
	
	void nextTrack(){
		currentTrack++;
		//..... 
	}
	
	void preTrack(){
		if (currentTrack>1){
			currentTrack--;
		} 
		//....
	}
}

public class AbstractTest2 {
	
	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.play(10);
		cd.pause();
		cd.play(10);
		cd.stop();
		
		
	}
	
}
