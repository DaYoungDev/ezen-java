package com.hw.day6;

import java.util.Scanner;

public class ArrayHw2 {
	public static void main(String[] args){	
		//5개 정수를 담는 배열
		int[] num = new int[5];
		System.out.println("5개의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<5 ;i++ ){ //5번 반복
			//사용자가 입력한 숫자 5개를 배열에 넣는다			
			num[i] = sc.nextInt();
		}
		
		findMax(num);

		//출력하기
		System.out.println("===내림차순으로 정렬===");
		for (int i=0;i<num.length ;i++ ){
			System.out.print(num[i]+"\t");
		}

	}//main	

	//call by reference
	public static void findMax(int[] num)	{
		for (int i=0;i<num.length ;i++ ){ //5번 반복
			for (int k=0;k<i ;k++ ){ //2번째 배열(num[1])의 값부터 앞의 값들과 차례로 비교
				if (num[i] > num[k]){  //더 큰 값을 앞의 배열로 이동
					//swap, 두 값을 서로 바꾼다
					int temp = num[k]; 
					num[k] = num[i];
					num[i] = temp;
				}
			}
		}//for
	}
	
}
