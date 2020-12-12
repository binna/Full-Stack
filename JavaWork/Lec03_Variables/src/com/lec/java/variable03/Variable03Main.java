package com.lec.java.variable03;

//실수형 자료 타입: float(4바이트), double(8바이트)
//정수형 자료 타입의 기본형은 int
//실수형 자료 타입의 기본형은 double

public class Variable03Main {
	public static void main(String[] args) {
		System.out.println("변수 - 실수타입");
		
		double number1 = 3.141592;
		//float number2 = 3.14;	// 기본적으로 실수 리터럴은 double로 인식, Type mismatch: cannot convert from double to float
		// float <- double 대입 불가
		
		// float 리터럴
		float number3 = 3.14f;
		
		// 실수 타입 최소값, 최대값
		// 실수 타입의 최소값의 개념은? 1보다 작고 0보다 큰(즉, 얼마나 많이 표현할 수 있느냐가 중요)

		System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
		
		// 실수는 정확한 값을 기대하면 안된다
		// float와 double은 저장할 수 있는 값의 크기만이 아니라
		// 소숫점 이하 정밀도(precision)의 차이가 있다.
		float number4 = 1.23456789f;
		double number5 = 1.23456789;
		System.out.println("number4 = " + number4);
		System.out.println("number5 = " + number5);
		
		// 실수 표기법
		double number6 = 123;		// 123은 int가 double로 자동형변환 된다!
		double number7 = 1.23e2;	// 지수표기법(exponential notation)
		System.out.println("number6 : " + number6);
		System.out.println("number7 : " + number7);

		double number8 = 0.0001213;
		double number9 = 1.213E-4;
		System.out.println("number8 : " + number8);
		System.out.println("number9 : " + number9);
		
	} // end main
} //end class