package com.day6;

public class HomeWork {
	// 약수의 갯수가 짝수이면 더하고, 홀수면 빼고
	public static int plusSolution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) { // 1
			if (i % Math.sqrt(i) == 0) { // 2
				answer -= i;
			} else {
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		/*

		1.
				자연수 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록

				3 ≤ n ≤ 1,000,000
				예)
				n	result
				10	3
				12	11
		 */
		int n = 12;
		int result = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 1) {
				result = i;
				break;
			}
		}
		System.out.println(result);


		/*
				2.
				문자열 my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록

				my_string은 대문자, 소문자, 공백으로 구성되어 있다.
				대문자와 소문자를 구분한다.
				공백(" ")도 하나의 문자로 구분한다.
				중복된 문자 중 가장 앞에 있는 문자를 남긴다.

				예)
				my_string			result
				"people"			"peol"
				"We are the world"	"We arthwold"

		 */
		String my_string = "people";
		String answer = "";

		for(int i=0; i<my_string.length(); i++){
			if(my_string.indexOf(my_string.charAt(i)) == i){
				answer += my_string.charAt(i);
			}
		}
		System.out.println(answer);


		/*
			 	3. 두 정수 left와 right가 매개변수로 주어진다. 
			 	left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
			 	약수의 개수가 홀수인 수는 뺀 수를 return 하도록 메서드 만들기

				1 ≤ left ≤ right ≤ 1,000
				예)
				left	right	result
				13		17		43
				24		27		52

				13부터 17까지의 수들의 약수를 모두 나타낸 것
				수	약수			약수의 개수
				13	1, 13			2
				14	1, 2, 7, 14		4
				15	1, 3, 5, 15		4
				16	1, 2, 4, 8, 16	5
				17	1, 17			2

				=> 13 + 14 + 15 - 16 + 17 = 43을 return

				24부터 27까지의 수들의 약수를 모두 나타낸 것
				수	약수							약수의 개수
				24	1, 2, 3, 4, 6, 8, 12, 24	8
				25	1, 5, 25					3
				26	1, 2, 13, 26				4
				27	1, 3, 9, 27					4

				=> 24 - 25 + 26 + 27 = 52를 return
		 */
		int left = 24, right = 27;
		int plusResult = plusSolution(left, right);

		/*	
				4.
				전화번호가 문자열 phone_number로 주어졌을 때, 
				전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴

				phone_number는 길이 4 이상, 20이하인 문자열
				예)
				phone_number	return
				"01033334444"	"*******4444"
				"027778888"		"*****8888"
		 */
		String phone_number = "01033334444";
		String last = phone_number.substring(phone_number.length() - 4, phone_number.length());
		String middle = phone_number.substring(0, phone_number.length() - 4);
		String ch = "";
		for(int i = 0; i < middle.length(); i++) {
			ch += middle.replace(middle, "*");
		}
		System.out.println(ch + last);


		/*
			 	5. 정수 배열 numbers가 주어지면, numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 
			 	더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 메서드 만들기

				numbers의 길이는 2 이상 100 이하이고,
				numbers의 모든 수는 0 이상 100 이하이다.

				입출력 예
				numbers		result
				[2,1,3,4,1]	[2,3,4,5,6,7]
				[5,0,2,7]	[2,5,7,9,12]
		 */




		/*
			6. 숫자놀이를 하고 있다. a가 b에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 
			b는 원래 숫자를 찾는 게임.

			다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시

			1478 → "one4seveneight"
			234567 → "23four5six7"
			10203 → "1zerotwozero3"
			이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 
			매개변수로 주어진다. s가 의미하는 원래 숫자를 return 하도록 메서드 만들기

			각 숫자에 대응되는 영단어는 다음 표와 같다.

			숫자	영단어
			0	zero
			1	one
			2	two
			3	three
			4	four
			5	five
			6	six
			7	seven
			8	eight
			9	nine

			s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않는다.

			예)
			s					result
			"one4seveneight"	1478
			"23four5six7"		234567
			"2three45sixseven"	234567
			"123"				123
		 */




		/*
				7.
				정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, 
				array에 n이 몇 개 있는 지

				예)
				array				n	result
				[1, 1, 2, 3, 4, 5]	1	2
				[0, 2, 3, 4]		1	0
		 */
		int[] arr1 = {1, 1, 2, 3, 4, 5};
		int c = 0;
		int n1 = 1;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == n1) {
				c++;
			}
		}
		System.out.println(c);
	}

}
