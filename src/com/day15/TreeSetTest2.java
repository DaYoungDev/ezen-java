package com.day15;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name; 
	private int age;
	
	public Person(String name, int age) { 
		this.name=name;
		this.age=age; 
	}
	
	public String toString() {
		return "[Person : name=" + name +", age="+age+"]";
	} 
	
	@Override
	public int compareTo(Person p) {
		// return this.age - p.age
		
		if(this.age > p.age) {
			return 1;
		} else if(this.age < p.age) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Person> sTree=new TreeSet<Person>();
		sTree.add(new Person("홍길동", 20));  //실행 에러
		sTree.add(new Person("김길동", 17));
		sTree.add(new Person("정길수", 31));
		
		// Person 인스턴스가 TreeSet<E>에 저장될 때, 나이를 기준으로 정렬됨
		
		Iterator<Person> itr=sTree.iterator(); 
		while(itr.hasNext()){
			Person p = itr.next(); 
			System.out.println(p);
		}
		
		// TreeSet<E> 는 Person인스턴스가 저장될 때마다 기존에 저장된 인스턴스와의 비교를 위해서 
		// compareTo() 메서드를 빈번히 호출하여, 이때 반환되는 값을 기반으로 정렬을 진행
		
	}

}
