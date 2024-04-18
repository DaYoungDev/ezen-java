package com.day14;

import java.util.Scanner;

public class TryCatchTest1 {
	
	public static int calc(int x, int y) {
		int result = x % y;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String pNumber = sc.next();
		try {
			if(pNumber.length() != 13) {
				throw new Exception("13자리를 입력하세요");
			} else {
				System.out.println("주민번호 : " + pNumber);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
		
		System.out.println("숫자를 두 개 입력하세요");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		try {
			if(y == 0) {
				throw new Exception("제수가 0이 되면 안됩니다.");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(x + " % " + y + " = " + calc(x,y));
	}

}
