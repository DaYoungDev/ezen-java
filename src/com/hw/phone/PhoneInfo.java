package com.hw.phone;

public class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birth;

	public PhoneInfo(){	
	}
	
	public PhoneInfo(String name, String phoneNumber, String birth){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=birth;
	}

	public PhoneInfo(String name, String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}

	public String getName(){
		return name;
	}

	public void showPhoneInfo()	{
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);

		if(birth!=null && !birth.isEmpty())
			System.out.println("birth: "+birth);

		System.out.println();	// 데이터 구분을 위해
	}
}
