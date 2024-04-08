package com.day7;

public class Programmer {

	// 필드
	private String name;
	private String language;
	private int career;
	
	// 생성자
	Programmer(String name, String language, int career){
		this.name = name;
		this.language = language;
		this.career = career;
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	
	// 메소드
	// 출력 메소드 정의
	public void printInfo() {
		System.out.println("이름 :" + name);
		System.out.println("개발언어 :" + language);
		System.out.println("개발경력 :" + career);
	}
	
	public void work() {
		System.out.println("프로그래밍을 합니다.");
	}
}
