package com.lec.java.while03;

public class While03Main {

	public static void main(String[] args) {
		System.out.println("while 연습");
		
		// 1 ~ 10까지 수 중에서 홀수만 출력
		int n = 1;
		while (n <= 10) {
			if (n % 2 == 1) {
				System.out.println(n);
			} // end if

			n++;
		} // end while
		
		System.out.println("\nif 사용 안하기");
		n = 1;
		while (n <= 10) {
			System.out.println(n);
			n += 2;
		} // end while
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class While03Main