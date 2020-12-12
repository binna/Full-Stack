package com.lec.java.string02;
/* String 생성자, String literal(상수)
 */
public class String02Main {

	public static void main(String[] args) {
		System.out.println("String 생성자, literal(상수)");
		
		int num1 = 1;
		int num2 = 1;
		
		if (num1 == num2) {
			System.out.println("같은 숫자");
		} else {
			System.out.println("다른 숫자");
		}
		
		System.out.println();
		System.out.println("[1] String literal 사용");
		// "Hello"는 literal이기 때문에, 한 번 만들어지면 재사용됨
		// 그래서, str1과 str2는 같은 곳(주소)에 있는 문자열 "Hello"를 가리키게 됨
		// 즉, str1과 str2에는 같은 값이 저장되게 됨
		// literal : 직접 입력 하는 값
		String str1 = "Hello";   
		String str2 = "Hello";

		// 주소를 비교한것..!!
		if(str1 == str2) {
			System.out.println("동일한 곳(문자열 ) 참조");
		} else {
			System.out.println("다른 곳(문자열) 참조");
		}
		
		// 동일한 리터럴은 중복되서 발생하지 않음  
		// 중복되서 만들어지면 메모리 낭비야 ㅜㅜ 
		// 그래서 위의 값이 참이 나온 이유
		
		
		System.out.println();
		System.out.println("[2] String 생성자 사용");
		// 생성자는 호출될 때마다 새로운 인스턴스를 힙에 생성하게 됨
		// str3과 str4는 서로 다른 인스턴스를 가리키게 됨
		// 즉, str3과 str4에는 서로 다른 값이 저장되게 됨
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		if(str3 == str4) {
			System.out.println("동일한 곳(문자열 ) 참조");
		} else {
			System.out.println("다른 곳(문자열) 참조");
		}
		
		System.out.println();
		System.out.println("[2-2] String intern() 결과 비교");
		// intern() String 객체가 실제로 참조하는 문자열 리턴
		System.out.println("\nstr3.intern() == str4.intern()");
		if(str3.intern() == str4.intern()) {
			System.out.println("intern() 동일한(문자열) 참조");
		} else {
			System.out.println("intern() 다른 곳(문자열) 참조");
		}
		
		System.out.println("\nstr1.intern() == str2.intern()");
		if(str1.intern() == str2.intern()) {
			System.out.println("intern() 동일한(문자열) 참조");
		} else {
			System.out.println("intern() 다른 곳(문자열) 참조");
		}
		
		System.out.println("\nstr1.intern() == str4.intern()");
		if(str1.intern() == str4.intern()) {
			System.out.println("intern() 동일한 (문자열) 참조");
		} else {
			System.out.println("intern() 다른 곳 (문자열) 참조");
		}

		
		// == 연산자는 실제 문자열이 같은 지 다른 지를 비교하는 것이 아니고,
		// 참조 변수(지역 변수) str3과 str4에 저장된 값(주소)가  같은 지 다른 지를 비교하는 것임.
		// 문자열 비교를 == 으로 하지 말것!!!!
				
		
		System.out.println();
		System.out.println("[3] String equals() 메소드");
		// 문자열 비교는 equals() 사용하자.  참고로 equals() 는 Object 의 메소드다.
		
		// 실제 안에 있는 값을 동일한지 하나 하나 비교함 
		if(str3.equals(str4)) {
			System.out.println("equals() 같은 문자열");
		} else {
			System.out.println("equals() 다른 문자열");
		}
		
		
		System.out.println();
		System.out.println("[4] String compareTo() 메소드");
		// compareTo() 는 두 문자열의 문자코드량 의 비교 (lexicographical comparison based on the Unicode value)
		// 이경우 유니코드 값을 비교하게 됨.
		
		System.out.println("compareTo(): " + str3.compareTo(str4));
		
		
		String str5 = "A";
		String str6 = "C";
		// 출력값 : A - C = -2
		System.out.println("compareTo(): " + str5.compareTo(str6));
		// 출력값 : C - A = 2
		System.out.println("compareTo(): " + str6.compareTo(str5));
		
		System.out.println();
		str5 = "AaAa";
		str6 = "aAaA";
		System.out.println("compareTo(): " + str5.compareTo(str6));
		System.out.println("compareTo(): " + str6.compareTo(str5));

		System.out.println();
		str5 = "xaAa";
		str6 = "xAaA";
		System.out.println("compareTo(): " + str5.compareTo(str6));
		System.out.println("compareTo(): " + str6.compareTo(str5));
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class