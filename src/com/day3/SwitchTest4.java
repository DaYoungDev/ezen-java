package com.day3;

public class SwitchTest4 {

	public static void main(String[] args) {
		// switch문 이용하여 학점구하기
		// - 수식을 이용하여 정해진 값이 나오도록 한다. ==> 비교가 가능하도록
		double avg = 86.7;
		String grade = "";
		switch((int)avg / 10) {
			case 10 : 
			case 9 :
				grade = "A";
				break;
			case 8 :
				grade = "B";
				break;
			case 7 :
				grade = "C";
				break;
			case 6 :
				grade = "D";
				break;
			default :
				grade = "F";
				break;
		}
		System.out.println("학점 : " + grade);
		
		/*
		 자바 14 새로운 switch문
		 1. -> 화살표 사용
		 2. 조건들을 ','를 이용해 나열
		 3. break 사용안함
		 4. 출력문 안에 switch문 작성가능
		*/
		
		String input = "m";
		switch(input) {
			case "m" -> System.out.println("남자");
			case "f" -> System.out.println("여자");
		}
		
		switch(input) {
			case "m", "M" -> System.out.println("남자");
			case "f", "F" -> System.out.println("여자");
		}
		
		String gender = "";
		switch(input) {
			case "m" -> gender = "남자";
			case "f" -> gender = "여자";
		}
		System.out.println(gender);
		
		// 기존의 switch문과 달리 새로운 문법은 리턴값이 있는 형태이다.
		gender = switch(input) {
			case "m" -> "남자";
			case "f" -> "여자";
			default -> "잘못된 값";
		};
		System.out.println("성별 : " + gender);
		
		// yield 키워드 사용
		gender = switch(input) {
		case "m" -> {
			System.out.println("m이 입력됨");
			yield "남자";
			}
		case "f" -> {yield "여자";}
		default -> {yield "잘못된 값";}
		};
		System.out.println("성별 : " + gender);
		
		// 출력문 안에 switch사용
		System.out.println(
				switch(input) {
					case "m" -> "남자";
					case "f" -> "여자";
					default -> "잘못된 값";
				}
			);
	}

}
