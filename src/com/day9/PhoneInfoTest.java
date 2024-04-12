package com.day9;

import java.util.Scanner;

public class PhoneInfoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] phoneArr = new PhoneInfo[100];
		int index = 0;
		
		
		while(true) {
			System.out.println("선택하세요");
			System.out.println("1.저장 2.조회 3.검색 4.삭제 5.종료");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("데이터 입력을 시작합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("전화번호 :");
				String number = sc.next();
				System.out.print("생년월일 :");
				String birth = sc.next();
				PhoneInfo p = new PhoneInfo(name, number, birth);
				
				phoneArr[index] = p;
				index++;
				
				System.out.println("데이터입력이 완료 되었습니다.");
			} 
			else if(choice == 2) {
				System.out.println("====전체 데이터 조회 ===");
				for(int i = 0; i < index; i++) {
					System.out.println("이름 : " + phoneArr[i].getName());
					System.out.println("전화번호 : " + phoneArr[i].getNumber());
					System.out.println("생년월일 : " + phoneArr[i].getBirth() + "\n");
				}
				System.out.println("============");
			}
			else if(choice == 3) {
				System.out.println("데이터 검색을 시작합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				for(int i = 0; i < index; i++) {
					if(phoneArr[i].getName().equals(name)) {
						System.out.println("이름 : " + phoneArr[i].getName());
						System.out.println("전화번호 : " + phoneArr[i].getNumber());
						System.out.println("생년월일 : " + phoneArr[i].getBirth() + "\n");
					}
				}
				System.out.println("데이터 검색이 완료되었습니다.");
			}
			else if(choice == 4) {
				System.out.println("데이터 삭제를 시작합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				for(int i = 0; i < index; i++) {
					if(phoneArr[i].getName().equals(name)) {
						for(int j = i; j < index -1; j++) {
							phoneArr[j] = phoneArr[j+1];
						}
						index--;
					}
				}
				System.out.println("삭제가 완료 되었습니다.");
			}
			else if(choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

}
