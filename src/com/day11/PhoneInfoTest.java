package com.day11;

import java.util.Scanner;

class PhoneInfo{
	protected String name;
	protected String phoneNumber;

	PhoneInfo(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	public String getNumber() {
		return phoneNumber;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
	}

}

class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int year;

	PhoneUnivInfo(String name, String phonenumber, String major, int year){
		super(name, phonenumber);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}
	public int getYear() {
		return year;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
		System.out.println("학번 : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo{
	private String company;

	public PhoneCompanyInfo(String name, String phonenumber, String company) {
		super(name, phonenumber);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("회사 : " + company);
	}

}

public class PhoneInfoTest {

	public static PhoneInfo push(int type) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo p = new PhoneInfo(null, null);
		if (type == 1) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("전화번호 :");
			String number = sc.next();
			p = new PhoneInfo(name, number);
		} else if (type == 2) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("전화번호 :");
			String number = sc.next();
			System.out.print("전공 : ");
			String major = sc.next();
			System.out.print("학번 : ");
			int year = sc.nextInt();
			p = new PhoneUnivInfo(name, number, major, year);
		} else if (type == 3) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("전화번호 :");
			String number = sc.next();
			System.out.print("회사 : ");
			String company = sc.next();
			p = new PhoneCompanyInfo(name, number, company);
		}

		return p;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo[] phoneArr = new PhoneInfo[5];
		int idx = 0;
		PhoneInfo p = new PhoneInfo(null, null);

		while(true) {
			System.out.println("선택하세요");
			System.out.println("1.저장 2.조회 3.검색 4.삭제 5.종료");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("데이터 입력을 시작합니다.");
				System.out.println("1.일반, 2.대학, 3.회사");
				int type = sc.nextInt();
				System.out.println("선택 >> " + type);
				p = push(type);
				phoneArr[idx++] = p;
				System.out.println("데이터입력이 완료 되었습니다.");
			} 
			else if(choice == 2) {
				System.out.println("====전체 데이터 조회 ===");
				for(int i = 0; i < idx; i++) {
					phoneArr[i].showInfo();
					System.out.println();
				}
				System.out.println("============");
			}
			else if(choice == 3) {
				System.out.println("데이터 검색을 시작합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				for(int i = 0; i < idx; i++) {
					if(phoneArr[i].getName().equals(name)) {
						phoneArr[i].showInfo();
						System.out.println();
					}
				}
				System.out.println("데이터 검색이 완료되었습니다.");
			}
			else if(choice == 4) {
				System.out.println("데이터 삭제를 시작합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				for(int i = 0; i < idx; i++) {
					if(phoneArr[i].getName().equals(name)) {
						for(int j = i; j < idx -1; j++) {
							phoneArr[j] = phoneArr[j+1];
						}
						idx--;
					}
				}
				System.out.println("삭제가 완료 되었습니다.");
			}
			else if(choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

}
