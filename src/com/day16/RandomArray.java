package com.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("배열의 개수를 입력하세요(짝수로)");
			int length = sc.nextInt();

			ArrayList<Integer> arr = new ArrayList<Integer>(length);
			int half = length / 2;
			for(int i = 0; i < length; i++) {
				arr.add((int)(Math.random() * half));
			}
			for(int i : arr) {
				System.out.print(i + " ");
			}

			System.out.println("\nQuit?(Y/N)");
			String type = sc.next();
			if(type.equalsIgnoreCase("Y")) {
				break;
			}
		}
	}

}
