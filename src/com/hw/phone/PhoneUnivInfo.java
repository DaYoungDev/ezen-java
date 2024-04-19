package com.hw.phone;

public class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int year;	
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year){
		super(name, phoneNumber);
		this.major=major;
		this.year=year;
	}
	
	public void showPhoneInfo()	{
		super.showPhoneInfo();
		System.out.println("major: "+major);
		System.out.println("year: "+year);
	}
}