package com.lec.java.for02;

public class For02Main {

	public static void main(String[] args) {
		System.out.println("For문 - 구구단 출력");
		
		// 구구단 2단
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 X " + i + " = " + (2 * i));
			
		}
		
		// 구구단 4단
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			System.out.println("4 X " + i + " = " + (4 * i));
			
		}
		
		// 2 x 2 = 4
		// 3 x 3 = 9
		//...
		// 9 x 9 = 81
		System.out.println();
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + " x " + i + " = " + (i * i));
		} // end for
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class For02Main












