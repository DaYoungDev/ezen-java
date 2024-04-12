package com.day9;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// 객체 생성 + 메소드 호출
		Student s1 = new Student("홍길동", 2012001);
		s1.showInfo();
		
		// 객체 생성 + 배열 저장 + for 메소드 호출
		Student[] studentList = new Student[3];
		Student s2 = new Student("김연아", 2012002);
		Student s3 = new Student("유재석", 2012003);
		Student s4 = new Student("김유정", 2012004);
		studentList[0] = s2;
		studentList[1] = s3;
		studentList[2] = s4;
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].showInfo();
		}
		
		// 사용자에게 입력받아서 객체 생성 + 배열저장 + for 메소드 호출
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < studentList.length; i++) {
			System.out.println("학생의 이름과 학번을 입력하세요");
			String name = sc.next();
			int id = sc.nextInt();
			
			studentList[i] = new Student(name, id);
		}
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].showInfo();
		}
		
		// 확장 for
		System.out.println("확장 for 사용문");
		for(Student s : studentList) {
			s.showInfo();
		}
	}

}
