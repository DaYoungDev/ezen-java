package com.day6;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 1. 사용자에게 횟수를 입력받고 배열의 요소를 넣고 출력
		// 출력할 때 기본 for, 확장 for
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 배열의 갯수를 입력하세요 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
		
		for(int n : arr) {
			System.out.println("arr[" + n + "] = " + n);
		}
		System.out.println();
		
		// 2. 5개의 정수를 요소로 갖는 배열 홀수만 값을 입력 + 확장 for 출력
		int[] arr2 = new int[5];
		
		// 초기화
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 2 + 1;
		}
		
		// 출력
		for(int n : arr2) {
			System.out.print(n + "\t");
		}
	}

}
