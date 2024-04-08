package com.day7;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		
		Score point = new Score(k, e, m);
		System.out.println("point 주소 = " + point);
		
		int sum = point.totalSum();
		double avg = point.totalAvg();
		
		System.out.println("총점 = " + sum + ", 평균 = " + avg);
		
		Score2 point2 = new Score2(k, e, m);
		point2.totalSum();
		point2.totalAvg();
		System.out.println("총점 = " + point2.sum + ", 평균 = " + point2.avg);
		
	}

}
