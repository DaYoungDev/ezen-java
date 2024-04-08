package com.day7;

import java.util.Scanner;

public class DailyTest {

	public static void main(String[] args) {
		long[] arr = new long[]{(long)10.0, (long)10.1, (long)10.2};
		arr[0] = (long)10.0;
		arr[1] = (long)10.1;
		arr[2] = (long)10.2;
		
		float[] arr2 = new float[] {10.1f, 10.2f, 10.3f, 10.4f};
		float sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		float avg = sum / arr2.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		Scanner sc = new Scanner(System.in);
		String[] arr3 = new String[5];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("문자를 입력하세요");
			arr3[i] = sc.nextLine();
		}
		for(int j = 0; j < arr3.length; j++) {
			System.out.println(arr3[j]);
		}
		
		float[][] arr4;
		arr4 = new float[3][2];
		arr4[0][0] = 1.1f;
		arr4[0][1] = 1.2f;
		arr4[1][0] = 1.3f;
		arr4[1][1] = 1.4f;
		arr4[2][0] = 1.5f;
		arr4[2][1] = 1.6f;
		
		float[][] arr5 = new float[][]{{1.1f, 1.2f},{1.3f, 1.4f},{1.5f, 1.6f}};
		
		for(int i = 0; i < arr5.length; i++) {
			for(int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
