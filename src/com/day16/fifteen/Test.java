package com.day16.fifteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1.홍");
		list.add("2.김");
		list.add("3.이");
		list.add("4.박");
		list.add("5.정");

		Iterator<String> it = list.iterator(); // Iterator는 일회용이기 때문에 한번만 사용할 수 있음 

		System.out.println();
		while(it.hasNext()){
			System.out.println(it.next());
			//it.remove(); // 출력 후 삭제 
		}

		it = list.iterator(); // Iterator가 일회용이기 때문에 필요하면 다시 얻어와야 함 

		//forEachRemaining를 이용하여 while문을 아래처럼 한문장으로 바꿀 수 있음 

		System.out.println("====="); 
		it.forEachRemaining(n->System.out.println(n));// 람다식을 이용하는 메서드
		System.out.println(); 
		it = list.iterator();
		it.forEachRemaining(System.out::println);

		//default void forEachRemaining(Consumer<? super E> action) 
		/*      
		  it.forEachRemaining(new Consumer<T>() {
			@Override
			public void accept(T t) { 
			}
		}); 
		*/
		
		it = list.iterator();
		Map<String, String> map1 = new HashMap<>();
		it.forEachRemaining(name -> map1.put(name, name)); 
		System.out.println("\n"+map1+", size="+map1.size());
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		map.put(2, "oracle");
		map.put(3, "spring");
		
		map.forEach((k, v)-> System.out.println(k+":"+v)); 
		map.keySet().iterator()
		.forEachRemaining((k)-> System.out.println(k+":"+ map.get(k)));

		
		//Collection<String> Map.values()
		Optional<String> str = map.values().stream()
		.filter(s -> s.equals("spring")).findAny();
		
		if(str.isPresent()) {
		System.out.println("str="+str.get()); // spring 
		}
	}

}
