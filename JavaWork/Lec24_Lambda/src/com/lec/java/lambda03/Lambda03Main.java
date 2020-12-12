package com.lec.java.lambda03;
/*
	 세가지 방법으로 자유자재로 구현할수 있어야 합니다.
	 방법 1) 클래스 implements 인터페이스 + 오버라이딩.
	 방법 2) 익명클래스
	 방법 3) 람다 표현식 lambda expression
*/
public class Lambda03Main {

	public static void main(String[] args) {
		System.out.println("익명 클래스, 람다 표현식 연습");
		
		// 1) 클래스 implements 인터페이스 + 오버라이딩.
		System.out.println("1) 클래스 implements 인터페이스 + 오버라이딩을 이용하여 덧셈 연산하기");
		Add Test01 = new Add();
		double result = Test01.operate(20, 10);
		System.out.println("reslut = " + result);
		
		// 2) 익명클래스
		System.out.println();
		System.out.println("2) 익명클래스를 이용하여 뺄셈 연산");
		Operable Test02 = new Operable() {
			@Override
			public double operate(double x, double y) {
				return x - y;
			}
		};
		result = Test02.operate(20, 10);
		System.out.println("reslut = " + result);
		
		// 3) 람다 표현식 lambda expression
		System.out.println();
		System.out.println("3) 람다 표현식 lambda expression을 이용한 제곱연산");
		Operable Test03 = (x, y) -> Math.pow(x, y);
		result = Test03.operate(2, 3);
		System.out.println("result = " + result);
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class

// public은 항상 파일이름과 일치해야함
// 그러므로 interface에 public 붙이면 안됨
interface Operable {
	public abstract double operate(double x, double y);
}

class Add implements Operable {
	@Override
	public double operate(double x, double y) {
		return x + y;
	}
}