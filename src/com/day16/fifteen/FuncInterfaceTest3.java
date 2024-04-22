package com.day16.fifteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.DoubleUnaryOperator;

public class FuncInterfaceTest3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < 7; i++) {
			list.add(i+1);
		}

		// 기존방법
		for(int n : list) {
			System.out.println(n);
		}

		System.out.println("\n========람다식 이용=======");
		list.forEach(n -> System.out.print(n + " "));
		System.out.println("\n==============");

		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		list.forEach(n -> System.out.print(n + " "));

		list.replaceAll(i -> i * 10);
		list.forEach(n -> System.out.print(n + " "));

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "oracle");
		map.put(3, "spring");

		//기존방법
		System.out.println("\n===========map====");
		Iterator<Integer> iter = map.keySet().iterator(); 
		while(iter.hasNext()) {
			int key=iter.next();
			String val=map.get(key);
			System.out.println(key+"=>"+val);
		}//while

		//람다식이용
		System.out.println("\n---------");
		map.forEach((k,v)->System.out.println(k+"=>"+v));
		// void HashMap.forEach(BiConsumer<? super Integer, ? super String> action)
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(11);
		set.add(13);
		set.add(19);

		//기존
		System.out.println("\n======set========");
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//
		System.out.println("\n--------");
		set.forEach(n->System.out.print(n + " "));
		// void Iterable.forEach(Consumer<? super Integer> action)

		// 메소드 참조
		System.out.println("\n===========");
		DoubleUnaryOperator oper = (n) -> Math.abs(n);
		System.out.println(oper.applyAsDouble(-5));
		
		oper = Math::abs; // 메소드 참조
		System.out.println(oper.applyAsDouble(-51));
		
		System.out.println("\n===========");
		set.forEach(System.out::print); // 메소드 참조
	}

}
