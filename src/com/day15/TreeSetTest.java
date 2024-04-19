package com.day15;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> sTree=new TreeSet<Integer>();
		sTree.add(1);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(2); //저장될때마다 데이터가 정렬됨

		System.out.println("저장된 데이터 수: "+sTree.size());

		Iterator<Integer> itr=sTree.iterator(); //Iterator는 정렬된 데이터를 오름차순으로 참조함 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("\n=============");
		TreeSet<String> sTree2=new TreeSet<String>();
		sTree2.add("홍길동");
		sTree2.add("김길동");
		sTree2.add("정길수");
		sTree2.add("홍길동");
		sTree2.add("z");
		sTree2.add("b");
		sTree2.add("a");
		sTree2.add("X");
		sTree2.add("java");
		sTree2.add("D");
		sTree2.add("9");
		sTree2.add("4");
		
		Iterator<String> itr2=sTree2.iterator(); 
		
		while(itr2.hasNext()){
			String s = itr2.next(); 
			System.out.println(s);
		}

	}

}
