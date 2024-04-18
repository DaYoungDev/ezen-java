package com.day14.thirteen;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("100-1","사과",1000));
		list.add(new Product("100-2","포도",2000));
		list.add(new Product("100-3","바나나",3000));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n======확장 for=====");
		for(Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("\n======배열 이용 =======");
		Product[] arr = new Product[3];
		arr[0] = new Product("100-1","사과",1000);
		arr[1] = new Product("100-2","포도",2000);
		arr[2] = new Product("100-3","바나나",3000);
		
		for(int i = 0; i < arr.length; i++) {
			String str = arr[i].toString();
			System.out.println(str);
		}
		
		System.out.println("\n======확장 for=====");
		for(Product pd : arr) {
			System.out.println(pd.toString());
		}
	}

}
