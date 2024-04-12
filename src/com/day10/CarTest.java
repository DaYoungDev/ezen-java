package com.day10;

/*
 [1] this.멤버
 	- 자기 자신을 가리키는 this
 	- 자신의 멤버를 참조하는 this
 [2] this()
 	- 자기 자신의 생성자를 호출할 때 사용
 	- 같은 클래스의 다른 생성자를 호출할 때 사용
 	- 생성자의 첫줄에서만 호출 가능
 */
class Car{
	private String color;
	private String gearType; // 변속기 종류 - auto, manual
	private int door;
	
	// 생성자
	Car(){
		this("white", "auto", 4);
		// Car(); 생성자를 호출이 불가능하여 this();로 호출
		/*
		this.color = "white";
		this.gearType = "auto";
		this.door = 4;
		*/
	}
	
	Car(String color){
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public void showInfo() {
		System.out.println("color : " + color);
		System.out.println("gearType : " + gearType);
		System.out.println("door : " + door + "\n");
	}
	
}

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.showInfo();
		
		Car c2 = new Car("blue");
		c2.showInfo();
		
		Car c3 = new Car("red", "manual", 2);
		c3.showInfo();
		
	}

}
