package com.day9;

public class Score {
	// 필드
	private int[] subject;
	
	// 생성자
	public Score(int[] subject) {
		this.subject = subject;
	}

	// getter / setter
	public int[] getSubject() {
		return subject;
	}

	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	
	// method
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < subject.length; i++) {
			sum += subject[i];
		}
		return sum;
	}
	
	public double avgScore() {
		return (double)sumScore() / subject.length;
		
	}
}
