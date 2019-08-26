package com.biz.loop;

public class Loop_04 {

	public static void main(String[] args) {

		
		// for는 색깔 다르니 keyword이지만 특별히 괄호를 가짐,, for문(여러줄)
		// for가 시작되서{} 안의 명령문을 반복적으로 실행
		int nCount = 0;
		
		// for 문내의 두 번째 명령문은 boolen 식이 포함되며
		// boolen 식이 true 인 동안만 포함한 명령문들을
		// 반복실행한다.
		for( ; nCount < 10 ; ) {
			System.out.print("대한민국 : "); // 대한민국 반복됨, terminate라는 글자가 사라짐
			System.out.println(nCount++); // 숫자 무한으로 늘림
			
		}
		
	}

}
