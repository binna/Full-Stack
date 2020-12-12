package com.mylib.entity;

public class Exam {
	int kor;
	int eng;
	int math;
	
	// 기본 생성자, 매개변수 생성자
	public Exam() {}
	public Exam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public final int getKor() {
		return kor;
	}
	public final void setKor(int kor) {
		this.kor = kor;
	}
	public final int getEng() {
		return eng;
	}
	public final void setEng(int eng) {
		this.eng = eng;
	}
	public final int getMath() {
		return math;
	}
	public final void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return String.format("Exam[국어:%d 영어:%d 수학:%d]", kor, eng, math);
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAvg() {
		return getTotal() / 3.0f;
	}
	
}