package com.day6;

import java.util.Arrays;

public class EachTest {

	public static void main(String[] args) {
		/*
		 확장 for문
		 - 특정 집합(배열이나 컬렉션)의 요소들을 반복처리할 때 사용
		 - 데이터가 있는 만큼 반복
		 
		 for(타입변수 : 배열){
		 	반복할 명령문;
		 }
		 */
		
		int[] arr = new int[3];
		arr[0] = 15;
		arr[1] = 33;
		arr[2] = 82;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n======확장for 이용");
		
		for(int n : arr) {
			System.out.println(n);
		}
		
		String[] lang = {"java", "c", "c++"};
		
		for(String s : lang) {
			System.out.println(s);
		}
		
		// 오름차순 정렬
		int[] arr2 = {10,5, 44, 55, 1000, 140, 3, 55};
		System.out.println("\n=====정렬 전 요소====");
		
		for(int n : arr2) {
			System.out.println(n + " ");
		}
		
		System.out.println("\n");
		
		// void java.util.Arrays.sort(int[] a)
		Arrays.sort(arr2); // 오름차순 정렬
		System.out.println("\n=====정렬 후=====");
		
		for(int n : arr2) {
			System.out.println(n + " ");
		}
		
		
	}

}
