package com.hw.day5;

import java.io.IOException;
import java.util.Scanner;

public class MethodHw2 {
	public static int convToInt(char ch){
		int result = ch-48;  //ch-'0'

		return result;
	}

	public static void printTriangle(int count){
		for (int i=0;i<count ;i++ ){
			for (int j=0;j<i ;j++ )	{
				System.out.print("A");
			}//for
			System.out.println("B");
		}//for
	}

	public static void printTriangle2(int count){
		for (int i=0;i<count ;i++ )	{
			for (int j=0;j<=i ;j++ ){				
				if(j==i)	
					System.out.print("B");
				else 
					System.out.print("A");
			}//for
			System.out.println();
		}//for
	}
	
	public static void printNumber() {
		//7. 5*5 사각형 안에 숫자가 차례대로 들어가도록 출력
		for (int i=1;i<26 ;i+=5 ){ //1, 6, 11, 16, 21
			for (int j=0; j<5; j++){ //0,1,2,3,4
				System.out.print(i+j +"\t");
			}
			System.out.println();
		}//바깥for

		System.out.println();
		int num=0;
		for (int i=0;i<5 ;i++ ){
			for (int j=0;j<5 ;j++ ){
				System.out.print(++num +"\t");
			}
			System.out.println();
		}

		System.out.println();
		num=0;
		for (int i=0;i<25 ;i++ ){
			System.out.print(++num +"\t");
			if(num%5==0) System.out.println();
		}

		System.out.println();		
		for (int i=1;i<=25 ;i++ ){
			System.out.print(i +"\t");
			if(i%5==0) System.out.println();
		}

	}
	
	public static int sumNumber(int num1, int num2) {
		int start=0, end=0;
		/*
		if (num1>num2){
			start=num2;
			end=num1;
		}else{
			start=num1;
			end=num2;
		}

		int sum=0;
		for (int i=start;i<=end ;i++ ){
			sum+=i;
		}//for
		*/
		
		//swap-서로 바꾸다
		int temp=0;
		if (num1>num2){
			temp=num1;
			num1=num2;
			num2=temp;
		}

		int sum=0;
		for (int i=num1;i<=num2 ;i++ ){
			sum+=i;
		}//for
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("0~9 사이의 숫자를 입력하세요.");
		char ch=(char)System.in.read();
		int n=convToInt(ch);
		System.out.println(ch+" => "+n);
		System.out.println(n+" * 100 = " + n*100);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n반복 횟수를 입력하세요");
		int count = sc.nextInt();
		printTriangle(count);
		printTriangle2(count);
		
		printNumber();
		
		System.out.println("\n두 개의 정수를 입력하세요");
		int start =  sc.nextInt();
		int end =  sc.nextInt();
		
		int sum = sumNumber(start, end);
		System.out.println("\n두 수사이의 정수의 합:"+sum);

		
	}
	
}
