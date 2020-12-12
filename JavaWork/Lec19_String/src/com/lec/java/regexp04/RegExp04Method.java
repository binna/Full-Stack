package com.lec.java.regexp04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Ctrl + Shift + F : 이클립스 자동 들여쓰기 맞춤
public class RegExp04Method {

	// method name: view
	// return: void
	// arguments: 없음
	// 기능 : 화면 출력
	void view() {
		Scanner sc = new Scanner(System.in);

		// 쿠폰 번호 저장할 변수
		String coupon;

		// 1) 2자리-4자리-3자리-3자리
		String regex1 = "^..-....-...-...$";

		// 2) 알파벳두자리-숫자4자리-숫자3자리-알파벳3자리
		// 알파벳은 대소문자 구문 없슴
		// 숫자는 0으로 시작하면 안됨
		String regex2 = "^[a-zA-Z][a-zA-Z]-[1-9][0-9][0-9][0-9]-[1-9][0-9][0-9]-[a-zA-Z][a-zA-Z][a-zA-Z]$";

		while (true) {
			// 쿠폰번호를 계속해서 입력 받으면서
			System.out.print("쿠폰 번호를 입력하세요(종료 quit 입력) : ");
			coupon = inputChoice(sc);

			// 'quit' 입력하면 프로그램 종료
			if (coupon.equals("quit")) {
				break;
			}

			// 1) 2자리-4자리-3자리-3자리 조건에 충족하는지 확인하기
			if (couponJudge(regex1, coupon)) {
				// 1 조건이 충족하면 2 조건 판정결과 출력
				if (couponJudge(regex2, coupon)) {
					System.out.println("유효한 쿠폰입니다.");
				} else {
					System.out.println("유효한 쿠폰이 아닙니다.");
				}
			} else {
				System.out.println("2자리-4자리-3자리-3자리 조건에 충족하지 않습니다.");
			}
		} // end while()
	}

	// method name: inputChoice
	// return: String
	// arguments: Scanner sc (입력장치)
	public static String inputChoice(Scanner sc) {
		// 쿠폰번호 입력받기
		// [허용] Ab-7890-786-zuy ki-2010-893-Zip [불가] xX-1200-089-zuy p9-324-089-zopl
		// coupon = "p9-324-089-zopl";
		String coupon = sc.nextLine();

		// 사용자에게 입력 받은 쿠폰정보 메인으로 돌려주기
		return coupon;
	} // end inputChoice()

	// method name : couponJudge
	// return : boolean
	// arguments : String regex, String coupon
	// 기능 : 쿠폰의 조건이 유효한지 판정
	// 쿠폰의 조건에 적합하면 참, 적합하지 않으면 거짓값 리턴
	public static boolean couponJudge(String regex, String coupon) {
		boolean check = false;
		// Pattern 클래스의 pattern의 객체 생성
		// Regex(조건)을 coupon(입력 받은 문장)에서 컴파일(찾아서)하여 Pattern 객체로 생성
		Matcher matcher = Pattern.compile(regex).matcher(coupon);

		// find() : 패턴이 일치하면 true를 반환하고 그 위치로 이동
		// matches() : 패턴이 전체 문자열과 일치할 경우 true 반환
		if (matcher.matches()) {
			check = true;
		} else {
			check = false;
		}

		// 쿠폰 조건에 부합한지 판정한 결과를 메인에 넘겨줘야 함
		return check;
	} // end regExpTest()

} // end RegExp04Method
