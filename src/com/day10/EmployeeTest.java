package com.day10;

import java.util.Scanner;

class Employee{
	protected String name;
	
	Employee(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int findPay() {
		return 0;
	}
}

class Permanent extends Employee{
	private int basic;
	private int bonus;
	
	Permanent(String name, int basic, int bonus){
		super(name);
		this.basic = basic;
		this.bonus = bonus;
	}
	
	public int findPay() {
		return basic + bonus;
	}
}

class Temporary extends Employee{
	private int time;
	private int pay;
	
	Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}

	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int findPay() {
		return time * pay;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직<P>, 임시직<T>을 입력하세요");
		String check = sc.nextLine();
		
		if(check.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급여, 보너스를 입력하세요");
			String name = sc.nextLine();
			int basic = sc.nextInt();
			int bonus = sc.nextInt();
			
			Permanent p = new Permanent(name, basic, bonus);
			System.out.println("======================");
			System.out.println("고용형태 : 고용직");
			System.out.println("이름 : " + p.getName());
			System.out.println("급여 : " + p.findPay());
		}
		else if(check.equalsIgnoreCase("T")) {
			System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
			String name = sc.nextLine();
			int pay = sc.nextInt();
			int time = sc.nextInt();
			
			Temporary t = new Temporary(name, time, pay);
			System.out.println("======================");
			System.out.println("고용형태 : 일용직");
			System.out.println("이름 : " + t.getName());
			System.out.println("급여 : " + t.findPay());
			
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

}
