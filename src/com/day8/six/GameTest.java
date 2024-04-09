package com.day8.six;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위<0>, 바위<1>, 보<2>, Q<quit>를 입력하세요");
		int human = sc.nextInt();
		int com = (int)(Math.random()*3);
		
		Game g1 = new Game();
		g1.compare(human, com);
		
		System.out.println("사용자 : " + g1.gethChoice());
		System.out.println("컴퓨터 : " + g1.getComChoice());
		System.out.println("결과 = 사용자가 " + g1.getResult());
		
	}

}
