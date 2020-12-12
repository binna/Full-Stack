package com.lec.java.array04;

import java.util.Scanner;
/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
 * 
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5];
		int sum = 0;
		double avg = 0.0;
		int max = 0, min = 0;
		
		for (int i = 0; i < number.length; i++) {
			System.out.println((i + 1) + "번째 정수 입력하시오 : ");
			number[i] = sc.nextInt();
			
			sum += number[i];
		}
		
		avg = (double)sum / number.length;
		
		max = number[0];
		min = number[0];
		
		for (int i = 1; i < number.length; i++) {
			
			if(max < number[i]) {
				max = number[i];
			}
			
			if(min > number[i]) {
				min = number[i];
			}
			
		}
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg + ", 최대값 : " + max + ", 최소값 : " + min);
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array04Main