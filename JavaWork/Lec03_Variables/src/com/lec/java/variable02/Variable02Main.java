package com.lec.java.variable02;

//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float(4바이트), double(8바이트)
//문자 타입: char(2바이트)
//논리 타입: boolean

public class Variable02Main {
	public static void main(String[] args) {
		System.out.println("정수타입 변수들");
		
		System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		byte num1 = -128;	//대입연산자가 convert 되는지 보고 convert한 뒤 대입한다
		byte num2 = 0;
		byte num3 = 123;
		//byte num4 = 1234;	// 에러: byte에 저장할 수 있는 크기를 넘어섬, Type mismatch: cannot convert from int to byte
		
		System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		short num5 = -12345;
		short num6 = 12345;
		//short num7 = 32768;	// 에러 : 저장할 수 있는 크기를 넘어섬, Type mismatch: cannot convert from int to short
		//short num8 = -32769;	// 에러 : 저장할 수 있는 크기를 넘어섬, Type mismatch: cannot convert from int to short
		
		System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		//int num9 = 9876543210;	// 에러 : The literal 9876543210 of type int is out of range
		//long num10 = 9876543210;	// 에러 : The literal 9876543210 of type int is out of range
									// 큰 것에서 작은 것을 담을 수 있으나 큰 값은 작은 값을 담을 수 없다.
		// 리터럴 : literal
		//  코드상에 직접 입력한 값들
		//   정수리터럴 --> int로 형변환 하려 한다
		//   실수리터럴 --> double로 형변환 하려 한다
		//   "~"리터럴 --> 문자열(String)로 형변환
		//   ...
		
		long num11 = 9876543210L;	// 뒤에 L을 붙여줌으로써 long형 literal이 되는 것임!
		long num12 = 12;			// 12는 convert가 가능해서 넣는게 가능함
		long num13 = 12L;
		//int num15 = 12L;			// long 타입을 int에 대입 불가, 큰 사이즈는 작은 사이즈에 대입 불가
									// Type mismatch: cannot convert from long to int
		
		// 값의 경계선
		byte num15 = Byte.MAX_VALUE;	//127
		byte num16 = (byte)(num15 + 1);
		System.out.println("num15 = " + num15);
		System.out.println("num16 = " + num16);	// 출력 : -128, overflow
		
		//2020.03.17
		// 정수표기법, 아래에 저장된 값은 전부 11임
		int number1 = 11;		// 10진수(Decimal)
		int number2 = 0xB;		// 16진수(Hexadecimal), 0x로 시작
		int number3 = 013;		// 8진수(Octal) :  0으로 시작
		int number4 = 0b1011; 	//2진수(Binary) : 0b로 시작
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number3 = " + number3);
		System.out.println("number4 = " + number4);
		
		// String.format()을 사용하여 원하는 포맷(진법)으로 출력 가능
											// String.format("%x", number1) -> number1을 16진수로 출력하라는 뜻
		System.out.println("number1 = " + String.format("%x", number1));
											//String.format("%o", number1) -> number1을 8진수로 출력하라는 뜻
		System.out.println("number1 = " + String.format("%o", number1));
		
		// Integer.toXxx(n)를 사용하여 원하는 포맷의 문자열로 변환 가능
		System.out.println("number1 = " + Integer.toHexString(number1));
		System.out.println("number1 = " + Integer.toOctalString(number1));
		System.out.println("number1 = " + Integer.toBinaryString(number1));
		
	} // end main()
} // end class