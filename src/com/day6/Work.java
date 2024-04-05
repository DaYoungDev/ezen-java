package com.day6;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Work {
	public static void main(String[] args) throws IOException {
		// 1. 계절을 요소로 갖는 배열 선언하기
		String[] season = new String[4];
		season[0] = "봄";
		season[1] = "여름";
		season[2] = "가을";
		season[3] = "겨울";
		for(int i = 0; i < season.length; i++) {
			System.out.println("season[" + i + "]=" + season[i]);
		}
		System.out.println();
		
		// 2. double 2차원 배열[3][2]
		double[][] dArr = new double[3][2];
		
		dArr[0][0] = 10.1;
		dArr[0][1] = 10.2;
		dArr[1][0] = 10.3;
		dArr[1][1] = 10.4;
		dArr[2][0] = 10.5;
		dArr[2][1] = 10.6;
		
		double index = 10.1;
		/*
		 2-1 for문으로 초기화하기
		for(int i = 0; i < dArr.length; i++) {
			for(int j = 0; j < dArr[i].length; j++) {
				dArr[i][j] = index;
				index += 0.1;
			}
		}
		*/
		for(int i = 0; i < dArr.length; i++) {
			for(int j = 0; j < dArr[i].length; j++) {
				System.out.println("dArr[" + i +"][" + j +"]=" + dArr[i][j]);
			}
		}
		System.out.println();
		
		// 3. 2차원 배열을 1차원으로 바꾸기
		double[] changeArr = new double[dArr[0].length * dArr.length];
		for(int i = 0; i < dArr.length; i++) {
			for(int j = 0; j < dArr[i].length; j++) {
				changeArr[i * dArr[i].length + j] = dArr[i][j];
			}
		}
		
		for(int i = 0; i < changeArr.length; i++) {
			System.out.print(changeArr[i] + "\t");
		}
		System.out.println();
		
		
		// 4. 은행 이자 잔고 처리
		Scanner sc = new Scanner(System.in);
		double[] bank = new double[5];
		
		// 잔고 입력받기
		for(int i = 0; i < bank.length; i++) {
			System.out.println("잔고를 입력하세요");
			bank[i] = sc.nextDouble();
		}
		
		// 이자율 입력받기
		System.out.println("이자율을 입력하세요");
		double interest = sc.nextDouble() / 100;
		
		// 이자율 반영
		for(int i = 0; i < bank.length; i++) {
			bank[i] += Math.round(bank[i] * interest);
		}
		
		// 이자율 반영 출력
		for(int i = 0; i < bank.length; i++) {
			System.out.println("이자가 반영된 잔고 조회 : " + bank[i]);
		}
		System.out.println();
		
		// 5. [4][5] 2차원 배열 모든 값의 총합과 평균
		int[][] arr = new int[4][5];
		int sum = 0;
		
		// 초기화
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0) {
					arr[i][j] = 10;
				} else if(i == 1) {
					arr[i][j] = 20;
				} else if(i == 2) {
					arr[i][j] = 30;
				} else if(i == 3) {
					arr[i][j] = 45;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum / (arr.length * arr[0].length);
		System.out.println("평균 : " + avg);
		System.out.println();
		
		// 6. 대각선만 1출력하기
		int[][] cross = new int[3][3];
		for(int i = 0; i < cross.length; i++) {
			for(int j = 0; j < cross[i].length; j++) {
				if(i == j) {
					cross[i][j] = 1;
					System.out.print(cross[i][j] + "\t");
				} else {
					cross[i][j] = 0;
					System.out.print(cross[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < cross.length; i++) {
			for(int j = 0; j < cross[i].length; j++) {
				if((i + j) == (cross.length - 1) || i == j) {
					cross[i][j] = 1;
					System.out.print(cross[i][j] + "\t");
				} else {
					cross[i][j] = 0;
					System.out.print(cross[i][j] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 7. 복권 판매점
		int[] lottoStore = new int[8];
		while(true) {
			System.out.println("복권판매점 번호(1~8)와 복권 판매량을 입력하세요.(끝낼때는 q)");
			
			String store = sc.next();
			if(store.equalsIgnoreCase("q")) {
				System.out.println("입력을 중단합니다.");
				break;
			}
			int storeNum = Integer.parseInt(store);
			int sell = sc.nextInt();
			
			lottoStore[storeNum - 1] += sell;
			
			System.out.println("그룹번호 : " + store + ", 판매량 : " + lottoStore[storeNum - 1]);
		}
		System.out.println();
		
		// 8. 배열 내림차순 정렬
		int[] reverse = new int[5];
		System.out.println("5개의 숫자를 입력하세요");
		for(int i = 0; i < reverse.length; i++) {
			reverse[i] = sc.nextInt();
		}
		
		System.out.println("=====내림차순으로 정렬 ===");
		for(int i = 0; i < reverse.length; i++) {
			for(int j = 0; j< i; j++) {
				if(reverse[i] > reverse[j]) {
					int temp = reverse[i];
					reverse[i] = reverse[j];
					reverse[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i] + "\t");
		}
		
		
		// 9. 동전 지불
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 3870;
		System.out.println("\nmoney="+money+"\n");
		
		for(int i = 0; i < coinUnit.length; i++) {
			int result = money / coinUnit[i];
			money = money % coinUnit[i];
			System.out.println(coinUnit[i] + "원 : " + result);
		}
		System.out.println();
		
		// 10. 암호화
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*', 
			'(',')','-','_','+','=','|','[',']','{', 
			'}',';',':',',','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				int word = ch - 'a';
				result += abcCode[word];
			} else if(ch >= '0' && ch <= '9') {
				int word2 = ch - '0';
				result += numCode[word2];
			}
			
		}
		System.out.println("src:"+src); 
		System.out.println("result:"+result);
		System.out.println();
		
		// 11. 학점 A기준 받기
		int[] score = new int[10];
		for(int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하세요");
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);
		System.out.println("A학점은 " + score[score.length -2] +"점 이상이 되어야합니다.");
	}

}
