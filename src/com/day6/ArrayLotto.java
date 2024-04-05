package com.day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLotto {

	public static void main(String[] args) {
		// 로또 만들기 (배열)
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		
		while(true) {
			for(int i = 0; i < 6; i++) {
				lotto[i] = (int)(Math.random() * 45 + 1);
				
				// 중복검사
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--; // 중복된 데이터 값을 다시 뽑기 위해 1 감소
						break;
					}
				}
				
			}
			// 정렬
			Arrays.sort(lotto);
			
			// 출력
			for(int n : lotto) {
				System.out.print(n + "\t");
			}
			
			// 진행여부
			System.out.println("\n계속 하시겠습니까? (Y/N)");
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		
	}
}
