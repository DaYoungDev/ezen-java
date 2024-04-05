package com.day6;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 학생들 점수 처리
		int[] arr = {97, 75, 70, 90, 60, 85, 75, 100};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n=====5점 가산 후 점수 ======");
		for(int i = 0; i < arr.length; i++) {
			// 5점 가산
			arr[i] +=5;
			
			if(arr[i] > 100) {
				arr[i] = 100;
			}
			
			System.out.println(arr[i]);
		}
		
		int a = 90;
		// a변수의 값 5증가
		a += 5;
	}

}
