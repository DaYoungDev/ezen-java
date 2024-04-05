package com.day6;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 배열에 저장된 최대값 구하기
		int[] arr = {10, 57, 19, 35, 77, 26};
		int max = arr[0]; // 10
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		
		// public static long round(double a)
		// 반올림
		double d = 84.867; // => 84.9로 반올림
		long a = Math.round(d);
		System.out.println(a);
		
		// 848.67 로 만들기 = > d * 10
		double g = Math.round(d * 10); // round(848.67) => 849
		
		//  849 => 84.9 => g / 10
		g = Math.round(d * 10)/ 10.0; // 84.9
		System.out.println(g);
		
		g = (int)(d * 10) / 10.0;
		System.out.println(g); // 84.8
		
	}

}
