package com.lec.java.exception05;

import java.util.InputMismatchException;
import java.util.Scanner;
/*	multi-catch
		Java 7부터 하나의 catch문에서 여러개의 예외를 처리할 수 있는 방법을 제공
		절대로 같은 상속레벨의 exception 들만 multi-catch 하기.
	 
	finally
		 예외(exception) 발생 여부와 상관없이 항상 실행되어야 할
		 코드들은 finally 블록 안에서 작성.
		 즉, finally 블록 안에 있는 코드들은 항상 실행이 됨.
		 예외가 발생하지 않을 때에는 try 블록 안의 코드들이
		 모두 실행된 후에 finally 블록의 코드들이 실행
		 예외가 발생할 때는, 해당 catch 블록의 코드들이
		 실행된 후에 finally 블록의 코드들이 실행
		 
		(주의) 
		 try 블록이나 catch 블록 안에 return이 있더라도,
		 finally 블록 안의 코드들이 다 실행된 이후에
		 return이 실행되게 됨.

		(주의)
		 try블럭, catch블럭, finally 블럭등에서 두루두루
		  사용할 변수는 try블럭 전에 선언하고, 초기화 까지 하자.
		 
		  보통은 자원반납과 같은 것들을 할때 finally 활용
		  자원 : 키보드, 파일, 데이터베이스, 네트워크 ...

 */
public class Exception05Main {

	public static void main(String[] args) {
		System.out.println("multi-catch");
		// Java 7부터 하나의 catch문에서 여러개의 예외를 처리할 수 있는 방법을 제공
		// 절대로 같은 상속레벨의 exception 들만 multi-catch 하기.
		
		
		
		// 46번째 줄 str.length(); 문장에서 에러가 발생했고
		// 발생하자마자 catch로 넘거 갔기 때문에
		// 밑에 있는 47번째 줄 int n = 123 / 0; 에러는 실행하지 않는다..!!
		// multi-catch 사용하기
		try {
			String str = null;
			str.length();
			int n = 123 / 0;
		} catch(ArithmeticException 
				| NullPointerException 
				| ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
			
		}
		
		
		System.out.println();
		System.out.println("finally");
		

		// finally 사용하기
		// 1)
		System.out.println("\n1) finally는 예외가 발생하지 않아도 실행된다는 것을 증명");
		System.out.println("#1 try{} 직전");
		try {
			System.out.println("#2 try{} 시작");
			int[] numbers = new int[10];
			numbers[0] = 123;
			System.out.println("#3  try{} 종료");
			
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("#4 catch{}");
			System.out.println("예외메시지 : " + ex.getMessage());
		} finally {
			System.out.println("#5 finally {}");
		}
		System.out.println("#6 try{} 종료후");
		
		
		// 2)
		System.out.println("\n2) finally는 예외가 발생해도 실행된다는 것을 증명");
		System.out.println("#1 try{} 직전");
		try {
			System.out.println("#2 try{} 시작");
			int[] numbers = new int[10];
			numbers[10] = 123;
			System.out.println("#3  try{} 종료");
			
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("#4 catch{}");
			System.out.println("예외메시지 : " + ex.getMessage());
		} finally {
			System.out.println("#5 finally {}");
		}
		System.out.println("#6 try{} 종료후");
		
		
		// 3)
		System.out.println("\n3) finally는 실행 중간에 return이 있어도 실행된다는 것을 증명");
		System.out.println("#1 try{} 직전");
		try {
			System.out.println("#2 try{} 시작");
			int[] numbers = new int[10];
			numbers[10] = 123;
			System.out.println("#3  try{} 종료");
			
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("#4 catch{}");
			System.out.println("예외메시지 : " + ex.getMessage());
			
			return;
			
		} finally {
			System.out.println("#5 finally {}");
		}
		System.out.println("#6 try{} 종료후");
		
		
		// 4)
		System.out.println("\n4) NullPointerException 에러인데..!! catch에서 해당 에러는 잡지를 못함");
		System.out.println("결국 catch에서 에러를 잡지 못했기 때문에 프로그램이 죽었다...!!");
		System.out.println("#1 try{} 직전");
		try {
			System.out.println("#2 try{} 시작");
			String str = null;  str.length();
			int[] numbers = new int[10];
			numbers[10] = 123;
			System.out.println("#3 try{} 종료");
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("#4 catch{}");
			System.out.println("예외메세지 : " + ex.getMessage());
		} finally {
			System.out.println("#5 finally {}");
		}
		System.out.println("#6 try {} 종료후");
		
		
		
		// try블럭, catch블럭, finally 블럭등에서 두루두루
		// 사용할 변수는 try블럭 전에 선언하고, 초기화 까지 하자.

		// 보통은 자원반납과 같은 것들을 할때 finally 활용
		// 자원 : 키보드, 파일, 데이터베이스, 네트워크 ...

//		Scanner sc = new Scanner(System.in);
//
//		try {
//			System.out.println("정수 입력하세요");
//			sc.nextInt();
//			System.out.println("try블록 종료");
//		}catch(InputMismatchException ex) {
//			System.out.println("예외 메시지: " + ex.getMessage());
//			return;  // 설사 리턴하더라도
//		}finally {
//			System.out.println("finally 수행");
//			sc.close();  // 자원 반납하는 부분은 반드시 finally{} 에서 처리
//		}
		
		System.out.println();
		System.out.println("\n프로그램 종료...");

	} // end main

} // end class Exception05Main