// 생성자의 목적: 인스턴스 생성시 멤버변수들의 초기화
package com.lec.java.inherit04;

public class Vehicle {
	
	int speed;
	
	// 1
	public Vehicle() {
		System.out.println("Vehicle() 생성");
	}
	
	// 2
	public Vehicle(int speed) {
		this.speed = speed;
		System.out.println("Vehicle(int) 생성 : speed = " + speed);
	}

	
}
