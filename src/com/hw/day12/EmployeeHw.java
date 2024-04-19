package com.hw.day12;

import java.util.Scanner;

abstract class Employee{	
	protected String name;

	public Employee(String name){
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName()	{
		return this.name;
	}

	abstract public int getPay();
	
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
}

class Permanent extends Employee{	
	private int salary; //기본급여
	private int bonus; //보너스

	public Permanent(String name, int salary, int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getPay(){
		return salary+bonus;
	}	

	public void showInfo() {
		super.showInfo();
		System.out.println("기본급여 : " + salary);
		System.out.println("보너스 : " + bonus);
	}

	public void printKind() {
		System.out.println("고용직입니다.");
	}
}

class Temporary extends Employee{	
	private int time; //일한시간
	private int pay;  //시간당 급여

	public Temporary(String name, int time, int pay)	{
		super(name);
		this.time = time;
		this.pay = pay;
	}

	public int getPay()	{
		return time*pay;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("일한시간 : " + time);
		System.out.println("시간당 급여 : " + pay);
	}

	public void printKind() {
		System.out.println("임시직입니다.");
	}
}

public class EmployeeHw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직(P), 임시직(T)을 입력하세요");
		String empType = sc.nextLine();
		String name = null, etype="";
		int salary = 0,bonus=0,time = 0,pay = 0;

		Employee obj=null;
		if (empType.toUpperCase().equals("P")){
			System.out.println("이름, 기본급여, 보너스를 입력하세요");
			name = sc.nextLine();
			salary = sc.nextInt();
			bonus = sc.nextInt();
			etype = "고용직";
			obj = new Permanent(name, salary, bonus);
		}else if (empType.toUpperCase().equals("T")){
			System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
			name = sc.nextLine();
			time = sc.nextInt();
			pay = sc.nextInt();

			obj= new Temporary(name, time, pay);
			etype = "임시직";
		}

		System.out.println("고용형태:"+etype);
		System.out.println("이름:"+obj.getName());
		System.out.println("급여:"+obj.getPay());

		//
		Employee[] arr = new Employee[3];
		arr[0]= new Permanent("홍길동", 2500000, 300000);
		arr[1]= new Temporary("김길동", 100, 20000);
		arr[2]= new Permanent("이길동", 4500000, 500000);		

		System.out.println("\n=======================");
		for(int i = 0; i < arr.length; i++) {
			arr[i].showInfo();			
			System.out.println("급여 : "+arr[i].getPay()+"\n");
		}
		
		System.out.println("\n--------확장 for-------");
		for(Employee e : arr) {
			e.showInfo();			
			System.out.println("급여 : "+e.getPay()+"\n");
		}
		
		System.out.println("\n=================자식메서드=================");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Permanent) {
				Permanent p = (Permanent)arr[i];
				p.printKind();
			}else if(arr[i] instanceof Temporary) {
				Temporary tm = (Temporary)arr[i];
				tm.printKind();
			}
		}

		System.out.println("\n=================자식메서드 확장 for=================");
		for(Employee e : arr) {
			if (e instanceof Permanent) {
				Permanent p = (Permanent)e;
				p.printKind();
			}else if(e instanceof Temporary) {
				Temporary tm = (Temporary)e;
				tm.printKind();
			}
		}//for
		
	}

}