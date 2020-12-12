package com.lec.java.inherit07;

public class BusinessPerson extends Person {
	
	private String company;

	// getter & setter
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	
	// 메소드 재정의(Overriding)
	@Override
	public void showInfo() {
		super.showInfo();	// 부모의 기능을 그대로 받아서 쓸게요!!!
		System.out.println("회사 : " + company);
	}
	
	// 메소드 오버로딩(Overloading) 
	// 메소드 중복 정의 : 같은 이름으로 메소드를 매개변수 리스트를 달리하여 중복 정의
	// 즉, 이름이 같아도 메소드 signature 가 다르면 중복정의 가능.
	public void showInfo(int id) {
		System.out.println("id : " + id);
		showInfo();
	}
	
	// Person 클래스에 있는 whoAreYou()메소드는 final 메소드이기 때문에
	// 오버라이딩 불가..!!
//	@Override
//	public void whoAreYou() {
//		super.whoAreYou();
//		
//	}
	
	@Override
	public String toString() {
		return "BusinessPerson: " + getName() + " " + company;
	}

	
}









