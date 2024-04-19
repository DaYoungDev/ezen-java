package com.hw.day4;

import java.util.Scanner;

public class ForHw1 {
	public static void main(String[] args) {
		System.out.println("7의 배수이거나 9의 배수");
		for(int i=1;i<100;i++){
			if(i%7==0 || i%9==0){
					System.out.print(i+"\t");
			}
		}

		System.out.println("\n\n7의 배수이거나 9의 배수");		
		int cnt = 0;
		for(int i=1;i<100;i++){
			if(i%7==0 || i%9==0){
					System.out.print(i+"\t");
					cnt++; //1  2  3  4  5
					if (cnt % 5==0){
						System.out.println();						
					}
			}			
		}

		System.out.println("\n==============================\n");
		
		cnt = 0;
		for(int i=1;i<100;i++){
			if(i%7==0 || i%9==0){
					System.out.print(i+"\t");
					if(++cnt % 5 ==0) 
						System.out.println();
			}
		}//for
		System.out.println();
		
		//
		for(int i=1; i<=5; i++){
			for(int j=1; j<=3; j++){
				System.out.print("*");
			}
			System.out.println();
		}//for
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}//for

		System.out.println();

		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}//for

		System.out.println();
		System.out.println("1부터 10까지의 합");
		for(int i=1; i<=10; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
				if(j<i)	System.out.print("+");
			}
			System.out.println();
		}//for
		
		
		//
		int sum=0;
		for (int i=1;i<=20 ;i++ ){
			if (i%2!=0 && i%3!=0){
				sum+=i;
			}
		}//for
		System.out.println(sum+"\n");
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(i+j==6)
					System.out.println(i+"+"+j+"="+(i+j));
			}
		}
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("4자리 이상의 숫자를 입력하세요");
		String str =  sc.nextLine();
		//String str = "12345";
		sum = 0;
		//char charAt(int index)
		for(int i=0; i < str.length(); i++) {  //5
			sum += str.charAt(i) - '0';  //'1' => 49-48 =1
		}
		System.out.println("sum="+sum+"\n");

		System.out.println("4자리 이상의 숫자를 입력하세요");
		int num =  sc.nextInt();
		//int num = 12345;
		sum = 0;
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("sum="+sum);

		System.out.println("\n값을 입력하세요");
		String value =  sc.nextLine();
		//String value = "12h34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
			
		for(int i=0; i < value.length() ;i++) { //5
			ch = value.charAt(i);
			if(!(ch>='0' && ch<='9')) {
				isNumber = false; //
				break;
			}
		}

		str="";
		if (isNumber) {
			str=value+"는 숫자입니다.";
		} else {
			str=value+"는 숫자가 아닙니다.";
		}
		System.out.println(str);

		
		
	}

}
