package com.hw.day8;

/*
- 컴퓨터가 랜덤하게 낸 가위바위보와 사용자가 입력한 가위바위보를 비교하여 누가 이겼는지 
결과를 알려주기
- 숫자를 랜덤하게 뽑아서
0 => 가위,  1=>바위,  2=>보
- 클래스 추상화하기
1) 특성
result. 결과값(이기다, 지다, 비기다)
user. 사용자가 선택한 값
com. 컴퓨터가 선택한 랜덤값
2) 기능
비교하다(사용자값과 컴퓨터값을 비교)

규칙 : (user-com+3) % 3 
=> 1: 이김,  2:짐,  0:비김
*/
import java.util.Scanner;

class GawiGameTest{
	public static void main(String[] args){
		//사용자가 선택한 값과 컴퓨터가 선택한 값을 찾는다
		int iuser=0, icom=0;

		while(true)	{
			System.out.println("가위(0), 바위(1), 보(2), Q(Quit)를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			String str  = sc.nextLine();//사용자가 선택한 값

			if (str.equalsIgnoreCase("Q"))	{
				break;  //while 빠져나가기
			}
			
			if(!str.equals("0") && !str.equals("1" ) && !str.equals("2")){
				System.out.println("다시 입력해주세요!");
				continue;
			}			

			iuser = Integer.parseInt(str);  //사용자가 선택한 값
			
			Gawi obj = new Gawi();
			icom = obj.findAnswer();   //컴퓨터가 선택한 값 (0~2)

			//가위바위보의 결과를 확인한다.
			obj.compare(iuser, icom);
			
			System.out.println("사용자 =" + obj.getUser());
			System.out.println("컴퓨터 = "+obj.getCom());
			System.out.println("결과 = 사용자가 "+obj.getResult());
			System.out.println("=======================================");
		}//while
	}//main	
}//class

class Gawi{
	//멤버변수
	private String result, user, com;

	//getter/setter
	public String getResult(){
		return result;
	}

	public String getUser(){
		return user;
	}

	public String getCom(){
		return com;
	}

	//메서드
	public void compare(int iuser, int icom){
		int temp = (iuser - icom + 3) % 3;

		if (temp==1){
			result = "이겼습니다";
		}else if(temp==2){
			result = "졌습니다";
		}else if(temp==0){
			result = "비겼습니다";
		}//if

		//가위, 바위, 보를 세팅한다.
		user = setString(iuser);
		com = setString(icom);
	}

	private String setString(int i){ //Gawi 클래스 내부에서만 사용하므로 private메서드로 작성
		//0 => 가위,  1=>바위,  2=>보 로 셋팅
		String temp = "";
		switch(i){
			case 0:
				temp = "가위";
				break;
			case 1:
				temp = "바위";
				break;
			case 2:
				temp = "보";
				break;
		} 
		return temp;
	}

	public int findAnswer()	{
		int answer = (int)(Math.random()*3);   //컴퓨터가 선택한 값 (0~2)
		return answer;
	}
}//class
