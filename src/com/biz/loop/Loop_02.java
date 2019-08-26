package com.biz.loop;

public class Loop_02 {

	public static void main(String[] args) {

		int nCount = 1;
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount); //6 x 2 =  12
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount); //6 x 3 =  18
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount); //6 x 4 =  24
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount);
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount);
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount);
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount);
		System.out.printf("%d x %d = %3d\n", 6, ++nCount, 6 * nCount);
		
		nCount = 2;
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++); //6 x 2 =  12
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++); //6 x 3 =  18
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++); 
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++);
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++);
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++);
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++);
		System.out.printf("%d x %d = %3d\n", 6, nCount, 6 * nCount++);
		
		// 선생님꺼
		nCount = 2;
		int nDan = 6;
		
		/*
		 * 6단 구구단 표시
		 * 조건 : nCount ++ 이용
		 */
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
		System.out.printf("%d x %d = %d\n", nDan, nCount, nCount++ * nDan);
	}

}
