package com.lec.java.collection10;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 연습");
		
		// String 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// 5개 이상의 데이터를 저장해보고
		// 오름차순, 내림차순으로 출력해보기
		TreeSet<String> tset = new TreeSet<String>();
		
		// 데이터 저장
		tset.add("안녕");
		tset.add("자바공부");
		tset.add("하고 있어");
		tset.add("오늘도");
		tset.add("알찬");
		tset.add("수업시간이구나!");
		tset.add("치킨 먹고 싶다ㅜ^ㅜ");
		
		
		// 오름차순으로 출력하기 - Iterator
		System.out.println("\n오름차순으로 출력");
		Iterator<String> itr = tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 내림차순으로 출력하기
		System.out.println("\n\n내림차순으로 출력");
		Iterator<String> itr2 = tset.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class