package com.lec.java.regexp05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* 대표적인 정규 표현식 
 *  구글링 하면 대표적인 정규표현식들이 많이 구할수 있습니다.
 *  각 정규표현식들을 작성해보고
 *	매칭되는 문자열과 그렇지 않은 것들을 출력해봅시다.   
 */
public class RegExp05Main {

	public static void main(String[] args) {
		System.out.println("많이 쓰는 정규표현식");

		String regex, intput, title;
		String [] arrInput;
		
//		//─────────────────────────────────────────
//		title = "URL";
//		regex = "https?://(\\w*:\\w*@)?[-\\w.]+(:\\d+)?(/([\\w/_.]*(\\?\\S+)?)?)?"; 
//		arrInput = new String[] {
//				"http://www.forta.com/blog",
//				"https://www.forta.com:80/blog/index.html",
//				"http://www.forta.com",
//				"http://ben:password@www.forta.com/",
//				"www.naver.com",
//				"http:.naver.com",
//				"naver.com"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);

//		//─────────────────────────────────────────
//		title = "email";
//		regex = "(\\w+\\.)*\\w+@(\\w+\\.)+[A-Za-z]+"; // 이메일 주소를 검사할 수 있지만 호스트 이름에 IP 주소가 들어간 경우는 불가능
//		arrInput = new String[] {
//			"every5116@naver.com",
//			"s1122324254@melon.com",
//			"every5116",
//			"qlsskwhddls123@daum.net"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);

//		//─────────────────────────────────────────
//		title = "주민등록번호";
//		regex = "^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$";
//		arrInput = new String[] {
//				"810404-1234567",
//				"940505-2123456",
//				"000606-3123456",
//				"000707-4561234",
//				"710808-5123456",
//				"310808-1123456",
//				"311301-1123456",
//				"311139-1123456"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);
		
//		//─────────────────────────────────────────
//		title = "날짜 YYYY-MM-DD";
//		regex = "^(19|20)\\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[0-1])$"; 
//		arrInput = new String[] {
//			"2019-01-01",
//			"1994-04-04",
//			"1996-13-04",
//			"1998-05-63"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);
		
//		//─────────────────────────────────────────
//		title = "자연수";
//		regex = "^[1-9][0-9]*$"; 
//		arrInput = new String[] {
//			"9",
//			"09",
//			"-1",
//			"10"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);

//		//─────────────────────────────────────────
//		title = "정수";
//		regex = "^(0|-?[1-9][0-9]*)$"; // TODO
//		arrInput = new String[] {
//				"123",
//				"-123",
//				"01234"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);

//		//─────────────────────────────────────────
//		title = "소수";
//		regex = "[0-9]*\\.[0-9]*"; // TODO
//		arrInput = new String[] {
//				"0.01",
//				"1.1",
//				"1234"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);

//		//─────────────────────────────────────────
//		title = "소숫점 둘째자리까지";
//		regex = "^[0-9]+(.[0-9]{2})?$";
//		arrInput = new String[] {
//				"0.15",
//				"1.56",
//				"1.567"
//		};
//		System.out.println(title);
//		regExpTest(regex, arrInput);

		//─────────────────────────────────────────
		title = "통화표시 (￦)";
		regex = "^(￦[1-9])[0-9]*$"; // TODO
		arrInput = new String[] {
			"￦",
			"￦1",
			"￦01",
			"￦100"
		};
		System.out.println(title); 
		regExpTest(regex, arrInput);

		System.out.println("프로그램 종료");

	} // end main()

	// 도우미 함수
	public static void regExpTest(String regex, String[] arrInput) {
		for (String input : arrInput)
			regExpTest(regex, input);
	}

	public static void regExpTest(String regex, String input) {
		System.out.println("[정규표현식 매칭 테스트]-----------------");
		System.out.println("정규표현식: " + regex);
		System.out.println("입력문자열: " + input);

		if(Pattern.matches(regex, input)) {
			System.out.println("   ●매칭●");
		} else {
			System.out.println("   Ⅹ매칭 없슴Ⅹ");
		}
		
		System.out.println();
	} // end regExpTest()

} // end class
