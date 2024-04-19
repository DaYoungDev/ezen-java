package com.hw.phone;

/*
 * 전화번호 관리 프로그램
 * Version 0.5
 * 예외 처리
 */

import java.util.Scanner;

class MenuChoiceException extends Exception{
	int wrongChoice;
	
	public MenuChoiceException(int choice)	{
		super(choice+"에 해당하는 선택은 존재하지 않습니다.");
	}

}

class PhoneBookManager3{
	Scanner sc=new Scanner(System.in);

	final int MAX_CNT=100;
	PhoneInfo[] infoStorage=new PhoneInfo[MAX_CNT];
	int curCnt=0;
	
	private PhoneInfo readFriendInfo()	{
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo()	{
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("전공: ");
		String major=sc.nextLine();
		System.out.print("학년: ");
		int year=sc.nextInt();
		sc.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo()	{
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("회사: ");
		String company=sc.nextLine();
		return new PhoneCompanyInfo(name, phone, company);	
	}	
	
	public void inputData() throws MenuChoiceException	{
		if (curCnt==MAX_CNT){
			System.out.println("\n더 이상 데이터를 입력할 수 없습니다!!\n");
			return;
		}

		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
		int choice=sc.nextInt();
		sc.nextLine();
		PhoneInfo info=null;
		
		if(choice<1 || choice>3)
			throw new MenuChoiceException(choice);

		switch(choice){
			case 1:
				info=readFriendInfo();
				break;
			case 2:
				info=readUnivFriendInfo();
				break;
			case 3:
				info=readCompanyFriendInfo();
				break;			
		}
		
		infoStorage[curCnt++]=info;
		System.out.println("데이터 입력이 완료되었습니다. \n");		
	}
	
	public void searchData(){
		System.out.println("데이터 검색을 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		int dataIdx=search(name);
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}else{
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}
	
	public void deleteData(){
		System.out.println("데이터 삭제를 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		int dataIdx=search(name);
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}else{
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx]=infoStorage[idx+1];
			
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}
	
	private int search(String name){
		for(int idx=0; idx<curCnt; idx++){
			PhoneInfo curInfo=infoStorage[idx];
			if(name.equals(curInfo.getName()))
				return idx;
		}
		return -1;
	}

	public void queryAllData(){
		if (curCnt==0){
			System.out.println("데이터가 존재하지 않습니다.\n\n");
			return;
		}

		System.out.println("----------전체 데이터 조회----------");
		for(int i=0; i<curCnt; i++)	{
			infoStorage[i].showPhoneInfo();
			System.out.println();
		}//for
		System.out.println("--------------------------------------- \n");
	}

	public  void showMenu(){
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체 데이터 조회");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 데이터 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택: ");
	}
}


class PhoneBookVer05{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PhoneBookManager3 manager=new PhoneBookManager3();
		int choice=0;
		
		while(true)	{
			try	{
				manager.showMenu();
				choice=sc.nextInt();
				sc.nextLine();	
				
				if(choice<1 || choice>5)
					throw new MenuChoiceException(choice);

				switch(choice){
					case 1:
						manager.inputData();
						break;
					case 2:
						manager.queryAllData();
						break;
					case 3:
						manager.searchData();
						break;
					case 4:
						manager.deleteData();
						break;				
					case 5:
						System.out.println("프로그램을 종료합니다.");
						return;					
				}
			}catch(MenuChoiceException e)	{
				System.out.println(e.getMessage());
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n");
			}//try
		}//while

	}
}