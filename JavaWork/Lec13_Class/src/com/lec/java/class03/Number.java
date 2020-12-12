package com.lec.java.class03;

public class Number {
	// 멤버변수
	private int num;
	private char ch;
	
	
	// 생성자
	// 1) 디폴트 생성자
	public Number() {}
	
	// 2) 매개변수 있는 생성자
	public Number(int num, char ch) {
		// 이제부터 num은 지역변수 num
		// 즉, 생성자를 통해 입력받은 매개변수 num이란 소리!
		// 그렇기 때문에 멤버변수 num에게 접근하려면 this를 이용!
		this.num = num;	// this : 자기 자신(인스턴스)를 가리킴
		this.ch = ch;
	}
	
	
	// 메소드
	// getter: 멤버 변수의 값을 리턴해 주는 메소드
	// setter: 멤버 변수의 값을 변경해 줄 수 있는 메소드
	
	// 일반적인 작명 관례
	// get변수이름()
	// set변수이름()
	// Camel notation 적용
	
	// 1) 멤버변수 Num의 getter, setter
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		if(num >= 0) {
			this.num = num;
		}
	}

	// 2) 멤버변수 ch의 getter, setter
	public int getCh() {
		return this.ch;
	}
	
	public void setCh(char ch) {
		this.ch = ch;
	}

}