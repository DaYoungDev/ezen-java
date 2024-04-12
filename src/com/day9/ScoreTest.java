package com.day9;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		int[] subject = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		
		for(int i = 0; i < subject.length; i++) {
			subject[i] = sc.nextInt();
		}
		
		Score s = new Score(subject);
		System.out.println("총점 = " + s.sumScore() 
		+ ", 평균 =" + s.avgScore());
		
	}

}
