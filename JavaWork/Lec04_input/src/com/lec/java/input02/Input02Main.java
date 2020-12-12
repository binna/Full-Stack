package com.lec.java.input02;

import java.util.Scanner;
// Ctrl + Shift + O : 자동 import

// 문자열(String) 입력
// char 입력
public class Input02Main {
	
	public static void main(String[] args) {
		System.out.println("표준입력 : String, char");
		
		Scanner sc = new Scanner(System.in);

//		// String 입력
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.nextLine();	// 엔터를 입력할때까지의 모~든 문자들을 문자열로 리턴
//		
//		System.out.print("별명을 입력하세요 : ");
//		String nick = sc.nextLine();
//		
//		//System.out.println("이름: " + name + "\n별명: " + nick);
//		
//		// char 입력
//		// .nextChar()이라는 명령 없다!
//		System.out.print("성별을 입력하세요 M/F : ");
//		char gender = sc.next().charAt(0);
//		System.out.println("이름: " + name + "\n별명: " + nick + "\n성별: " + gender);
//		
//		System.out.println();
		
		// 주소를 입력받지 않고 곧바로 출력이 되는 문제가 발생
		// 할 일이 많은 CPU는 실시간 처리하지 않는다. 
		// [그렇기 때문에] 사용자에게 입력받은 데이터를 키보드 버퍼에 저장해서 한 번에 처리를 한다
		// [ex] 8 8 공백
		// nextInt는 숫자만 빼감, 88 
		// nextLine는 남아 있는 공백을 가져감과 동시에 비어있는 문자열을 갖게 됨 
		// 그런 이유로 주소를 입력받지 않은 상태에서 바로 출력이 됨
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		// 숫자 입력 받은 뒤에 문자열 입력시에는 반드시 '\n'을 consume(버퍼에서 제거) 해야 한다.
		// 어떻게? sc.nextLine();를 이용
		sc.nextLine();
		
		System.out.println("주소를 입력하세요 : ");
		String addr = sc.nextLine();
		
		System.out.println("나이: " + age + "\n주소: " + addr);
		
		sc.close();
	} //end main()
	
} // end class