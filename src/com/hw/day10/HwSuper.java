package com.hw.day10;

import java.util.Scanner;

class FoodSales{
	//멤버변수
	protected String menu;  
	protected int quantity, price, salesPrice;
	
	//static변수
	protected static int totalSalesPrice;

	//생성자
	public FoodSales(String menu, int quantity, int price){
		this.menu = menu;
		this.quantity = quantity;
		this.price = price;
	}

	public int getSalesPrice(){
		return salesPrice;
	}

	public static int getTotalSalesPrice(){
		return totalSalesPrice;
	}
	
	//메서드
	public void findSalesPrice(){
		salesPrice = price*quantity;
	}

	public void findTotal(){
		//누적하기
		totalSalesPrice += salesPrice;
	}	
}

class StudentFoodSales  extends FoodSales{
	private int discount;

	//static변수
	private static int totalDiscount;
	private static final double DISCOUNT_RATE=0.1;

	//생성자
	public StudentFoodSales(String menu, int quantity, int price){
		super(menu, quantity, price);
	}

	public static int getTotalDiscount(){
		return totalDiscount;
	}
	
	//메서드
	public void findSalesPrice(){
		discount = (int)(price*quantity*DISCOUNT_RATE);
		salesPrice = price*quantity-discount;
	}

	public void findTotal(){
		//누적하기
		super.findTotal();

		totalDiscount += discount;
	}	
}

class HwSuper{
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);

		while(true)	{
			System.out.println("메뉴, 수량, 단가, 학생여부(Y/N)를 입력하세요!");
			String menu = sc.nextLine();
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			sc.nextLine();
			String studentYn = sc.nextLine();

			if (studentYn.equalsIgnoreCase("Y")){
				StudentFoodSales obj = new StudentFoodSales(menu, quantity, price);
				obj.findSalesPrice();
				obj.findTotal();

				System.out.println("판매금액=" + obj.getSalesPrice() + ", 누적판매금액="
					 + StudentFoodSales.getTotalSalesPrice()
					 + ", 누적할인금액=" + StudentFoodSales.getTotalDiscount());
			}else if (studentYn.toUpperCase().equals("N")){
				FoodSales obj = new FoodSales(menu, quantity, price);
				obj.findSalesPrice();
				obj.findTotal();

				System.out.println("판매금액=" + obj.getSalesPrice() 
					+ ", 누적판매금액=" + FoodSales.getTotalSalesPrice());
			}else{
				System.out.println("잘못입력!! 다시입력!!");
				continue;
			}//if

			System.out.println("그만하시겠습니까?(Q)uit");
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("Q")){
				break;
			}//if
		}//while

	}
}
