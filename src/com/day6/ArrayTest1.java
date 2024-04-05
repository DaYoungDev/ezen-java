package com.day6;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*
		 배열
		 - 같은 타입의 데이터를 여러 개 저장할 수 있는 저장소
		 - 참조형
		 - 배열의 이름에는 참조값(주소)이 들어감
		 - 인덱스(index, 첨자)로 액세스할 수 있으므로 반복적인 처리가 효율적임
		 
		 변수 - 데이터가 하나만 들어감
		 배열 - 여러개의 데이터를 저장할 수 있음
		 */
		
		// 기본형
		int a;
		a = 7;
		
		// 참조형
		Scanner sc = new Scanner(System.in);
		String s = new String("hello");
		
		// 1. 배열선언과 메모리할당, 초기화를 모두 따로
		// 1-1 배열 선언
		int[] arr;
		
		// 1-2 메모리 할당
		arr = new int[3];
		
		// 1-3 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 70;
		
		// 배열요소의 값 출력
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 2. 배열선언과 메모리 할당을 동시에
		int[] arr2 = new int[2];
		
		// 초기화
		arr2[0] = 12;
		arr2[1] = 22;
		
		// 3. 배열선언과 메모리 할당, 초기화를 동시에
		int[] arr3 = {7, 8, 9, 2};
		
		//
		int[] arr4 = new int[] {5, 6, 4, 1};
		
		int[] arr5;
		arr5 = new int[] {4, 3, 1, 9};
		
		// 잘못 사용된 경우
//		int[] arr6;
//		arr6 = new int[3];
//		arr6 = {1, 2, 3}; // error
		
		// 배열의 인덱스는 0부터 시작
		// 초기화하지 않아도 default값으로 초기화 됨
		int[] arr7 = new int[3]; // index는 0~2
		
		System.out.println("배열의 크기 : " + arr7.length); // 3
		for(int i = 0; i < arr7.length; i++) { // 3번 반복
			System.out.println(arr7[i]);
		}
		
		System.out.println(arr7); // 배열이름에는 주소가 들어감
		arr7[3] = 55; // 실행에러 : ArrayIndexOutOfBoundsException
		// Index 3 out of bounds for length 3
	}

}
