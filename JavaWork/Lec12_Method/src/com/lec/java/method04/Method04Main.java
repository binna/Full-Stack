package com.lec.java.method04;

import java.util.Scanner;
/*
 * 
 * public static double inputNumber(Scanner sc)
 * 
 * Scanner 객체를 매개변수로 받을수 있다.
 * (메소드 안에서 Scanner 객체를 생성할수는 있으나... 제대로 close() 되지 않은채 생성하면 문제 발생) 
 * 
 * 이클립스에서 함수 호출 위에서 F3 누르면 정의 로 넘어감
 */
public class Method04Main {

	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = inputNumber(sc);
		
		sc.close();
		
		System.out.println("num1 = " + num1);
		
		System.out.println("\n프로그램 종료");
	} // end main()
	

	// method name: inputNumber
	// return: double
	// arguments: Scanner sc - 키보드 입력을 위한 객체
	// 기능: 키보드로 입력받은 double형 데이터를 리턴
	//      0 ~ 100까지 이외의 범위는 다시 입력 받는 기능 추가
	public static double inputNumber(Scanner sc) {
		double result = 0.0;
		
		while(true) {
			System.out.print("숫자 입력(0 ~ 100) : ");
			
			result = sc.nextDouble();
			
			if(0 < 0.0 || 100.0 < result) {
				System.out.print("다시 입력해주세요 : ");
				continue;
			}
			break;
		}
		return result;
		
	}
	
} // end class









