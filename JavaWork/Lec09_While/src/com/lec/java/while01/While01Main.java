package com.lec.java.while01;
/*
 	조건식이 true 인 동안 while 블럭 반복
 	
 	while(조건식 true / false){
 		.. 
 		..
 	}
 */
public class While01Main {

	public static void main(String[] args) {
		System.out.println("while 반복문");
		
		int count = 1;	//초기식
		while(count <= 10) {	// 조건식
			System.out.println(count);
			count++;	//증감식
		} // end while
		
		System.out.println();
		count = 1;		//초기식
		while(count <= 10) {	// 조건식
			count++;		//증감식
			System.out.println(count);
		} // end while
		
		// 위의 두개의 while문을 통해 순서에 따라 결과값이 달라진다는 점을 알 수 있다..!!
		// 이것이 바로 알고리즘이다~
		
		System.out.println();
		// 10, 9, 8, ..., 1까지 출력
		count = 10;		// 초기식
		while(count >= 1) {	//조건식
			System.out.println(count);
			count--;	// 증감식
		} // end while
		System.out.println();
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class While01Main