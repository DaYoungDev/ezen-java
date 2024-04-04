package com.day5;

public class MethodTest4 {
	public static int getSum(int count) //int count => 매개변수 
	{
		int sum=0; //지역변수
		for (int i=1;i<=count ;i++ ) //int i => 블럭변수 
		{
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int count=10;

		int sum = getSum(count);
		System.out.printf("1~ " + count + "까지의 합=" + sum);
		
		// main과 사용자정의 메소드의 변수는 각각의 지역변수이기 때문에
		// 이름을 같게 사용 가능한 것이다.
	}
}
