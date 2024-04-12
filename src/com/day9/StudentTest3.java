package com.day9;

import java.util.Scanner;

class StudentManager{
	Scanner sc = new Scanner(System.in);
	Student[] stList = new Student[100];
	int idx=0;
	
	public void showData() {
		System.out.println("\n=====학생 리스트=======");
		for(int i=0;i<idx;i++) {
			stList[i].showInfo();
		}
	}

	public void inputData() {
		System.out.println("이름, 학번을 입력하세요");
		String name = sc.next();
		int idNo = sc.nextInt();
		
		stList[idx++]= new Student(name, idNo);	
		
	}
}

public class StudentTest3 {

	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.저장 2.전체학생 조회 3.종료 선택");
			int type=sc.nextInt();
			
			switch (type) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.showData();
				break;
			case 3:
				System.out.println("종료합니다.");
				System.exit(0);
			default:
				System.out.println("다시 입력");
				continue;
			}
		}//while
		
	}

}
