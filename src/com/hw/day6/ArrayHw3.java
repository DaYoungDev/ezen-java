package com.hw.day6;

import java.util.Scanner;

public class ArrayHw3 {

	public static void main(String[] args) {
		int[][] arr = {			
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
				{45, 45,45, 45,45}
		};

		int total = 0;
		float average = 0;
		for(int i=0; i < arr.length;i++) {
			for(int j=0; j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				total += arr[i][j];
			}
			System.out.println();
		}

		average = (float)total /(arr.length * arr[0].length);

		System.out.println("\n총합 : "+total);
		System.out.println("평균 : "+average);

		//
		// 큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
		int[] coinUnit = {500, 100, 50, 10};

		Scanner sc = new Scanner(System.in);	
		System.out.println("금액을 입력하세요");
		int money= sc.nextInt();

		//int money = 3870;
		System.out.println("money="+money+"\n");

		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
			money = money%coinUnit[i];

		}//for

		//
		/*
		if(ch>='a' && ch <='z') {
			result += abcCode[ch-'a'];
		} else if(ch>='0' && ch <='9') {
			result += numCode[ch-'0'];
		}*/

		//
		int fstScore=0;//1등 점수
		int sndScore=0; //2등 점수

		int[] stArr = new int[10];
		for (int i=0;i<stArr.length ; i++){
			System.out.println("점수를 입력하세요");
			stArr[i] = sc.nextInt();

			if (stArr[i]>fstScore){
				sndScore = fstScore;
				fstScore=stArr[i];
				//}else if(stArr[i]<fstScore && stArr[i]>sndScore){
			}else if(stArr[i]>sndScore){ //stArr[i]==fstScore 경우도 포함
				sndScore=stArr[i];
			}
		}//for
		System.out.println("A학점은 "+ sndScore +"점 이상이 되어야 합니다.\n");



	}

}
