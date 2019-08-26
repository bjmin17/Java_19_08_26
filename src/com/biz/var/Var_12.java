package com.biz.var;

public class Var_12 {

	public static void main(String[] args) {

		int nCount = 0;
		
		nCount = nCount + 1;
		System.out.println("카운트 1 : " + nCount); // 카운트 1 : 1
		
		nCount += 1;
		System.out.println("카운트 2 : " + nCount); // 카운트 2 : 2
		
		System.out.println("카운트 3 : " + (nCount++)); // 카운트 3 : 2 ,,, 3이 아닌 2가 나온 이유?
		// (상당히 중요한 개념) 실제코드는 다음과 같이 2번 실행된다.
		// System.out.println("카운트 3 : " + (nCount++));
		// nCount += 1;
		
		System.out.println("카운트 4 : " + nCount); // 카운트 4 : 3
		System.out.println("카운트 5 : " + (++nCount)); // 카운트 5 : 4
		// 실제코드는 다음과 같이 2번 실행
		// nCount += 1;
		// System.out.println("카운트 5 : " + (++nCount));
		
		
		
		
		
		int n = (nCount++) +1;
		// 실제 코드는 
		// int n = nCount + 1;
		// nCount += 1; 로 두줄로 나뉘어서 실행됨, 이후 nCount는 1씩 증가되는 것
		
	}

}
