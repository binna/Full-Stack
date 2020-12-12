package com.lec.java.exception04;
/*	예외 클래스의 상속 관계 (★필수 암기★)
	java.lang.Object
	|__ java.lang.Throwable
	  |
	  |__ java.lang.Exception  : 복구 가능
	  |    |
	  |    |__ java.lang.RuntimeException
	  |    |    |__ ArithmeticException, NullPointerException, ...
	  |    |
	  |    |__ IOException, ParseException ...
	  |
	  |__ java.lang.Error    : 복구 불가
	         ...   OutOfMemoryError, StackOverFlowError ...  
	
	 getMessage(), printStackTrace() 등의 메소드는 Throwable 클래스에 정의
	 자식 클래스들은 Throwable에 정의된 메소드들을 사용할 수 있음
	 
	catch문은 여러개를 사용할 수는 있지만, 
	 상위 예외 클래스를 하위 예외 클래스보다 먼저 사용할 수는 없다. (컴파일 에러) 
*/
public class Exception04Main {

	
	public static void main(String[] args) {
		System.out.println("try ~ catch ~ catch ");
		
		int num1 = 123, num2 = 10, result = 0;
		String str1 = null;
		String str = "abcd";
		int[] numbers = new int[10];

		// try ~ catch ~ catch .. 사용
		try {
			result = num1 / num2;
			System.out.println("나눈 결과: " + result);
			
			int length = str1.length();
			System.out.println("스트링 길이: " + length);
			
			str.charAt(20);	// java.lang.StringIndexOutOfBoundsException
							// catch 에서 걸리는 게 없으면 프로그램은 죽는다...!
			
			numbers[10] = 11111;
			System.out.println("numbers: " + numbers[10]);
			
		} catch(ArithmeticException ex) {
			System.out.println("산술 연산 예외 : " + ex.getMessage());
			
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("배열 인덱스 예외 : " + ex.getMessage());
			
		} catch(NullPointerException ex) {
			System.out.println("Null 포인터 : " + ex.getMessage());
			
		} 
			// 저 위에 있는 catch에 하나도 안걸리면 프로그램은 죽는다..!!
			// 프로그램 죽는 것을 방지하기 위해 저 위 처리되지 않은 나머지들은 너가 다 처리하라는 방법이 있다!
			// Exception....!!
			catch(Exception e) {
				// Exception은 모~든 Exception 들(상속된 예외 객체들까지도) catch 할 수 있다.
				// (다형성!)
				System.out.println("Exception 발생");
			}
		
		System.out.println();
		System.out.println("프로그램 종료");

	} // end main()

	
} // end class Exception04Main