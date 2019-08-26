package com.biz.loop;

public class Loop_06 {

	public static void main(String[] args) {

		int nCount = 0;
		for(;nCount < 10;) {
			nCount ++;
			System.out.println(nCount);
		}
		System.out.println("카운트 : " + nCount); // 1~10까지 반복
		// for문 (;;)일때
		//오류발생, Unreachable Code,위 명령문이 무한 반복이라 실행불가
		
		// for (;nCount <10;) {} 이어도 대한민국 출력안됨,,, nCount만 세고 끝
		// for (;nCount < 10;) { nCount ++;} 이면 대한민국 출력

		nCount = 0;
		for(;nCount <= 10;) {
			nCount ++;
			System.out.println(nCount);
		}
		System.out.println("카운트 : " + nCount); // 1~ 11까지 11(번 반복)
		
		// nCount = 11;
		for(;nCount >= 0;) {
			nCount --;
			System.out.println(nCount); // 10 ~ -1 까지 출력
		}

		
	}

}
