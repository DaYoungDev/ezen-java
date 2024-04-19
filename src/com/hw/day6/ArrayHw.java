package com.hw.day6;

import java.util.Scanner;

public class ArrayHw {
	public static void main(String[] args) {
		//
		String[] season = new String[4];
		season[0] = "봄";
		season[1] = "여름";
		season[2] = "가을";
		season[3] = "겨울";

		for(int i = 0; i<season.length; i++) {
			System.out.println("season[" + i + "] = " + season[i]);
		}

		System.out.println();

		//확장 for문
		int index = 0;
		for(String a : season) {
			System.out.println("season[" + index++ + "] = " + a);
		}
		System.out.println();
		
		//
		double[][] dArr = new double[3][2];
		dArr[0][0] = 10.1;
		dArr[0][1] = 10.2;
		dArr[1][0] = 10.3;
		dArr[1][1] = 10.4;
		dArr[2][0] = 10.5;
		dArr[2][1] = 10.6;

		for(int i = 0; i<dArr.length; i++) {
			for(int j = 0; j<dArr[i].length; j++) {
				System.out.println("dArr[" + i + "][" + j + "]=" + dArr[i][j] );
			}
		}
		System.out.println();

		//double[][] twoArr={{10.1, 10.2},{10.3, 10.4},{10.5, 10.6}};

		double[][] twoArr=new double[3][2];

		int n=0;
		for (int i=0;i<twoArr.length ;i++ )	{
			for (int j=0;j<twoArr[i].length ;j++ ){
				twoArr[i][j]=10+(++n/10.0);
			}
		}//for
		
		for (int i=0;i<twoArr.length ;i++ )	{
			for (int j=0;j<twoArr[i].length ;j++ ){
				System.out.println("twoArr["+i+"]["+j+"]="+twoArr[i][j]);
			}
		}//for
				
		int row = twoArr.length;  //행
		int col = twoArr[0].length; //열
		double[] oneArr = new double[row * col];

		for (int i=0;i<row ;i++ ){
			for (int k=0;k<col ;k++ ){
				oneArr[col * i+k] = twoArr[i][k];
				//[column의 크기*row+column] <= [row][column]
			}
		}//for

		System.out.println();
		for (double num: oneArr){
			System.out.print(num  +"\t");
		}
		//
		/*dArr[i] *= (1+interest/100.0);

		a*=(1+이율/100);
		a=a*(1+이율/100);
		a=a+a*이율/100;
		*/

		System.out.println("\n");
		Scanner sc = new Scanner(System.in);
		double[] dArr2 = new double[5];
		for (int i=0;i<dArr2.length ;i++ ){
			System.out.println("잔고를 입력하세요");
			dArr2[i] = sc.nextDouble();
		}//for
				
		System.out.println("이자율을 입력하세요");
		double interest= sc.nextDouble();

		for (int i=0;i<dArr2.length ;i++ ){			
			dArr2[i] *= (1+interest/100.0);
			System.out.println("이자가 반영된 잔고 조회 : " 
				+ Math.round(dArr2[i]));
		}//for
		
		//
		int[] num = new int[8];
		String str ="";

		while(true)	{
			System.out.println("복권판매점 번호(1~8)와 복권 판매량을 입력하세요.(끝낼때는 Q)");
			str = sc.next();
			
			if (str.equalsIgnoreCase("Q")) break;	
			
			int gNo = Integer.parseInt(str);
			int quantity = sc.nextInt();
			
			num[gNo-1] += quantity;

			System.out.println("그룹번호 : " + gNo 
					+ ", 판매량:" + num[gNo-1]);
		}//while
		
	}

}
