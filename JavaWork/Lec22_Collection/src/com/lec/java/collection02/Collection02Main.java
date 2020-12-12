package com.lec.java.collection02;

import java.util.ArrayList;

public class Collection02Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		
		// String 타입을 담는 ArrayList를 만들고
		ArrayList<String> list1 = new ArrayList<String>();
		
		// 5개 이상의 String을 저장하고
		list1.add("안녕");
		list1.add("하세요.");
		list1.add("반갑");
		list1.add("습니다.");
		list1.add("shine");
		list1.add("입니다.");
		
		System.out.println("5개의 자료를 추가한 뒤...");
		list1.forEach(System.out::println);
		
		// set(), remove() 등의 메소드 사용하여
		// 임의의 것을 수정, 삭제 도 해보시고
		list1.set(2, "방가 방가~");
		list1.add(4, "예쁘고 귀여운!!!!");
		list1.set(6, "샤인");
		list1.remove(3);
		
		System.out.println("\n수정, 삭제해보기...");
		list1.forEach(System.out::println);
		
		
		// 3가지 방식으로 출력해보세요
		//  for, Enhanced-for, Iterator
		// 1) for
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// 2) Enhanced-for
		for(String e : list1) {
			System.out.println(e);
		}

		// 3) Iterator
		

		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












