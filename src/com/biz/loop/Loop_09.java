package com.biz.loop;

public class Loop_09 {

	public static void main(String[] args) {

		/*
		 * 표준 for 반복문의 실행구조
		 * 1. int i = 0 : 카운트 변수 초기화 최초 1번만 실행
		 * 2. i < 10 : 카운트변수(i) 값을 범위조건과 비교, 참이면 명령실행
		 * 3. 참이면 system.out.println(i) 명령문 실행
		 * 4. i++ : 카운트 변수 1증가
		 * 
		 *  1~4까지 i < 10 이 true 인 동안 반복 실행
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i); //i가 0~9까지,, i++가 ++ 있어서 제일 마지막에 끝남
			
		}
		
		System.out.println("=================");
		int sum = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i); // 1~10
			sum += i; // sum = sum + i, 1부터 10까지 나옴
		}
		System.out.println("1~10까지 덧셈 : " + sum); //1~10까지 덧셈 : 55
		
		//for문 없이 10까지 더하기
		sum = 0;
		int i = 1;
		
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		
	}

}
