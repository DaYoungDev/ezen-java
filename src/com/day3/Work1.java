package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) throws IOException {
		// 1. if문 이용 
		// 1) 정수 입력받아 양수 음수 0 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if(num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		// 2) 아이디 비밀번호 확인
		System.out.println("아이디를 입력하세요");
		sc.nextLine(); // 버퍼에 남아있는 엔터를 없애는 방법
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		int password = sc.nextInt();
		
		if(id.equals("hong") && password == 1234) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
		}
		
		// 2. switch문 이용
		// 1) 직업 입력받아서 출력
		System.out.println("직업을 입력하세요 : A.회사원 B.학생 C.주부 D.기타");
		char job = (char)System.in.read();
		switch(Character.toUpperCase(job)) {
		case 'A' : 
			System.out.println("회사원이시군요");
			break;
		case 'B' : 
			System.out.println("학생이시군요");
			break;
		case 'C' : 
			System.out.println("주부이시군요");
			break;
		case 'D' : 
			System.out.println("기타이시군요");
			break;
		default :
			System.out.println("잘못입력했어요");
		}
		
		// 3. 성적 입력 후 평균값 및 합격 여부 출력하기
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int korea = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		double avg = (korea + english + math) / 3.0;
		String grade = "";
		String pass = "";
		
		if(avg >= 70) {
			if(korea >= 50 && english >= 50 && math >= 50) {
				pass = "합격";
				switch((int)avg / 10) {
					case 9 :
						grade = "A";
						break;
					case 8 :
						grade = "B";
						break;
					case 7 :
						grade = "C";
						break;
				}
			} else {
				pass = "과락";
				switch((int)avg / 10) {
					case 9 :
						grade = "A";
						break;
					case 8 :
						grade = "B";
						break;
					case 7 :
						grade = "C";
						break;
				}
			} 
		} else {
			grade = "D";
			pass = "불합격";
		}
		System.out.println("평균 : " + avg + ", 학점 : " + grade);
		System.out.println("합격여부 : " + pass);
		
		// 4. if문 이용
		// 1) 짝홀 삼항연산자
		System.out.println("정수를 입력하세요");
		int num2 = sc.nextInt();
		int rest = num2 % 2;
		String result = rest == 1 ? "홀수" : "짝수";
		System.out.println("입력한 정수 : " + num2 + "," + result);
		
		
		// 2) 값을 입력받아서 숫자인지 알파벳인지 기타문자인지 출력하기
		System.out.println("0~9나 알파벳, 그외 문자를 입력하세요");
		int code = System.in.read();
		char ch = (char)code;
		String result2 = "";
		if(code >= 48 && code <= 57) {
			System.out.println("입력한 값 : " + ch);
			result2 = "숫자입니다.";
		} else if(code >= 97 && code <= 122) { // 소문자영역
			System.out.println("입력한 값 : " + ch);
			result2 = "알파벳입니다.";
		} else if(code >= 65 && code <= 90) { // 대문자영역
			System.out.println("입력한 값 : " + ch);
			result2 = "알파벳입니다.";
		} else {
			System.out.println("입력한 값 : " + ch);
			result2 = "기타 문자입니다.";
		}
		System.out.println(result2);
		
		
		// 3) java.lang.Character 클래스 이용하기
		if(Character.isDigit(code)) {
			System.out.println("입력한 값 : " + ch);
			result2 = "숫자입니다.";
		} else if(Character.isAlphabetic(code)) { // 알파벳영역
			System.out.println("입력한 값 : " + ch);
			result2 = "알파벳입니다.";
		}  else {
			System.out.println("입력한 값 : " + ch);
			result2 = "기타 문자입니다.";
		}
		System.out.println(result2);
		
	}

}
