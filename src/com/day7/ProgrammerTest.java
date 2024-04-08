package com.day7;

import java.util.Scanner;

public class ProgrammerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개발언어, 개발 경력을 입력하세요");
		String name = sc.nextLine();
		String language = sc.nextLine();
		int career = sc.nextInt();
		
		Programmer pro = new Programmer(name, language, career);
		pro.printInfo();
		pro.work();
		System.out.println();
		
		
		pro.setName("이하늘");
		pro.setLanguage("java");
		pro.setCareer(2);
		
		System.out.println("이름 :" + pro.getName());
		System.out.println("개발언어 :" + pro.getLanguage());
		System.out.println("개발경력 :" + pro.getCareer());
		pro.work();
	}

}
