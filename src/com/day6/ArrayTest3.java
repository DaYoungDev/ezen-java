package com.day6;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// for문 안에서 배열 초기화 하기
		int [] arr = new int[4];
		/*
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		*/
		
		// 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 5;
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 사용자로부터 실수 4개 입력받아서 배열에 넣기
		Scanner sc = new Scanner(System.in);
		
		double[] dArr = new double[4];
		
		/*
		dArr[0] = sc.nextDouble();
		dArr[1] = sc.nextDouble();
		dArr[2] = sc.nextDouble();
		dArr[3] = sc.nextDouble();
		*/
		
		// 초기화
		System.out.println("실수 4개를 입력하세요");
		for(int i = 0; i < dArr.length; i++) {
			dArr[i] = sc.nextDouble();
		}
		
		// 출력
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}

}
