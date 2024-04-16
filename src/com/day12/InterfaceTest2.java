package com.day12;

/*
 인터페이스끼리의 상속도 가능 - extends 키워드 사용, 다중상속가능
 */

interface Attackable{
	/** 지정된 대상(Unit)을 공격하는 기능 */
	public void attack(Unit2 unit);
}

interface Movable{
	/** 지정된 위치(x, y)로 이동하는 기능 */
	void move(int x, int y);
}

// 인터페이스끼리의 상속
interface Fightable extends Attackable, Movable{
	
}

class Unit2{
	protected int x; // 유닛의 위치 (x좌표)
	protected int y; // 유닛의 위치 (y좌표)
	protected int currentHP; // 유닛의 체력
	
	Unit2(int x, int y, int currentHP){
		this.x = x;
		this.y = y;
		this.currentHP = currentHP;
	}
}

// 상속과 구현을 동시에
class Fighter extends Unit2 implements Fightable{
	Fighter(int x, int y, int currentHP){
		super(x, y, currentHP);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + "위치로 이동합니다.");
	}
	
	public void attack(Unit2 u) {
		System.out.println(u.x + ", "+ u.y + "위치에 있고, " 
	+ u.currentHP + "의 체력을 갖는 유닛을 공격합니다.");
	}
}


public class InterfaceTest2 {
	public static void main(String[] args) {
		Fighter f = new Fighter(10, 20, 300);
		f.move(40, 50);
		
		// 40, 50 위치에 있고 체력이 200인 유닛을 공격하고 80, 90위치로 이동
		Unit2 u = new Fighter(40, 50, 200);
		f.attack(u);
		f.move(80, 90);
		
		f.attack(new Fighter(80, 90, 150));
		
		// 자식은 부모의 인스턴스이기도 함
		// 자식 instanceof 부모 => true
		System.out.println(f instanceof Unit2); // true
		
		if(f instanceof Unit2) {
			System.out.println("f는 Unit2의 인스턴스이다");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable의 인스턴스를 구현했다");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable의 인스턴스를 구현했다");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable의 인스턴스를 구현했다");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 인스턴스이다");
		}
	}

}
