package com.lec.java.string03;
/*  StringBuffer, StringBuilder

	 String 클래스는 immutable 클래스이고,
	 StringBuffer, StringBuilder는 mutable 클래스임


	 StringBuffer:
		Java ver 1.0부터 있던 클래스
		쓰레드에 안전(thread-safe), 속도가 느림
	
	 StringBuilder:
		Java 5부터 생긴 클래스
		쓰레드에 안전하지 않다(thread-unsafe), 속도가 빠름.
	
		그 외에는 StringBuffer와 StringBuilder는 같은 기능(메소드)을 갖고 있음
		

	** 웹 프로그래밍 등에선 문자열을 '붙여 나가며' 완성하는 동작을 많이 함
		실무에서는
			String 을 concat() (혹은 + 연산)하기 보다는
			StringBuffer 를 append() 하는 것을 더 많이 사용함  (성능 UP)
			
		※ 그러나 학습예제에선 예제단순화를 위해 String 을 기본적으로 사용하니 참조 바랍니다
 */
public class String03Main {
	
	// immutable : 변할 수 없는
	// mutable : 변할 수 있는

	public static void main(String[] args) {
		System.out.println("[1] StringBuffer, StringBuilder");
		// String 클래스는 immutable 클래스이고,
		// StringBuffer, StringBuilder는 mutable 클래스임
		
		System.out.println("[String: immutable]");

		String str1 = "Hello";
		String str2 = str1;
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		// 출력 값 : "== 동일 참조" 
		if(str1 == str2) {
			System.out.println("== 동일 참조");
		} else {
			System.out.println("== 다른 참조");
		}
		
		System.out.println(str1.concat("Java"));
		System.out.println(str1);	// str1이 실제로 변경되지 않는다. immutable...!!!
		// Heap에 저장된 [Hello Java] 값의 주소 값이 str1에 저장된다..!!
		str1 = str1.concat("Java");
		System.out.println(str1);
		
		//  출력 값 : == 다른 참조
		if(str1 == str2) {
			System.out.println("== 동일 참조");
		} else {
			System.out.println("== 다른 참조");
		}
		
		
		
		System.out.println();
		System.out.println("[StringBuffer: mutable]");
		
		StringBuffer buff1 = new StringBuffer("Hello");
		StringBuffer buff2 = buff1;

		System.out.println("buff1 = " + buff1);
		System.out.println("buff2 = " + buff2);
		
		// 주소 비교한 거
		if(buff1 == buff2) {
			System.out.println("== 동일 참조");
		} else {
			System.out.println("== 다른 참조");
		}
		
		System.out.println(buff1.append("Java"));
		System.out.println(buff1);	// buff1 값이 변경됨...!!! 이게 바로 mutable...!!!
		
		if(buff1 == buff2) {
			System.out.println("== 동일 참조");
		} else {
			System.out.println("== 다른 참조");
		}
		
		// 심지어 buff2도 값이 변경됬다...!!
		// 왜? 같은 곳을 레퍼런싱을 하고 있기 때문이다.
		System.out.println(buff2);
		
		
		
		// 성능은 StringBuffer가 더 좋음
		// 왜냐하면 StringBuffer는 append를 이용하여 직접 값을 변경하면 되지만
		// String은 concat을 이용하여 새롭게 만드는 과정이 필요하기 때문에 시간이 필요함
		// 그렇기 때문에 주로 실무에서는 StringBuffer를 더 많이 사용함
		
		
		
		// StringBuffer:
		//  Java ver 1.0부터 있던 클래스
		//  쓰레드에 안전(thread-safe), 속도가 느림
		
		// StringBuilder:
		// Java 5부터 생긴 클래스
		// 쓰레드에 안전하지 않다(thread-unsafe), 속도가 빠름.
		
		// 그 외에는 StringBuffer와 StringBuilder는 같은 기능을 갖고 있음
		
		System.out.println();
		StringBuilder buff3 = new StringBuilder("Hello");
		System.out.println(buff3.append("Java"));
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












