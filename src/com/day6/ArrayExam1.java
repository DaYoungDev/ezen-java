package com.day6;

public class ArrayExam1 {

	public static void main(String[] args) {
		// 1. float 배열 선언 후 출력
		float [] arrFloat;
		arrFloat = new float[3];
		arrFloat[0] = 12.5f;
		arrFloat[1] = -24.3f;
		arrFloat[2] = 0.76f;
		
		for(int i = 0; i < arrFloat.length; i++) {
			System.out.println(arrFloat[i]);
		}
		
		// 2. String 배열에 넣고 출력
		String [] arrName = new String[2];
		arrName[0] = "홍길동";
		arrName[1] = "김바다";
		
		for(int i = 0; i < arrName.length; i++) {
			System.out.println(arrName[i]);
		}
		
		// 3. double 배열 선언
		double [] arrDouble = new double[] {3.14, 6.82, 306.0, 120.3};
		double sum = 0;
		
		for(int i = 0; i < arrDouble.length; i++) {
			sum += arrDouble[i];
		}
		
		System.out.println("총점 : " + sum + ", 평균 : " + (sum / arrDouble.length));
	}

}
