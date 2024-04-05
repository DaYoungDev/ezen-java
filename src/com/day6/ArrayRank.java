package com.day6;

public class ArrayRank {

	public static void main(String[] args) {
		// 2차원 배열
		
		// 1.
		// 배열 선언
		int[][] arr;
		
		// 메모리 할당
		arr = new int [2][3]; // 2행 3열
		
		// 초기화
		arr[0][0] = 10;
		arr[0][1] = 30;
		arr[0][2] = 17;
		arr[1][0] = 4;
		arr[1][1] = 8;
		arr[1][2] = 3;
		
		// 2. 배열 선언과 메모리 할당을 동시에
		int[][] arr2 = new int[3][2]; // 3행 2열
		
		// 초기화
		arr2[0][0] = 5;
		arr2[0][1] = 2;
		arr2[1][0] = 1;
		arr2[1][1] = 9;
		arr2[2][0] = 7;
		arr2[2][1] = 4;
		
		// 3. 모두 동시에
		int[][] arr3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // 3행 4열
		
		// 출력
		for(int i = 0; i < arr.length; i++) { // 행
			for(int j = 0; j < arr[i].length; j++) { // 열
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("행의 개수 : " + arr.length);
		System.out.println("열의 개수 : " + arr[0].length);
 	}

}
