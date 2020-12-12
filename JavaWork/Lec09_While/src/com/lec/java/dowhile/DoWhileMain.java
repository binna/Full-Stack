package com.lec.java.dowhile;
/*
	do {
		...
		...
	}while(조건식) 문인 경우에는,

	{...} 안에 있는 실행문들을 한번은 실행을 하고 나서
	조건식을 검사하게 된다.
*/
public class DoWhileMain {

	public static void main(String[] args) {
		System.out.println("while문 연습");
		
		int n = 0;
		while(n > 0) {
			// 조건이 false이기 때문에 한 번도 실행 안한다
			System.out.println("카운트다운(while) : " + n);
			n--;
		}

		n = 0;
		do {
			// 조건이 false라도 무조건 한 번 실행
			System.out.println("카운트다운(do~while) : " + n);
			n--;
		} while(n > 0);
		
		// 구구단 9단을 do~while로 출력
		System.out.println();
		int num = 1;
		do {
			System.out.println("9 x " + num + " = " + (9 * num));
			num++;
		} while (num <= 9);
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class While04Main