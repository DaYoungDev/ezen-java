package com.day14.thirteen;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("Hong", "홍길동"));
		list.add(new Member("kim", "김길동"));
		
		Member m = new Member("lee", "이길동");
		list.add(m);
		
		for(int i = 0; i < list.size(); i++) {
			Member m2 = list.get(i);
			m2.showInfo();
			
			System.out.println(m2);
			System.out.println();
		}
		
		System.out.println("\n===========");
		for(Member m2 : list) {
			System.out.println(m2);
		}
		
	}

}
