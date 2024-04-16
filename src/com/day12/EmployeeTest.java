package com.day12;

import java.util.Scanner;

abstract class Employee{
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
	
	abstract public int getPay();
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
}

class Permanent extends Employee{
	private int salary;
	private int bonus;
	
	Permanent(String name, int salary, int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getPay() {
		return salary + bonus;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("급여 : " + getPay());
	}
	public String getType() {
		return "고용직";
	}
}

class Temporary extends Employee{
	private int time;
	private int cost;
	
	Temporary(String name, int time, int cost){
		super(name);
		this.time = time;
		this.cost = cost;
	}

	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getPay() {
		return time * cost;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("급여 : " + getPay());
	}
	public String getType() {
		return "임시직";
	}
}


public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] eArr = new Employee[3];
		for(int i = 0; i < eArr.length; i++) {
			System.out.println("고용형태 - 고용직<P>, 임시직<T>을 입력하세요");
			String type = sc.next();
			if(type.equalsIgnoreCase("P")) {
				System.out.println("이름, 기본급여, 보너스를 입력하세요");
				String name = sc.next();
				int salary = sc.nextInt();
				int bonus = sc.nextInt();
				
				Employee e = new Permanent(name, salary, bonus);
				eArr[i] = e;
				Permanent p = (Permanent)e;
				System.out.println("고용형태 : " + p.getType());
				System.out.println("이름 : " + p.getName());
				System.out.println("급여 : " + p.getPay());
			}
			else if(type.equalsIgnoreCase("T")) {
				System.out.println("이름, 일한시간, 시간당급여 입력하세요");
				String name = sc.next();
				int time = sc.nextInt();
				int cost = sc.nextInt();
				
				Employee e = new Temporary(name, time, cost);
				eArr[i] = e;
				Temporary t = (Temporary)e;
				System.out.println("고용형태 : " + t.getType());
				System.out.println("이름 : " + t.getName());
				System.out.println("급여 : " + t.getPay());
			}
		}
	}

}
