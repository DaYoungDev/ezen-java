package com.day11;

class Robot {}

class DanceRobot extends Robot { 
	void dance() {
		System.out.println("춤을 춥니다."); 
	}
}

class SingRobot extends Robot { 
	void sing() {
		System.out.println("노래를 합니다."); 
	}
}

class DrawRobot extends Robot { 
	void draw() {
		System.out.println("그림을 그립니다."); 
	}
}

public class RobotTest {
	
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot d = (DanceRobot)r;
			d.dance();
		} else if(r instanceof SingRobot) {
			SingRobot s = (SingRobot)r;
			s.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot d = (DrawRobot)r;
			d.draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()}; 
		for(int i=0; i< arr.length;i++) {
			if(arr[i] instanceof DanceRobot) {
				DanceRobot d = (DanceRobot)arr[i];
				d.dance();
			} else if(arr[i] instanceof SingRobot) {
				SingRobot s = (SingRobot)arr[i];
				s.sing();
			} else if(arr[i] instanceof DrawRobot) {
				DrawRobot d = (DrawRobot)arr[i];
				d.draw();
			}
		}
		
		System.out.println("\n=====확장 for문 사용=======");
		for(Robot r : arr) {
			if(r instanceof DanceRobot) {
				DanceRobot d = (DanceRobot)r;
				d.dance();
			} else if(r instanceof SingRobot) {
				SingRobot s = (SingRobot)r;
				s.sing();
			} else if(r instanceof DrawRobot) {
				DrawRobot d = (DrawRobot)r;
				d.draw();
			}
		}
		
		System.out.println("\n======메소드 사용========");
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}
		
		System.out.println("\n========확장 for문 사용========");
		for(Robot r : arr) {
			action(r);
		}
		

	}

}
