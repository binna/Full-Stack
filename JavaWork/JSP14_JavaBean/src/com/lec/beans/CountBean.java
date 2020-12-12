package com.lec.beans;

public class CountBean {
	private int cntNumber;
	
	public CountBean() {
		System.out.println("CountBean 생성!!");
	}
	
	// 자바빈은 getter, setter 이름이 중요함
	// getter, setter 이름으로 매칭됨
	public void setCount(int n) {
		cntNumber += n;	// 기존의 값에 더해진다.
	}
	
	public int getCount() {
		return cntNumber;
	}

}