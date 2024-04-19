package com.hw.day5;

import java.util.Scanner;

public class MethodHw1 {
	//윤년인지, 평년인지 구하는 메서드
	public static String getLeapYear(int year){
		/*
				윤년
				1) 400으로 나누어 떨어지면 윤년 
				또는
				2) 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
		 */
		String result="";
		if (year%400==0 || (year%4==0 && year%100!=0)){
			result="윤년";
		}else{
			result="평년";
		}

		return result;
	}
	
	public static boolean getLeapYear2(int year){
		boolean result=false;  //평년
		if (year%400==0 || (year%4==0 && year%100!=0)){
			result=true; //윤년
		}
		return result;
	}

	//홀수인지 짝수인지 구하는 메서드 만들기
	public static String  getOdd(int num){
		String result = "";
		if(num%2==0){
			result="짝수";
		}else{
			result="홀수";
		}//if

		return result;
	}

	//주민번호를 이용하여 남자인지, 여자인지 성별 구하는 메서드
	public static String  getGender(int gender){
		String result = "";
		if(gender==1 || gender==3){
			result="남자";
		}else{
			result="여자";
		}//if

		return result;
	}		

	public static int fibonacci(int num){
		if (num==0)
			return 0;
		else if (num==1)
			return 1;
		else
			return fibonacci(num-2)+fibonacci(num-1);  //f(0)+f(1), f(1)+f(2)
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("연도를 입력하세요");
			int y = sc.nextInt();
			String result = getLeapYear(y);
			System.out.println(y + "=> " + result);

			if(getLeapYear2(y)) {
				System.out.println(y + "=> 윤년");
			}else {
				System.out.println(y + "=> 평년");				
			}
			
			System.out.println("\n숫자를 입력하세요");
			int n = sc.nextInt();
			result = getOdd(n);
			System.out.println(n + "=> " + result);

			System.out.println("\n주민번호의 성별을 입력하세요(1,2,3,4)");
			int g = sc.nextInt();
			result = getGender(g);
			System.out.println(g + "=> " + result);

			System.out.println("\n끝내려면 Q를 입력!!");
			sc.nextLine();
			String quit=sc.nextLine();
			if (quit.equalsIgnoreCase("Q")){
				break;
			}

		}//while

		//
		for (int i=0;i<10 ; i++){
			int num = fibonacci(i);
			System.out.print(num);
			if (i!=9)  System.out.print(", ");
		}
		
	}
}
