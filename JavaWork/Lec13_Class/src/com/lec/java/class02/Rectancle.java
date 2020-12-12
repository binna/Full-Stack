package com.lec.java.class02;

public class Rectancle {
	
	// 속성 : 멤버변수
	// 가로, 세로
	double width;
	double height;
	
	
	// 생성자 : 인스턴스 생성시 멤버변수들의 초기화
	// 1. 디폴트 생성자 : 매개변수가 없는 생성자
	public Rectancle() {
		System.out.println("Rectangle() 생성");
		width = 100;	// 디폴트 값 지정 가능
		height = 100;
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
	}
	
	// 2. 매개변수 가진 생성자
	public Rectancle(double w, double h) {
		System.out.println("Rectangle(w, h) 생성");
		width = w;	// 멤버 변수 초기화
		height = h;
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
	}

	
	//동작 : 멤버 메소드
	// 1) calcPerimeter : 사각형의 둘레
	public double calcPerimeter() {
		return (height + width) * 2;
	}
	
	// 2) calcArea : 사각형의 넓이
	public double calcArea() {
		return height * width;
	}
	
}














