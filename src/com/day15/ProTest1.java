package com.day15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProTest1 {

	public static void main(String[] args) {
		Properties prop = new Properties(); 

		String inputFile = "text/input.txt";
		
		try {
			prop.load(new FileInputStream(inputFile));
		} catch(IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다."); 
			System.exit(0);
		}
		String name = prop.getProperty("name"); 
		String[] data = prop.getProperty("data").split(",");
		int max = 0;
		int min = 0;
		int sum = 0;

		for(int i=0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]); 
			if (i==0) max = min = intValue;
			
			if (max < intValue) {
				max = intValue;
			} else if (min > intValue) {
				min = intValue;
			}
			sum += intValue;
		}
		
		double avg = (double)sum/data.length;
		
		System.out.println("이름 :" + name);
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + Math.round(avg*100)/100.0); 
		
	}

}


