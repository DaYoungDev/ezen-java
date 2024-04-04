package com.day4;

public class ContinueTest1 {

	public static void main(String[] args) {
		/*
		 [1]break
		 	- switch와 반복문에서만 사용가능
		 	- 반복문을 빠져나감
		 [2]continue
		 	- 반복문안에서만 사용가능
		 	- 다음 반복위치로 이동
		 	- 반복을 한번 건너뛰고 다음 반복을 실행
		 	- 특정 값에 대한 처리를 제외하고자 할때 필요
		 [3]return
		 	- method의 실행을 종료하고 호출원으로 복귀함
		 */
		for(int i = 1;i <= 10; i++) {
			if(i == 5) continue;
			System.out.println("i = " + i);
		}
		
		System.out.println("\n=======");
		for(int i = 1;i <= 10; i++) {
			if(i == 5) break;
			System.out.println("i = " + i);
		}
		
		
		System.out.println("\n=======중첩 for : break =======");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 1) break;
				System.out.println("i = "+ i + ", j = " + j);
			}
		}
		
		System.out.println("\n=======중첩 for : continue =======");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 1) continue;
				System.out.println("i = "+ i + ", j = " + j);
			}
		}
	}

}
