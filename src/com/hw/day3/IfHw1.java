package com.hw.day3;

import java.util.Scanner;

public class IfHw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num=sc.nextInt();

		String result="";  
		if(num>0){
			result="양수";
		}else if (num==0){
			result="0";
		}else{
			result="음수";
		}//end of if

		System.out.println(num +" => " + result +"입니다");

		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		int pw = sc.nextInt();		
		String login = "";

		if(id.equals("hong") && pw==1234){
			login = "로그인 되었습니다";
		}else{
			login = "아이디나 비밀번호가 틀렸습니다";
		}

		System.out.println(login);

		
	}

}
