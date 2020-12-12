package com.lec.java.collection07;

import java.util.HashSet;
import java.util.Iterator;

public class Collection07Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// String 타입을 저장할 수 있는 HashSet 를 생성하고
		// 5개 이상의 데이터는 저장, 수정, 삭제 등의 동작을 해보고,
		// iterator, enhanced-for 문을 사용해서 출력해보기
		
		// String 타입을 저장할 수 있는 HashSet 인스턴스 생성
		HashSet<String> set = new HashSet<String>();
		
		// 데이터 저장
		System.out.println(set.add("안녕"));
		set.add("하세요");
		set.add("배고파");
		set.add("자고싶다");
		set.add("웃기다");
		set.add("치킨먹고싶다");
		set.add("방가방가");
		
		System.out.println();
		System.out.println("데이터 저장");
		System.out.println("데이터 개수 : " + set.size());
		
		System.out.println();	
		System.out.println(set);
		
		System.out.println();
		// 데이터 삭제
		set.remove("하세요");
		set.remove("자고싶다");

		System.out.println("삭제 후");
		System.out.println(set);
		
		// 1) iterator
		System.out.println("\n1) iterator");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 2) enhanced-for
		// enhanced for는 인덱스가 필요 없는 for문이기 때문에
		// set 타입의 자료형에서도 사용 가능
		System.out.println("\n2) enhanced-for");
		for(String e : set) {
			System.out.println(e);
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class