package com.day16.fifteen;

import java.util.Optional;

class Member{
	private int no;
	private String name;
	
	Member(int no, String name){
		this.no=no;
		this.name=name;
	}
	
	public void showInfo() {
		System.out.println("번호:"+no);
		System.out.println("이름:"+name+"\n");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Member m = func1();
		if(m!=null) {
			m.showInfo();
		}
		
		Member m2 = func2();
		if(m2!=null) {
			m2.showInfo();
		}else {
			System.out.println("null!!!\n");
		}	
		
		Optional<Member> opt = func3();
		if(opt.isPresent()) {
			Member m3 =opt.get();
			m3.showInfo();
		}
	}
	
	public static Member func1() {
		Member m = new Member(1, "홍길동");
		return m;
	}
	
	public static Member func2() {
		Member m = null;
		return m;
	}
	
	public static Optional<Member> func3() {
		Member m = new Member(2, "김길동");		
		return Optional.ofNullable(m);
	}
	
}
