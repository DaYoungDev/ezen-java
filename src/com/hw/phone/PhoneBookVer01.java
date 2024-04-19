package com.hw.phone;
/*
 * 전화번호 관리 프로그램 
 * Version 0.1
 */

class PhoneBookVer01{
	public static void main(String[] args)	{
		PhoneInfo pInfo1=new PhoneInfo("홍길동", "010-100-2000", "99-01-17");
		PhoneInfo pInfo2=new PhoneInfo("김길동", "010-300-4000");

		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();		
	}
}