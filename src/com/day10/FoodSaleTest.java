package com.day10;

import java.util.Scanner;

class FoodSale{
	protected String menu;
	protected int count;
	protected int cost;
	protected int amount;
	protected static int totalAmount;

	FoodSale(String menu, int count, int cost){
		this.menu = menu;
		this.count = count;
		this.cost = cost;
	}

	public int findAmount() {
		amount = count * cost;
		return amount;
	}

	public int findTotalAmount() {
		totalAmount += findAmount();
		return totalAmount;
	}
}

class StudentFoodSale extends FoodSale{
	private int discount;
	private static int totalDiscount;

	StudentFoodSale(String menu, int count, int cost){
		super(menu, count, cost);
	}

	public int getTotalDiscount() {
		return totalDiscount;
	}

	public int findAmount() {
		discount = (int)(count * cost * 0.1);
		amount = super.findAmount();
		return amount - discount;
	}

	public int findTotalAmount() {
		totalDiscount += discount;
		return super.findTotalAmount();
	}
}
public class FoodSaleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴, 수량, 단가, 학생여부(Y/N)을 입력하세요!");
			String menu = sc.nextLine();
			int count = sc.nextInt();
			int cost = sc.nextInt();
			sc.nextLine();
			String studentCheck = sc.nextLine();
			
			if(studentCheck.equalsIgnoreCase("Y")) {
				StudentFoodSale s = new StudentFoodSale(menu, count, cost);
				int amount = s.findAmount();
				int totalAmount = s.findTotalAmount();
				int totalDiscount = s.getTotalDiscount();
				System.out.println("판매금액 = " + amount 
						+ ", 누적 판매금액 = " + totalAmount 
						+ ", 누적 할인금액 = " + totalDiscount);
			}
			else if(studentCheck.equalsIgnoreCase("N")) {
				FoodSale f = new FoodSale(menu, count, cost);
				int amount = f.findAmount();
				int totalAmount = f.findTotalAmount();
				System.out.println("판매금액 = " + amount 
						+ ", 누적 판매금액 = " + totalAmount);
			} else {
				System.out.println("잘못입력하였습니다.");
			}


			System.out.println("그만하시겠습니까? <Q>uit");
			String check = sc.nextLine();
			if(check.equalsIgnoreCase("Q")) {
				break;
			}
		}
	}

}
