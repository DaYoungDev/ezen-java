package com.day5;

import java.util.Scanner;

public class MethodExam4 {
	public static int rnd () {
		int answer = (int)(Math.random() * 100 + 1);
		return answer;
	}

	public static int rnd2 (int start, int end) {
		// swap star가 end보다 더 큰수를 넣을 경우 위치를 바꿔야한다.
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		int answer = (int)(Math.random() * (end - start + 1) + start);
		return answer;
	}
	public static void main(String[] args) {
		/*
		 컴퓨터는 1~100 중 random하게 하나의 숫자를 뽑는다 => 메서드로 만들기
       사용자가 숫자를 입력
		 맞추면 “정답입니다”
       틀리면 “좀 더 작은 수를 입력하세요”, “큰 수를 입력하세요”
       입력기회를 4회로 제한
		 */
		
		// public static double random()
		/*
		 0.0 ~ 1.0 범위의 임의의 double값을 반환
		 0.0 <= x < 1.0
		 
		 ex) 1 ~ 100 사이의 임의의 정수 구하기
		 1. 각 변에 100을 곱한다
		 	0.0 * 100 <= x < 1.0 * 100
		 2. 각 변에 1을 더한다
		 	0.0 + 1 <= x < 100.0 + 1
		 3. int형으로 형변환한다
		 	1 <= x < 101
		 	
		 	int num = (int)(Math.random() * 100 + 1);
		 */
		Scanner sc = new Scanner(System.in);
		int answer = rnd2(1, 100);
		System.out.println(answer);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("1부터 100사이의 숫자를 입력하세요");
			int pick = sc.nextInt();
			
//			if(i == 3) {
//				if(answer == pick) {
//					System.out.println("정답입니다.");
//					break;
//				} else {
//					System.out.println("실패! 다음기회에");
//					break;
//				}
//				
//			}
//			
//			if(answer > pick) {
//				System.out.println("큰 수를 입력하세요");
//			} else if (answer < pick) {
//				System.out.println("좀 더 작은 수를 입력하세요");
//			} else {
//				System.out.println("정답입니다.");
//				break;
//			}  
			
			// 위 코드 간결화
			if(answer == pick) {
				System.out.println("정답입니다.");
				break;
			} 
			
			if(i != 3) {
				if(answer > pick) {
					System.out.println("큰 수를 입력하세요");
				} else {
					System.out.println("좀 더 작은 수를 입력하세요");
				}
			} else {
				System.out.println("실패! 다음기회에");
			}
		}
		System.out.println("===== end =====");
		
	}

}
