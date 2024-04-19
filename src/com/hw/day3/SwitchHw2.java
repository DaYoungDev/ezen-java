package com.hw.day3;

import java.util.Scanner;

public class SwitchHw2 {

	public static void main(String[] args) {
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		double avg=(kor+eng+math)/3.0;
		String result="";
		if(avg>=70 && kor >=50 && eng>=50 && math>=50){
			result="합격";
		}else{  //avg<70 || kor <50 || eng<50 || math<50
			if(avg>=70)	{
				result="과락";
			}else{
				result="불합격";
			}
		}

		if(avg<70){
			result="불합격";
		}else{ //avg>=70
			if(kor >=50 && eng>=50 && math>=50){
				result="합격";
			}else{
				result="과락";
			}
		}

		String grade="";
		switch ( (int)avg/10){
			case 10:
			case 9: grade="A";	break;			
			case 8: grade="B";	break;
			case 7: grade="C";	break;
			case 6: grade="D";	break;
			default: grade="F";			
		}
		System.out.println("\n평균 : "+avg +  ", 학점 : " + grade);	
		System.out.println("합격여부 : "+result);
		
		//
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		result = "";

		if(num % 2==0){
			result = "짝수";
		}else{
			result = "홀수";
		}

		System.out.println("입력한 정수 : "+ num + "," + result);

		String res=(num % 2==0)? "짝수":"홀수";
		System.out.println("\n삼항연산자 이용 결과=>"+ res);
	}

}
