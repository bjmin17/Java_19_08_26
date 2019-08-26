package com.biz.loop;

public class Loop_01 {

	public static void main(String[] args) {

		int nCount = 0 ;
		System.out.println("카운트 : " + nCount++); // 카운트 : 0 
		System.out.println("카운트 : " + nCount++); // 카운트 : 1
		System.out.println("카운트 : " + nCount++); // 카운트 : 2
		System.out.println("카운트 : " + nCount++); // 카운트 : 3
		System.out.println("카운트 : " + nCount++); // 카운트 : 4
		System.out.println("카운트 : " + nCount++); // 카운트 : 5
		System.out.println("카운트 : " + nCount++); // 카운트 : 6
		
		
		System.out.println("=======================");
		System.out.printf("%d x %d = %d\n",
				3, nCount, nCount++ * 3); //3 x 7 = 21
		System.out.printf("%d x %d = %d\n",
				3, nCount, nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3, nCount, nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3, nCount, nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3, nCount, nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3, nCount, nCount++ * 3);
		
		
	}

}
