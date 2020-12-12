package com.lec.java.inherit01;

public class Inherit01Main {

	public static void main(String[] args) {
		System.out.println("상속(Inheritance) 을 사용하지 않는 경우");

		BasicTV tv1 = new BasicTV();
		tv1.isPowerOn = true;
		tv1.volume = 10;
		tv1.channel = 5;
		tv1.displayInfo();
		
		// 시대가 지나고
		// 새로운 TV가 나왔다!!!
		// 그것은 바로......!!!!!!!!!
		// SmartTV라는 기능이 생기고
		// 새로운 기능이 생겼다!!!
		// 그럴때는 어떻게 해야할까???
		
		System.out.println("\n프로그램 종료");
	} // end main()
} // end class










