package com.biz.var;

public class Var_10 {

	public static void main(String[] args) {

		//복합 대입 연산자
		int num = 10;
		num = num + 20;  
		
		/*
		 * 보기에도 싫지 않고
		 * 메모리를 낭비 하지도 않는
		 * 	 연산 표시방법
		 */
		num += 20; // 복합 대입 연산자
		num += 30; // num = num + 30;
		num -= 55; // num = num - 55;
		num *= 15; // num = num * 15;
		num /= 22; // num = num / 22;
		num %= 20; // num = num % 20;
		
		
		
	}

}
