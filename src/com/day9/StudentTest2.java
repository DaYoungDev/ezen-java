package com.day9;

import java.util.Scanner;

public class StudentTest2 {

	static Scanner sc = new Scanner(System.in);
	static int index = 0;
	static Student[] arr = new Student[100];
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("1.저장 2.전체학생조회 3.종료 선택");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("이름, 학번을 입력하세요");
				String name = sc.next();
				int no = sc.nextInt();
				arr[index] = new Student(name, no);
				index++;
			} else if(choice == 2) {
				for(int i = 0; i < index; i++) {
					arr[i].showInfo();
				}
			} else if(choice == 3) {
				System.out.println("학생시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하였습니다.");
			}
		}
	}

}
