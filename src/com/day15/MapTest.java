package com.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 HashMap : Map<k,v> 인터페이스를 구현하는 클래스
 - 키와 값을 쌍으로 하여 저장하는 자료구조
 - 키는 중복허용 안함
 - 값은 중복가능
 - 순서 유지되지 않음
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		
		// 저장
		map.put(3, "홍길동");
		map.put(8, "김길동");
		map.put(19, "이길동");
		
		System.out.println("8번학생 : " + map.get(8));
		
		map.remove(8); // 제거 - 키가 8인 데이터 삭제
		
		// 읽어오기
		//Set<Integer> kset = map.keySet();
		//Iterator<Integer> iter = kset.iterator();
		
		Iterator<Integer> keyItr = map.keySet().iterator();
		while(keyItr.hasNext()) {
			int key = keyItr.next();
			String value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
	}

}
