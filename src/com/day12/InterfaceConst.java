package com.day12;

import java.util.Scanner;

// 인터페이스를 이용한 다수의 상수 선언
interface Week{
	int MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6, SUN=7;
}

public class InterfaceConst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일 선택 : 1.월 2.화 3.수 4.목 5.금 6.토 7.일");
		int type = sc.nextInt();
		switch(type) {
			case Week.MON -> {
				System.out.println("주간회의가 있어요");
			}
			case Week.TUE -> {
				System.out.println("프로젝트 기획 회의가 있습니다");
			}
			case Week.WED -> {
				System.out.println("진행사항 보고일 입니다");
			}
			case Week.THU -> {
				System.out.println("사내 축구시합이 있는 날입니다");
			}
			case Week.FRI -> {
				System.out.println("프로젝트 마감일입니다");
			}
			case Week.SAT -> {
				System.out.println("가족과 즐거운 시간을 보내세요");
			}
			case Week.SUN -> {
				System.out.println("오늘은 휴일입니다");
			}
			default -> {
				System.out.println("잘못입력");
			}
		}
		
	}

}
