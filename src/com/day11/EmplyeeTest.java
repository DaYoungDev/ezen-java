package com.day11;

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
	protected int basic;
	protected int bonus;
	
	Permanent(String name, int basic, int bonus){
		super(name);
		this.basic = basic;
		this.bonus = bonus;
	}
	
	public int findPay() {
		return basic + bonus;
	}
}

class SalesPerson extends Permanent{
	private int earnings;
	private static final double RATE = 0.15;
	
	SalesPerson(String name, int basic, int bonus, int earnings){
		super(name, basic, bonus);
		this.earnings = earnings;
	}

	public int getEarnings() {
		return earnings;
	}
	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
	
	public int findPay() {
		return super.findPay() + (int)(earnings * RATE);
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

public class EmplyeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직<P>, 임시직<T>, 판매직<S>을 입력하세요");
		String type = sc.nextLine();
		
		Employee e = new Employee(null);
		
		if(type.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급여, 보너스를 입력하세요");
			String name = sc.nextLine();
			int basic = sc.nextInt();
			int bonus = sc.nextInt();
			
			e = new Permanent(name, basic, bonus);
			System.out.println("======================");
			System.out.println("고용형태 : 고용직");
			System.out.println("이름 : " + e.getName());
			System.out.println("급여 : " + e.findPay());
		}else if(type.equalsIgnoreCase("T")) {
			System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
			String name = sc.nextLine();
			int pay = sc.nextInt();
			int time = sc.nextInt();
			
			e = new Temporary(name, time, pay);
			System.out.println("======================");
			System.out.println("고용형태 : 일용직");
			System.out.println("이름 : " + e.getName());
			System.out.println("급여 : " + e.findPay());
		} else if(type.equalsIgnoreCase("S")) {
			System.out.println("이름, 기본급여, 판매수익을 입력하세요");
			String name = sc.nextLine();
			int basic = sc.nextInt();
			int bonus = 0;
			int earnings = sc.nextInt();
			
			e = new SalesPerson(name, basic, bonus, earnings);
			System.out.println("======================");
			System.out.println("고용형태 : 판매직");
			System.out.println("이름 : " + e.getName());
			System.out.println("급여 : " + e.findPay());
		}
	}

}
