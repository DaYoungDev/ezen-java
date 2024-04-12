package com.day9.seven;

/*
 오버라이딩
 - 부모로부터 상속받은 메소드의 내용을 변경하는 것
 - 자식 클래스 자신에 맞게 변경해야 하는 경우, 부모메소드를 오버라이딩함
 */

class Points{
	// 2차원 좌표계
	protected int x;
	protected int y;
	
	public String findLocation() {
		String result = "x = " + x + ", y = " + y;
		return result;
	}
}

class Points3D extends Points{
	private int z;
	
	public String findLocation() { // 메소드 오버라이딩
		// 부모 메소드의 내용을 변경했다
		String result = "x = " + x + ", y = " + y + ", z = " + z;
		return result;
	}
}

public class OverridingTest1 {
	public static void main(String[] args) {
		Points3D p = new Points3D();
		String r = p.findLocation();
		System.out.println("3차원 좌표 : " + r);
		
		Points p2 = new Points();
		r = p2.findLocation();
		System.out.println("2차원 좌표 : "+ r);
	}

}
