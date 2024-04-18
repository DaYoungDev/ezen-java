package com.day14.baseball;

import java.util.Scanner;

class MyException extends Exception{

	public MyException(String msg) {
		super(msg);
	}

}

public class BaseBallTest {
	public static int[] makeArr(int a, int b, int c) throws MyException{
		int[] choiceArr = new int[3];
		if(a == b || a == c || b == c) {
			throw new MyException("중복된 숫자를 선택하였습니다. 다시 선택하세요.");
		}
		choiceArr[0] = a;
		choiceArr[1] = b;
		choiceArr[2] = c;

		return choiceArr;
	}

	public static void main(String[] args) throws MyException{
		Scanner sc = new Scanner(System.in);
		int[] hArr = new int[3];
		Pitcher p = new Pitcher();
		p.random();
		int[] numberArr = p.getnumberArr();
		for(int j = 0; j < numberArr.length; j++) {
			System.out.print(numberArr[j]);
		}
		Umpire u = new Umpire();
		BallCount bCount = null;

		for(int i = 1; i <= 10; i++) {
			try{
				System.out.println("다른 세 수를 입력하세요(0~9)");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();

				hArr = makeArr(a, b, c);
				bCount = u.count(numberArr, hArr);

				if(bCount.getStrike() != 3){
					System.out.println("반복회수 : " + i + ", " 
							+ bCount.getStrike() + " Strike!! " 
							+ bCount.getBall() + " Ball!");
					if(i == 10) {
						System.out.println("You Lose, Picher is");
						System.out.println(numberArr[0] + "\t" 
								+numberArr[1]+ "\t" + numberArr[2]+ "\t");
						
						System.out.println("계속하시겠습니까? (y/n)");
						String str = sc.next();
						if(str.equalsIgnoreCase("y")) {
							i = 1;
							p.random();
							numberArr = p.getnumberArr();
							continue;
						} else if(str.equalsIgnoreCase("n")){
							System.out.println("프로그램을 종료합니다.");
							break;
						}
					}
				} else {
					System.out.println("you win in " + i);
					System.out.println("계속하시겠습니까? (y/n)");
					String str = sc.next();
					if(str.equalsIgnoreCase("y")) {
						i = 1;
						p.random();
						numberArr = p.getnumberArr();
						continue;
					} else if(str.equalsIgnoreCase("n")){
						System.out.println("프로그램을 종료합니다.");
						break;
					}

				}

			} catch(MyException e) {
				System.out.println(e.getMessage());
				i--;
				continue;
			}
		}



	}

}
