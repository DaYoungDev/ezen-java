package com.day14.thirteen;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();

		list.add(new Member("hong", "홍길동"));
		list.add(new Member("kim", "김길동"));		
		Member m = new Member("lee", "이길동");
		list.add(m);

		Iterator<Member> iter=list.iterator();
		while(iter.hasNext()) {
			Member m2=iter.next();
			System.out.println(m2);
		}

		//vector
		Vector<Member> vec = new Vector<Member>(3);
		vec.add(new Member("aa", "정길동"));
		vec.add(new Member("bb", "강길동"));
		vec.add(new Member("cc", "유길동"));

		System.out.println("\n=============");
		Enumeration<Member> en=vec.elements();
		while(en.hasMoreElements()) {
			Member mem=en.nextElement();
			System.out.println(mem);
		}//while

	}

}
