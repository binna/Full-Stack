package com.lec.java.inherit02;

// BasicTV
//   └SmartTV
public class SmartTV extends BasicTV {
	String ip;
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("IP주소: " + ip);
	}
	
}
