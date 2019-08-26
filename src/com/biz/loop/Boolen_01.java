package com.biz.loop;

public class Boolen_01 {

	public static void main(String[] args) {

		boolean bYes = 3 == 3; // boolean 이면 true나 false만 저장 가능
		System.out.println(bYes); //true
		
		bYes = 4 == 4; //같냐? true
		bYes = 4 > 4; //보다 크냐? false
		bYes = 4 >= 4; // 같거나 크냐? true
		
		// 5가 5와 같거나(OR) 4가 4와 같냐?
		// || = OR
		bYes = 5 == 5 || 4 == 4; // true
		bYes = 5 > 5 || 4 == 4; // false or true = true
		bYes = 5 >= 5 || 4 > 4; // true or false = true
		
		// 5가 5와 같으며 4와 4가 같냐?
		// && = AND
		bYes = 5 == 5 && 4 == 4; // true
		bYes = 5 > 5 && 4 == 4; // false and true = false
		bYes = 5 >= 5 && 4 > 4; // true and false = false
		
		// 5가 4보다 작거나 같냐?
		bYes = 5 <= 4; // false
		bYes = 3 < 4; // true
		
		// 3과 4가 같지 않냐 (= 다르냐)?
		bYes = 3 != 4; // true 같지 않다를 다른 프로그램에서는 <>로 표현하기도
		System.out.println(bYes);
		
		int n = 1;
		n = n * -1; // -1
		n = n * -1; // 1
		n = n * -1; // -1
		n = n * -1; // 1
		
		// 현재 bYes 가 true 상태
		// NOT 연산, 원래 값을 반전
		// !를 NOT 연산이라 함 (NOT inverter), !tr = fa, !fa = tr 같은 형식
		// 한번 실행 될때마다,
		// true와 false가 반복
		bYes = !bYes; // false
		bYes = !bYes; // true
		bYes = !bYes; // false
		bYes = !bYes; // true
		bYes = !bYes; // false
		
		//
		
		/*
		 * == : 부울연산자	
		 * >,>=, 등등 관계연산자
		 * 
		 * tr : 1
		 * fa : 0
		 * 
		 * 가	A	B	+	*
		 * 0	0	0	0	0
		 * 0	0	1	1(tr)	0
		 * 0	1	0	1(tr)	0	OR연산은 1개라도 tr면 tr
		 * 0	1	1	1	1	ADN연산은 1개라도 fa면 fa
		 * 1	0	0	1	0
		 * 1	0	1	1	0
		 * 1	1	0	1	0
		 * 1	1	1	1	1
		 */
		
	}

}
