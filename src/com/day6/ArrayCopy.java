package com.day6;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int [] copyArr = arr;
		
		arr[0]++;
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("copyArr[0] = " + copyArr[0]);
		
		/*
		 배열 변수의 복사
		 - 배열은 참조형이므로 배열복사하게 되면 같은 메모리 영역을 가리키게 됨
		 - 배열의 인스턴스는 복사되지 않음
		 */
		
		System.out.println(arr);
		System.out.println(copyArr);
		
		
		// 배열복사를 이용한 swap
		int[] arr2 = {1, 3, 5, 7, 9};
		int[] iArr = {20, 40, 60};
		
		System.out.println("arr2 주소 : " + arr2 +", iArr 주소 : " + iArr);
		
		// swap 주소값을 바꾸는 것
		int[] temp;
		temp = arr2;
		arr2 = iArr;
		iArr = temp;
		System.out.println("swap 후 arr2 주소 : " + arr2 +
				", iArr 주소 : " + iArr);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("\n\n=========iArr 요소=");
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
	}

}
