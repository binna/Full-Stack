package com.lec.java.switch04;

public class Switch04Main {

	public static void main(String[] args) {
		System.out.println("String 타입을 switch에서 사용하기");
		
		// 문자열 비교 가능, 대신 대소문자 구분, 7버전부터 가능함
		String language = "C++";
		switch(language) {
		case "Java":
			System.out.println("Hello" + language);
			break;
		case "C++":
			System.out.println("good bye C++");
			break;
		case "Swift":
			System.out.println("Wow Swift");
			break;
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









