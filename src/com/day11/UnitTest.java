package com.day11;


class Unit{
	protected int x, y; // 현재  위치
	public void move(int x, int y){}  // Unit 클래스를  상속받아서  작성되는  클래스는 
	// move 메소드를  자신의  클래스에  알맞게  구현해야  한다
	public void stop(){/* 현재  위치에  정지  */}
}

class Marine extends Unit{ // 보병
	public void move(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("보병이 " + x + ", " + y + "위치로 이동한다.");
	}
	public void stimPack(){
		System.out.println("보병이 스팀팩을 사용한다.");
	}
}

class Tank extends Unit{ // 탱크
	public void move(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("탱크가 " + x + ", " + y + "위치로 이동한다.");
	}
	public void changeMode(){
		System.out.println("탱크가 공격모드를 변환한다.");
	}

}

class Dropship extends Unit{ // 수송선 
	public void move(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("수송선이 " + x + ", " + y + "위치로 이동한다.");
	}
	void load(){
		System.out.println("수송선이 선택된 대상을 태운다.");
	}
	void unload(){
		System.out.println("수송선이 선택된 대상을 내린다.");
	}
}



public class UnitTest {
	public static void main(String[] args) {
		// Unit 배열 만들어서 4개의 요소 넣기
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine();
		uArr[1] = new Tank();
		uArr[2] = new Dropship();
		uArr[3] = new Marine();
		
		// Unit 배열의 모든 유닛을 좌표(100,200)의 위치로 이동한다
		for(int i = 0; i < uArr.length; i++) {
			uArr[i].move(100, 200);
		}
		
		// down-casting -> 자식의 메소드 이용
		System.out.println("========down-casting=====");
		for(int i = 0; i < uArr.length; i++) {
			if(uArr[i] instanceof Marine) {
				Marine m = (Marine)uArr[i];
				m.stimPack();
			} else if(uArr[i] instanceof Tank) {
				Tank t = (Tank)uArr[i];
				t.changeMode();
			} else if(uArr[i] instanceof Dropship) {
				Dropship d = (Dropship)uArr[i];
				d.load();
				d.unload();
			}
			System.out.println();
		}
		
		// 확장 for
		System.out.println("\n==========");
		for(Unit unit : uArr) {
			if(unit instanceof Marine) {
				Marine m = (Marine)unit;
				m.stimPack();
			} else if(unit instanceof Tank) {
				Tank t = (Tank)unit;
				t.changeMode();
			} else if(unit instanceof Dropship) {
				Dropship d = (Dropship)unit;
				d.load();
				d.unload();
			}
			System.out.println();
		}
	}

}
